package util;
/**
 * @zhbl
 * 根据testId读取数据库中的测试用例数据
 */

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import util.MysqlConnect;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExcuteDao {
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    String sql;
    String username;
    String password;

    public void QueryByID(int testId) throws Exception {
        conn = MysqlConnect.getConnection();
        stmt = (Statement) conn.createStatement();
        sql = "select * from testdata where testid = '"+testId+"'";
        rs = stmt.executeQuery(sql);
        while (rs.next()){
            username = rs.getString("username");
            password = rs.getString("password");
        }

    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public void closeDB() throws SQLException {
        conn.close();
        rs.close();
        stmt.close();
    }

    public static void main(String[] args) throws Exception {
        ExcuteDao ed = new ExcuteDao();
        ed.QueryByID(1);
        System.out.println(ed.getUsername());
        System.out.println(ed.getPassword());

    }
}
