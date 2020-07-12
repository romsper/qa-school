package junit.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    public WebDriver driver;
    public GoogleSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "hdtbSum")
    private WebElement tabRow;

    @Step("Check that the row with tabs is displayed")
    public boolean isTabRowDisplayed() {
        return tabRow.isDisplayed();
    }
}
