package site.luvzy.dao;

import site.luvzy.controller.FruitItem;
import site.luvzy.data.DataBase;
import site.luvzy.data.Reback;

import java.util.ArrayList;

public class AdminDao {
    public ArrayList<FruitItem> queryAllData() {
        return DataBase.data;
    }

    public void addFruitItem() {
    }
}
