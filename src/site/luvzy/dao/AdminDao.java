package site.luvzy.dao;

import site.luvzy.controller.FruitItem;
import site.luvzy.data.Reback;

import java.util.ArrayList;

public class AdminDao {
    public ArrayList<FruitItem> resum() {
        return Reback.data;
    }

    public void addFruitItem() {
    }
}
