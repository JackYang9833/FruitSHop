package site.luvzy.controller;

import site.luvzy.view.MyFrame;

/**
 * @项目名称 FruitSHop
 * @日期 2021/6/16
 */
public class MainFrameController extends MyFrame {
    @Override
    public void showAdminDialog() {
      new AdminDialogController(this, true).setVisible(true);
    }
}
