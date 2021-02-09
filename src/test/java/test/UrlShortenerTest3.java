package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.UrlShortenerPage;
import utils.BaseTest;

public class UrlShortenerTest3 extends BaseTest {
    UrlShortenerPage url;

    @Test
    public void testUrlShortener(){
        url = new UrlShortenerPage(getDriver());
        Assert.assertTrue(url.isLogoVisible());
        url.testUrlShortener("https://www.google.com/");
        System.out.println("Works");
    }
}
