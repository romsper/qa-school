package junit;

import junit.helper.InitDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class JUnitTestBase {
    private final InitDriver initDriver = new InitDriver();
    WebDriver driver = initDriver.getDriver();

    @BeforeEach
    public void setUp() {
        driver.get("https://google.com");
    }

    @AfterEach
    public void tearDown() {
        driver.close();
    }
}
