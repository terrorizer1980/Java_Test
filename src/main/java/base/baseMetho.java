package base;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

/**
 * 基本方法
 */
public class baseMetho {
    protected AndroidDriver driver;

    public baseMetho(AndroidDriver driver){
        this.driver=driver;
    }

    public WebElement findElementById(String str) {
        return this.driver.findElementById(str);

    }
    public List findElementsById(String str) {
        return this.driver.findElementsById(str);

    }
    /*
     * 获取屏幕大小
     */
    public Dimension getSize() {

        return this.driver.manage().window().getSize();
    }

    /*
     * 实现屏幕左滑
     */
    public void swipeLeft(Dimension dim) {
        int width = dim.width;
        int height = dim.height;
        int x1 = (int) (0.2 * width);
        int y1 = (int) (0.5 * height);
        int x2 = (int) (0.9 * width);
        int y2 = (int) (0.5 * height);
        PointOption po = new PointOption();
        WaitOptions wo = new WaitOptions();
        wo.withDuration(Duration.ofSeconds(1));
        TouchAction ta = new TouchAction(this.driver);
        ta.press(po.point(x1, y1)).waitAction(wo).moveTo(po.point(x2, y2)).release().perform();

    }


}
