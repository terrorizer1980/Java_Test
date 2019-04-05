package testcase;

import base.StartEnd;
import org.testng.annotations.Test;
import util.ExcuteDao;
import business.Login;
public class TestLogin extends StartEnd {

    @Test
    public void test01() throws Exception {
        this.ed.QueryByID(1);
        Login l = new Login(this.driver);
        l.Login(this.ed.getUsername(),this.ed.getUsername());
    }
    @Test
    public void test02() throws Exception {
        this.ed.QueryByID(2);
        Login l = new Login(this.driver);
        l.Login(this.ed.getUsername(),this.ed.getUsername());
    }


}
