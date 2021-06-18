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

    public ArrayList<FruitItem> queryFruitItem(){
        ArrayList<FruitItem> data=new ArrayList<FruitItem>();
            return data;
    }

    /**
     * @param conn 数据库连接
     */
    public static void resum(Connection conn, ResultSet rs, @NotNull Statement statment) throws SQLException {
        String sql = " ";
        rs = statment.executeQuery(sql);
        while (rs.next()) {
            numberOfList = Integer.parseInt(rs.getString(""));//从数据库里得到编号
            priceOfList = Integer.parseInt(rs.getString(""));//从数据库里得到价格
            nameOfList = rs.getString("");//从数据库里得到编号
            unitOfList = rs.getString("");//从数据库里得到单位
//测试信息
            System.out.print(numberOfList);
            System.out.print(priceOfList);
            System.out.print(nameOfList);
            System.out.print(unitOfList);
        }
    }
}
