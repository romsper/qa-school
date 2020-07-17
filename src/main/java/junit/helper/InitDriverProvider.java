package junit.helper;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

import javax.annotation.Nonnull;

public class InitDriverProvider implements WebDriverProvider {
    RemoteWebDriver remoteWebDriver;

    private String getHubUrl() {
        String HUB_URL;
        if (System.getProperty("HUB_URL") == null) {
            HUB_URL = "localhost";
        } else {
            HUB_URL = System.getProperty("HUB_URL");
        }
        return HUB_URL;
    }

    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull DesiredCapabilities desiredCapabilities) {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setCapability("version", "83");
        chromeOptions.setCapability("enableVNC", true);

        try {
            remoteWebDriver = new RemoteWebDriver(URI.create("http://" + getHubUrl() + ":4444/wd/hub").toURL(), chromeOptions);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return remoteWebDriver;
    }

//: WebDriverProvider {
//
//        var HUB_URL = if (System.getProperty("HUB_URL").isNullOrEmpty()) "localhost" else System.getProperty("HUB_URL")
//
//        override fun createDriver(capabilities: DesiredCapabilities): RemoteWebDriver {
//            val chromeOptions = ChromeOptions()
//            chromeOptions.setCapability("version", "75")
//            chromeOptions.setCapability("enableVNC", true)
//
//            return RemoteWebDriver(URL("http://$HUB_URL:4444/wd/hub"), chromeOptions)
//        }
//
//        init {
//            Configuration.baseUrl = "https://vk.com"
//            Configuration.browserSize = "1920x1080"
//            Configuration.timeout = 15000
//            Configuration.reopenBrowserOnFail = true
//        }
//    }
}
