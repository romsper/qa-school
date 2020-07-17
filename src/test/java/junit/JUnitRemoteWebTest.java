package junit;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class JUnitRemoteWebTest extends JUnitSelenideTestBase {

    @Test
    public void someTest() {
        open("/");
        sleep(10000);
    }
}
