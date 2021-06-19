package site.luvzy.test;

import site.luvzy.controller.MainFrameController;
import site.luvzy.view.MyFrame;

public class MainFrameTest extends MyFrame {

    @Override
    public void showAdminDialog() {
        System.out.println("进入管理界面");
    }

    public static void main(String[] arg) {
        new MainFrameController().setVisible(true);
    }
}
