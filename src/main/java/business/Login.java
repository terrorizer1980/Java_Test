package business;
import base.DesiredCaps;
import common.commonMetho;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * @author zhbl
 * 登陆测试业务逻辑
 */
public class Login extends commonMetho{

    String allowBtn = "com.android.packageinstaller:id/permission_allow_button";

    public Login(AndroidDriver driver) {

        super(driver);
    }
    String userInput = "com.baidu.homework:id/passport_phone_number_input_edit";
    String userBtn = "com.baidu.homework:id/tv_phone_enter";
    String passwordInput = "com.baidu.homework:id/passport_password_input_view";
    String passwordBtn = "com.baidu.homework:id/tv_password_login";


    public void Login(String user,String password) throws InterruptedException {

        this.skipWelcome();
        System.out.println("输入账号密码...");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.findElementById(userInput).sendKeys(user);
        this.findElementById(userBtn).click();
        this.findElementById(passwordInput).sendKeys(password);
        this.findElementById(passwordBtn).click();

        try {
            this.findElementById(allowBtn).click();
            System.out.println("登陆成功！...");
        }catch (Exception ex){
            System.out.println("登陆失败！...");
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        DesiredCaps dc = new DesiredCaps();
        AndroidDriver driver = dc.getDriver();
        Login bm = new Login(driver);
        bm.Login("16604688441","111111");
    }
}
