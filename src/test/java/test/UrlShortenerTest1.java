package test;

import org.testng.annotations.Test;
import page.UrlShortenerPage;
import utils.BaseTest;

public class UrlShortenerTest1 extends BaseTest {
    UrlShortenerPage url;

    @Test
    public void testUrlShortener1() {
        url = new UrlShortenerPage(getDriver());
        url.testUrlShortener("https://www.youtube.com/");
    }
}
