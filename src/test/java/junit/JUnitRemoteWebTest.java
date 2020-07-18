package junit;

import junit.pages.VKAuthPage;
import junit.pages.VKMainPage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JUnitRemoteWebTest extends JUnitSelenideTestBase {
    private VKAuthPage vkAuthPage = new VKAuthPage();
    private VKMainPage vkMainPage = new VKMainPage();

    @Test
    public void someTest() {
        vkAuthPage
                .openPage("/")
                .authorization("email", "password");
        String userName = vkMainPage.getUsername();

        assertThat(userName).isEqualTo("username");
    }
}
