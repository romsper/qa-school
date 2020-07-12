package junit;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Epic("JUnit - Simple")
@Feature("Calculation")
@Story("Simple functions")
public class JUnitTest {
    Logic mainPage = new Logic();

    @Test
    @Tags({@Tag("regression"), @Tag("auth")})
    @DisplayName("I want to check SUM function in this fucking calculator")
    public void checkSum() {
        mainPage
                .setFirstNum(1)
                .setSecondNum(1);
        int result = mainPage.getResult("sum");

        assertThat(result).isEqualTo(2);
    }

    @Test
    @Tags({@Tag("regression"), @Tag("log")})
    @DisplayName("I want to check MINUS function in this fucking calculator")
    public void checkMinus() {
        mainPage.setFirstNum(2);
        mainPage.setSecondNum(2);
        int result = mainPage.getResult("minus");
        assertThat(result).isEqualTo(0);

    }
}
