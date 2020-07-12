package junit;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import junit.pages.GooglePage;
import junit.pages.GoogleSearchPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Epic("JUnit - Web")
@Feature("Google")
@Story("Search")
public class JUnitWebTest extends JUnitTestBase {
    GooglePage googlePage = new GooglePage(driver);
    GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver);

    @Test
    @Tag("lol")
    @DisplayName("Check search engine")
    public void checkSearch() {
        googlePage
                .inputSearchQuery("selenium")
                .clickSubmitButton();
        boolean isDisplayed = googleSearchPage
                .isTabRowDisplayed();
        assertThat(isDisplayed).isTrue();
    }
}
