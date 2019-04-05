# Java_Test
基于java语言实现登陆功能回归测试自动化测试框架
### 1.将测试登陆的账号密码存放在mysql数据中，实现数据脚本分离
|testId    |username    |password |
|:--------:|:------------:|:---------:|
|1	   |   16604688441	  |  111111|
|2	 |     16604688441|	|
|3|	      16604688441	  |    !|
|4	   |   16604688441	 | !@#$!@#@#$@#$%#@!|
|5	|      16604688441	 |     a|
|6	    |  16604688441	  |    A|
|7	|      16604688441	|    AsDVDweras|
|8	   |   16604688441	 |   ASDds132#$#|
|9	  |    16604688441	   | 	    |

### 2.项目文件结构
1.base/common  封装基本公共方法，如driver获取类，左滑右划，双指缩放等方法</br>
2.util 封装读取数据库方法，testcase封装测试用例，business封装业务逻辑</br>

### 3.数据库读取类代码
```
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
}
```
