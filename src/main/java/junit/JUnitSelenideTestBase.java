package junit;


import com.codeborne.selenide.Configuration;
import junit.helper.InitDriverProvider;

public class JUnitSelenideTestBase {

    JUnitSelenideTestBase() {
        Configuration.browser = InitDriverProvider.class.getName();
        Configuration.baseUrl = "https://vk.com";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 4000;
        Configuration.reopenBrowserOnFail = true;
    }
}
