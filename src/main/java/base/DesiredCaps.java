package base;
import java.io.IOException;
import java.net.URL;


import io.appium.java_client.android.AndroidDriver;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * 获取driver
 */

public class DesiredCaps {
    AndroidDriver driver;
    public AndroidDriver getDriver( ) throws IOException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "oppo");
        capabilities.setCapability("platformVersion", "7.1.1");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appPackage", "com.baidu.homework");
        capabilities.setCapability("appActivity", "com.baidu.homework.activity.init.InitActivity");
        capabilities.setCapability("noReset", "False");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, capabilities);
        return driver;
    }

}
