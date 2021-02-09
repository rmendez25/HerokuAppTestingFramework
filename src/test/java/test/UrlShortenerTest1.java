package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.UrlShortenerPage;
import utils.BaseTest;

public class UrlShortenerTest1 extends BaseTest {
    UrlShortenerPage url;

    @Test
    public void testUrlShortener1() {
        url = new UrlShortenerPage(getDriver());
        Assert.assertTrue(url.isLogoVisible());
        url.testUrlShortener("https://www.youtube.com/");
    }
}
