

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class MainFrame extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 500;

    public static int getWIDTH() {
        return WIDTH;
    }

    public static int getHEIGHT() {
        return HEIGHT;
    }


    MainFrame() {
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int) (dimension.getWidth() / 2 - WIDTH / 2),
                (int) (dimension.getHeight() / 2 - HEIGHT / 2));
        JPanel panel = new JPanel();
        add(panel);
        GraphUtils.changeComponentValue(panel);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                GraphUtils.changeComponentValue(panel);

            }
        });
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                GraphUtils.changeComponentValue(panel);
            }

        });
    }
}
