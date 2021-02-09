package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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
        input.sendKeys(text);
        btn.submit();
    }

    public boolean isLogoVisible(){
        return logo.isDisplayed();
    }

}
