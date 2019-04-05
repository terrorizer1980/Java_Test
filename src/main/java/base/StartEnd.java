package base;

import business.Login;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;
import base.DesiredCaps;
import util.ExcuteDao;
/**
 * @author zhbl
 * 测试用例执行前后的driver初始化和释放
 */
import java.io.IOException;

public class StartEnd {
    protected AndroidDriver driver;
    protected ExcuteDao ed;
    protected Login l;
    @BeforeMethod
    public void Before() throws IOException {
        DesiredCaps dc = new DesiredCaps();
        this.driver = dc.getDriver();
        l = new Login(this.driver);
        this.ed = new ExcuteDao();
    }
    @AfterMethod
    public void After(){
        this.driver.quit();
    }
}
