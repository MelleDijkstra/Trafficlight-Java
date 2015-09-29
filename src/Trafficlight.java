import javax.swing.*;
import java.awt.*;

/**
 * Created by Melle Dijkstra on 29-9-2015 - 21:19.
 */
public class Trafficlight extends JPanel {
    private boolean green;
    private boolean orange;
    private boolean red;

    private myRect rect;
    private Circle circleRED;
    private Circle circleORANGE;
    private Circle circleGREEN;

    public Trafficlight() {
        setBackground(Color.WHITE);
        rect = new myRect(Color.BLACK, 52, 50, 50, 135);
        circleRED = new Circle(Color.RED, 60, 60, 32, 32);
        circleORANGE = new Circle(Color.ORANGE, 60, 100, 32, 32);
        circleGREEN = new Circle(Color.GREEN, 60, 140, 32, 32);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        rect.draw(g);
        circleRED.draw(g);
        circleORANGE.draw(g);
        circleGREEN.draw(g);
    }
}
