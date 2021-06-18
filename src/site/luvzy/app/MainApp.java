package site.luvzy.app;

import site.luvzy.controller.MainFrameController;

import java.sql.*;

/**
 * @ Author:ytz
 * @ Date:2021/6/16
 * @ Description:
 * @ Version:1.0
 */
public class MainApp {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       /* Class.forName("com.mysql.jdbc.Driver");
//        jdbc:mysql:///db3
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","123456");
        String sql = "update student set age = 21 where age = 30";
        Statement stmt = conn.createStatement();
        int count = stmt.executeUpdate(sql);
        System.out.println(count);
        stmt.close();
        conn.close();*/
        new MainFrameController().setVisible(true);
    }
}
