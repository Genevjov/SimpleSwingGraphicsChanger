import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GraphUtils {

    static Color generateColor() {
        Random randomColor = new Random();
        return new Color(randomColor.nextInt(255) + 1,
                randomColor.nextInt(255) + 1,
                randomColor.nextInt(255) + 1);
    }

    static Point generatePosition(int width, int height) {
        Random random = new Random();
        return new Point(random.nextInt(MainFrame.getWIDTH() - width),
                random.nextInt(MainFrame.getHEIGHT() - height));
    }


    static void changeComponentValue(JPanel panel) {
        panel.setBackground(generateColor());
        panel.removeAll();
        panel.add(new Circle());
        panel.updateUI();
    }


}



