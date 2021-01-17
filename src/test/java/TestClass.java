import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TestClass {
    public static WebDriver driver;
    public static GoogleResultPage googleResultPage;
    public static GoogleSearchPage googleSearchPage;
    private final static String YANDEX_URL = "https://yandex.ru/";
    private final static String YANDEX_DOMAIN = "yandex.ru";
    private final static int RESULT_ITEM = 0;

    @BeforeClass
    public static void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        googleResultPage = new GoogleResultPage(driver);
        googleSearchPage = new GoogleSearchPage(driver);
    }

    /**
     * Test #1: testYandexSearchInGoogle
     * 1. Type "yandex.ru" in google search form and press Enter.
     * 2. Click the first result's link and verify URL is https://yandex.ru/.
     */

    @Test
    public void testYandexSearchInGoogle() {
        googleSearchPage.typeAndSearch(YANDEX_DOMAIN);
        googleResultPage.pressOnSearchResult(RESULT_ITEM);
        assertEquals(YANDEX_URL, driver.getCurrentUrl());

    }

    @AfterClass
    public static void complete() {
        driver.close();
    }
}