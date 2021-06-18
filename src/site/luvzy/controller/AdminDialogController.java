package site.luvzy.controller;

import site.luvzy.view.MyDialog;

import java.awt.*;
import java.util.ArrayList;

/**
 * @项目名称 FruitSHop
 * @日期 2021/6/16
 */
public class AdminDialogController extends MyDialog {

    public AdminDialogController() {
        super();
    }

    public AdminDialogController(Frame owner, Boolean modal) {
        super(owner, modal);
    }

    @Override
    public void queryFruitItem() {
        String sheet[] = new String[]{"水果编号", "水果名称", "水果单价(Kg/元)", "计价单位"};
        ArrayList<FruitItem> list = new ArrayList<>();
        list.add(new FruitItem("苹果", "kg", 2, 1));
    }

    @Override
    public void addFruitItem() {
    }

    @Override
    public void deleteFruitItem() {

    }

    @Override
    public void modifyFruitItem() {

    }

    @Override
    public void onResume() {

    }
}
