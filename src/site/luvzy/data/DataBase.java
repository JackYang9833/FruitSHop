package site.luvzy.data;

import site.luvzy.controller.FruitItem;
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
        name = Reback.nameOfList;
        number = Reback.numberOfList;
        price = Reback.priceOfList;
        unit = Reback.unitOfList;
        data.add(new FruitItem(number,name,price,unit));
    }
}
