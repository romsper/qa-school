package junit.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class VKAuthPage extends ElementsContainer {
    // либо сделайте Синглтон паттерн при котором этот метод будет доступен глобально
    public By byDataListId(String listId) {
        return Selectors.by("data-list-id", listId);
    }
    //---
    private SelenideElement inpLogin = element(By.id("index_email"));
    private SelenideElement inpPassword = element(By.id("index_pass"));
    private SelenideElement btnLogin = element(By.id("index_login_button"));

    @Step("Open page")
    public VKAuthPage openPage(String url) {
        open(url);
        return this;
    }

    @Step("Set email")
    public VKAuthPage inpLogin(String email) {
        inpLogin.setValue(email);
        return this;
    }

    @Step("Set password")
    public VKAuthPage inpPassword(String password) {
        inpPassword.setValue(password);
        return this;
    }

    @Step("Click login button")
    public VKAuthPage clickBtnLogin() {
        btnLogin.shouldBe(Condition.visible); // так мы можем ждать какого то условия - сейчас ждем что элемент появился
        btnLogin.click();
        return this;
    }

    @Step("Authorization")
    public void authorization(String email, String password) {
        inpLogin(email);
        inpPassword(password);
        clickBtnLogin();
    }
}
