package site.luvzy.tools;

import javax.swing.*;
import java.awt.*;

/**
 * @ Author:ytz
 * @ Date:2021/6/16
 * @ Description:
 * @ Version:1.0
 */
public class GuiTools {
    static Toolkit tool = Toolkit.getDefaultToolkit();

    public static void center(Component c) {
        int x = (tool.getScreenSize().width - c.getWidth()) / 2;
        int y = (tool.getScreenSize().height - c.getHeight()) / 2;
        c.setLocation(x, y);
    }

    public static void setTitleImage(JFrame frame, String pathOfIcon) {
        frame.setIconImage(tool.createImage(pathOfIcon));
    }
}
