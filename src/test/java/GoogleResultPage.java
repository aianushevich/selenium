import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GoogleResultPage {
    public WebDriver driver;

    public GoogleResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = ".yuRUbf h3")
    private List<WebElement> searchResultTitles;

    public void pressOnSearchResult(int number) {
        searchResultTitles.get(number).click();
    }
}
