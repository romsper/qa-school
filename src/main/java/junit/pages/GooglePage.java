package junit.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    public WebDriver driver;
    public GooglePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(name = "q")
    private WebElement searchQuery;

    @FindBy(name = "btnK")
    private WebElement btnSubmit;

    @Step("Input a search query")
    public GooglePage inputSearchQuery(String query) {
        searchQuery.sendKeys(query);
        return this;
    }

    @Step("Click to submit button")
    public GooglePage clickSubmitButton() {
        btnSubmit.click();
        return this;
    }
}
