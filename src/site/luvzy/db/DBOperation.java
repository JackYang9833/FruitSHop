package site.luvzy.db;

import site.luvzy.data.Reback;
import java.sql.*;
public class DBOperation {
    /**
     * 表名，数据库名
     */
    public static final String DBNAME = "test";
    public static final String TABLE_NAME = "fruits";
    /**
     * 数据
     */
    public static String getUnit, getName;
    public static int getPrice, getNum;
    /**
     * 链接到数据
     */
    private  Connection conn;
    private  Statement stmt;
    private ResultSet resultSet;
    /**
     * 构造方法
     */
    public DBOperation()throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root","123456");
            this.stmt = conn.createStatement();
            System.out.println("连接成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    /**
     * 增
     */
    public  void addData(int number, String name, int price, String unit) throws SQLException {
        new DBOperation();
        this.getUnit = unit;
        this.getName = name;
        this.getPrice = price;
        this.getNum = number;
        String sql = "insert into "+TABLE_NAME+" values("+number+",'"+name+",'"+price+",'"+unit+"'"+")";
        int count = this.stmt.executeUpdate(sql);
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
        String sql = "update student set " + getNum + " = 21 where number=" + getNum;
        int count = stmt.executeUpdate(sql);
        System.out.println(count);
    }

    /**
     *
     *
     */
    public void queryData() throws SQLException {
        new Reback(conn,resultSet,stmt,TABLE_NAME);
        getNum=Reback.numberOfList;
        getName=Reback.nameOfList;
        getPrice=Reback.priceOfList;
        getUnit=Reback.unitOfList;
    }
}
