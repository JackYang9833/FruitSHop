package site.luvzy.controller;

import org.jetbrains.annotations.Nls;
import site.luvzy.data.DataBase;
import site.luvzy.view.MyDialog;

import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
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
        list.add(new FruitItem(1, "苹果", 2,"kg"));
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
        String []titleList = new String[]{"水果编号", "水果名称", "单价", "单位"};
        // TableModel tableModel = new DefaultTableModel(DataBase.data,titleList);
    }
}
