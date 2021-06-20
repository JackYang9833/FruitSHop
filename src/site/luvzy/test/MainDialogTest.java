package site.luvzy.test;

import site.luvzy.controller.FruitItem;
import site.luvzy.db.DBOperation;
import site.luvzy.view.MyDialog;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;


public class MainDialogTest extends MyDialog {
    public MainDialogTest() {
        super();
        //queryFruitItem();
        onResume();
    }

    @Override
    public void addFruitItem() {

    }

    @Override
    public void modifyFruitItem() {
    }

    @Override
    public void deleteFruitItem() {
    }

    @Override
    public void queryFruitItem() {
        String []titleList = new String[]{"水果编号", "水果名称", "单价", "单位"};
        String[][]  data= new String[][]{
                {"1", "苹果", "2", "kg"}, {"2", "雪梨", "5", "kg"}, {"3", "西瓜", "2", "kg"}
        };
       // ArrayList<FruitItem> data = new ArrayList<FruitItem>();
/*
        public static double[][] TwoArry(double[] onedouble){
            double[][] arr=new double[1][onedouble.length];
            for (int i = 0; i < onedouble.length; i++) {
                arr[0][i]=onedouble[i];
            }
            return arr;
        }*/
        TableModel model = new DefaultTableModel(data, titleList);
        table.setModel(model);

    }

    @Override
    public void onResume() {

    }

    public static void main(String[] args) {
        new MainDialogTest().setVisible(true);
    }

}
