package site.luvzy.data;

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
    public String numberOfList;
    public String priceOfList;
    public String nameOfList;
    public String unitOfList;

    public Reback() {
    }

    public static ArrayList<FruitItem> data = new ArrayList<FruitItem>();
    ArrayList<String> mlist = new ArrayList();

    /**
     * @param conn 数据库连接
     */
    public void resum(Connection conn, ResultSet rs, Statement statment) throws SQLException {
        String sql = " ";
        rs = statment.executeQuery(sql);
        while (rs.next()) {
            //list.add(mlist);
            numberOfList = rs.getString("");//从数据库里得到编号
            priceOfList = rs.getString("");//从数据库里得到价格
            nameOfList = rs.getString("");//从数据库里得到编号
            unitOfList = rs.getString("");//从数据库里得到单位
            mlist.add(numberOfList);
            mlist.add(priceOfList);
            mlist.add(nameOfList);
            mlist.add(unitOfList);
//测试信息
            System.out.print(numberOfList);
            System.out.print(priceOfList);
            System.out.print(nameOfList);
            System.out.print(unitOfList);
        }
    }
}
