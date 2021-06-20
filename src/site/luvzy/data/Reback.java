package site.luvzy.data;

import org.jetbrains.annotations.NotNull;
import site.luvzy.controller.FruitItem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * 返回数据库里的数据
 */
public class Reback {
    public static int numberOfList;
    public static int priceOfList;
    public static String nameOfList;
    public static String unitOfList;
    Connection conn;
    ResultSet rs;
    Statement statment;
    String tableName;
    public ArrayList<FruitItem> queryFruitItem(){
        ArrayList<FruitItem> data=new ArrayList<FruitItem>();
            return data;
    }
    /**
     *
     */
    public Reback(Connection conn, ResultSet rs, @NotNull Statement statment,String tableName) throws SQLException {
        String sql = "select * from" + tableName;
        rs = statment.executeQuery(sql);
        while (rs.next()) {
            numberOfList = Integer.parseInt(rs.getString("number"));//从数据库里得到编号
            priceOfList = Integer.parseInt(rs.getString("price"));//从数据库里得到价格
            nameOfList = rs.getString("name");//从数据库里得到名称
            unitOfList = rs.getString("unit");//从数据库里得到单位
//测试信息
            System.out.print(numberOfList);
            System.out.print(priceOfList);
            System.out.print(nameOfList);
            System.out.print(unitOfList);
        }

        /**
         * @param conn 数据库连接
         */
   /* public static void resume(Connection conn, ResultSet rs, @NotNull Statement statment,String tableName) throws SQLException {
        String sql = "select * from"+tableName;
        rs = statment.executeQuery(sql);
        while (rs.next()) {
            numberOfList = Integer.parseInt(rs.getString("number"));//从数据库里得到编号
            priceOfList = Integer.parseInt(rs.getString("price"));//从数据库里得到价格
            nameOfList = rs.getString("name");//从数据库里得到名称
            unitOfList = rs.getString("unit");//从数据库里得到单位
//测试信息
            System.out.print(numberOfList);
            System.out.print(priceOfList);
            System.out.print(nameOfList);
            System.out.print(unitOfList);
        }
    }*/
    }
}
