package junit.helper;

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
        if (System.getProperty("HUB_URL") == null || System.getProperty("HUB_URL").isEmpty()) {
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
}
