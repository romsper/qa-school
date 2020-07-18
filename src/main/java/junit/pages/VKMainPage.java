package junit.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class VKMainPage extends ElementsContainer {
    private SelenideElement txtUserName = element(By.className("top_profile_name"));

    @Step("Get username")
    public String getUsername() {
        txtUserName.shouldBe(Condition.visible);
        return txtUserName.text();
    }
}
