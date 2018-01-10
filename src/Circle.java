import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Circle extends JComponent implements ActionListener {

    private Color color;
    private int size;
    private Timer timer = new Timer(5, this);
    private Point position;
    private int ANIMATION_SPEED;


    Circle() {
        setPreferredSize(new Dimension(800, 500));
        size = new Random().nextInt(100) + 40;
        position = GraphUtils.generatePosition(size, size);
        ANIMATION_SPEED = new Random().nextInt(5) + 1;
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(color);
        g.fillOval(position.x, position.y, size, size);
        timer.start();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (position.x < 0 || position.x > MainFrame.getWIDTH() - size) {
            ANIMATION_SPEED = -ANIMATION_SPEED;
        }
        color = GraphUtils.generateColor();
        position.x += ANIMATION_SPEED;
        repaint();
    }
}
