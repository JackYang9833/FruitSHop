package site.luvzy.view;

import site.luvzy.tools.GuiTools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @ Author:ytz
 * @ Date:2021/6/16
 * @ Description:
 * @ Version:1.0
 */
public abstract class MyFrame extends JFrame {

    private JLabel backgroundImg = new JLabel(new ImageIcon("FruitStore.jpg"));
    private JButton button = new JButton("进入系统");

    public MyFrame() {
        init();
        addComponent();
        addListener();
    }

    private void init() {
        this.setSize(600, 400);
        this.setTitle("水果超市欢迎您");
        GuiTools.center(this);
        GuiTools.setTitleImage(this, "title.png");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addComponent() {
        this.add(backgroundImg, BorderLayout.NORTH);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        button.setBounds(240, 20, 120, 50);
        panel.add(button);
    }

    private void addListener() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAdminDialog();
            }
        });
    }

    public abstract void showAdminDialog();
}
