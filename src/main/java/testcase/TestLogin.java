package testcase;

import base.StartEnd;
import org.testng.annotations.Test;
import util.ExcuteDao;
import business.Login;

/**
 * @author zhbl
 * 测试用例
 */
public class TestLogin extends StartEnd {

    @Test
    public void test01() throws Exception {
        this.ed.QueryByID(1);
        System.out.println("测试密码为："+this.ed.getPassword());
        this.l.Login(this.ed.getUsername(),this.ed.getPassword());
    }
    @Test
    public void test02() throws Exception {
        this.ed.QueryByID(2);
        System.out.println("测试密码为："+this.ed.getPassword());
        this.l.Login(this.ed.getUsername(),this.ed.getPassword());
    }

    @Test
    public void test03() throws Exception {
        this.ed.QueryByID(3);
        System.out.println("测试密码为："+this.ed.getPassword());
        this.l.Login(this.ed.getUsername(),this.ed.getPassword());
    }

}
