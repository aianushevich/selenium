import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    public WebDriver driver;
    private final static String GOOGLE_URL = "https://www.google.com/";


    public GoogleSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        driver.get(GOOGLE_URL);
    }

    @FindBy(name = "q")
    private WebElement searchForm;

    public void typeAndSearch(String text) {
        searchForm.sendKeys(text);
        searchForm.submit();
    }
}
