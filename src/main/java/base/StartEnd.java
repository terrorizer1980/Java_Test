package base;

import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.*;
import base.DesiredCaps;
import util.ExcuteDao;

import java.io.IOException;

public class StartEnd {
    protected AndroidDriver driver;
    protected ExcuteDao ed;
    @BeforeMethod
    public void Before() throws IOException {
        DesiredCaps dc = new DesiredCaps();
        this.driver = dc.getDriver();
        this.ed = new ExcuteDao();
    }
    @AfterMethod
    public void After(){
        this.driver.quit();
    }
}
