package Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Base {
    protected final AppiumDriver driver;
    private final WebDriverWait wait;

    public Base() {
        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("platformName", "Android");
            cap.setCapability("appium:platformVersion", "13.0");
            cap.setCapability("appium:deviceName", "Pixel 6 Pro API 33");
            cap.setCapability("appium:automationName", "UiAutomator2");
            cap.setCapability("appium:app", "C:\\Users\\Asus\\Downloads\\misli_android.apk");
            this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
            this.wait = new WebDriverWait(driver, Duration.of(1, ChronoUnit.MINUTES));
//            this.driver.manage().timeouts().implicitlyWait(Duration.of(1, ChronoUnit.MINUTES));

        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}