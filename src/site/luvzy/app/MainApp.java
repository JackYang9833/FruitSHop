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
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        new MainFrameController().setVisible(true);
    }
}
