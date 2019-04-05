package common;
import base.DesiredCaps;
import base.baseMetho;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.NoSuchElementException;

import java.io.IOException;

/**
 * 公共方法
 */
public class commonMetho extends baseMetho {

    String yesBtn = "android:id/button1";
    String allowBtn = "com.android.packageinstaller:id/permission_allow_button";
    String skipBtn = "com.baidu.homework:id/adx_splash_skip_text";

    public commonMetho(AndroidDriver driver) {

        super(driver);
    }

    public void skipWelcome(){
        System.out.println("跳过欢迎页面！");
        this.findElementById(yesBtn).click();
        this.findElementById(allowBtn).click();
        this.findElementById(allowBtn).click();
        try{
            this.findElementById(skipBtn).click();
        }catch (NoSuchElementException e) {
            System.out.println("未检测到“跳过”按钮！");
        }

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        DesiredCaps dc = new DesiredCaps();
        AndroidDriver driver = dc.getDriver();
        commonMetho cm = new commonMetho(driver);
        cm.skipWelcome();
    }

}
