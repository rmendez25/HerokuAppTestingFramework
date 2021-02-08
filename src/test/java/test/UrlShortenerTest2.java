package test;

import org.testng.annotations.Test;
import page.UrlShortenerPage;
import utils.BaseTest;

public class UrlShortenerTest2 extends BaseTest {
    UrlShortenerPage url;

    @Test
    public void testUrlShortener2() {
        url = new UrlShortenerPage(getDriver());
        url.testUrlShortener("https://www.facebook.com/");
    }
}
