package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.BasePage;

public class UrlShortenerPage extends BasePage {
    public UrlShortenerPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "header")
    WebElement logo;

    @FindBy(id = "input_text")
    WebElement input;

    @FindBy(id = "send_btn")
    WebElement btn;

    public void testUrlShortener(String text){
        waitForElementToAppear(logo);
        Assert.assertTrue(logo.isDisplayed());
        input.sendKeys(text);
        btn.submit();
    }

}
