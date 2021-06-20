package site.luvzy.data;

import site.luvzy.controller.FruitItem;
import site.luvzy.db.DBOperation;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @Author:YTZ
 */
public class DataBase {
    /**
     * 向数据集添加数据  将Reback里面的数据整合到FruitItem集合中去
     *
     */
    private static String name;
    private static String unit;
    private static int price;
    private static int number;

    public static ArrayList<FruitItem> data = new ArrayList<FruitItem>();
    static {
        DBOperation operation = null;
        try {
            operation = new DBOperation();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            operation.queryData();//
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        name = operation.getName;
        number = operation.getNum;
        price = operation.getPrice;
        unit = operation.getUnit;
        data.add(new FruitItem(number,name,price,unit));
    }
}
