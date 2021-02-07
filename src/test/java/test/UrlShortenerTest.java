package test;

import org.testng.annotations.Test;
import page.UrlShortenerPage;
import utils.BaseTest;

public class UrlShortenerTest extends BaseTest {

    UrlShortenerPage url;

    @Test
    public void testUrlShortener(){
        url = new UrlShortenerPage(getDriver());
        url.testUrlShortener("https://www.google.com/");
    }
}
