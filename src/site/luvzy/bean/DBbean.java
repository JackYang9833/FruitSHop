package site.luvzy.bean;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @ Author:yan@Jack
 * @ Date:2021/6/19
 * @ Description:连接数据库
 * @ Version:1.0
 */
public class DBbean {

    private Connection dbCon;

    String dbURL = "jdbc:mysql://localhost:3306/xxxxx";
    String dbDriver = "com.mysql.jdbc.Driver" ;
    String dbUser = "dbuser";
    String dbPassword = "dbpassword";

    public DBbean() {
        super();
    }

    public boolean connect() throws ClassNotFoundException, SQLException {

        try{
            Context initCtx = new InitialContext();
            if(initCtx == null ){
                throw new Exception("No Context");
            }
            Context ctx = (Context) initCtx.lookup("java:comp/env");
            DataSource ds = (DataSource)ctx.lookup("jdbc/项目名");  //项目名要与context.xml里面的对应
            if(ds != null){
                dbCon = ds.getConnection();
                dbCon.setAutoCommit(false);
                return true;
            }else{
                return false;
            }
        }catch(javax.naming.NoInitialContextException e){   //以防万一 tomcat上配置的context.xml用不了
            Class.forName("");
            dbCon = DriverManager.getConnection("this.getDbURL() ", dbUser ,dbPassword);
            dbCon.setAutoCommit(false);
            return true;
        }catch(Exception e){
            return false;
        }

    }

}
//src:https://blog.csdn.net/qq_22778717/article/details/52608265