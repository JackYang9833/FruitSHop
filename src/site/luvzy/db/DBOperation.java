package site.luvzy.db;

import site.luvzy.data.Reback;

import java.sql.*;
import java.util.ArrayList;

public class DBOperation {
    /**
     * 表名，数据库名
     */
    public static final String DB_NAME = "test";
    public static final String TABLENAME = "fruits";
    // 判断索引
    private static int count;
    /**
     * 数据
     */
    private static String unit, name;
    private static int price, num;
    /**
     * 链接到数据
     */

    private  Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "123456");
    private  Statement stmt = conn.createStatement();
    private static ResultSet resultSet;
    /**
     *
     * @构造方法
     */
    public DBOperation() throws SQLException {

    }
    /**
     * 增
     */
    public  void addData(int number, String name, int price, String unit) throws SQLException {
        this.unit = unit;
        this.name = name;
        this.price = price;
        this.num = number;
        String sql = "insert into "+TABLENAME+" values("+number+",'"+name+",'"+price+",'"+unit+"'"+")";
        count = stmt.executeUpdate(sql);
        stmt.close();
        conn.close();
    }
    /**
     * 改  obj--更改的数据
     * p1条件(传入)
     * P2
     * data--新的数据
     */
    public void changDataByNumber() throws SQLException {
        String sql = "update student set " + num + " = 21 where number=" + num;
        int count = stmt.executeUpdate(sql);
        System.out.println(count);
    }

    //重载
    public void changData(int obj, String p, String p2, String data) throws SQLException {
        //String sql = "update student set age = 21 where age = 30";
        String sql = "update" + TABLENAME + "set " + obj + "=" + data + "where" + p + "=" + p2;
        count = stmt.executeUpdate(sql);
        System.out.println(count);
    }
    /**
     *
     * @param &p2 查找的条件
     * @throws SQLException 抛出异常
     */
    public ArrayList<String> data() throws SQLException {
        // String sql = "select * from"+TABLENAME+"where number="+p1;
        String[] text = new String[]{};
        int i=0;
        while (resultSet.next()) {
            text[i]=resultSet.getString("");
            data().add(text[i]);
            i+=1;
        }
        return data();
    }
    public void queryData() throws SQLException {
        Reback.resume(conn,resultSet,stmt,TABLENAME);
        num=Reback.numberOfList;
        name=Reback.nameOfList;
        price=Reback.priceOfList;
        unit=Reback.unitOfList;
    }

}
