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
    private Circle circleRed;
    private Circle circleOrange;
    private Circle circleGreen;

    public boolean isGreen() {
        return green;
    }

    public void setGreen(boolean green) {
        this.green = green;
    }

    public boolean isOrange() {
        return orange;
    }

    public void setOrange(boolean orange) {
        this.orange = orange;
    }

    public boolean isRed() {
        return red;
    }

    public void setRed(boolean red) {
        this.red = red;
    }

    public myRect getRect() {
        return rect;
    }

    public Circle getCircleRed() {
        return circleRed;
    }

    public Circle getCircleOrange() {
        return circleOrange;
    }

    public Circle getCircleGreen() {
        return circleGreen;
    }

    public Trafficlight() {
        setBackground(Color.WHITE);
        rect = new myRect(Color.BLACK, 52, 50, 50, 135);
        circleRed = new Circle(Color.RED, 60, 60, 32, 32);
        circleOrange = new Circle(Color.ORANGE, 60, 100, 32, 32);
        circleGreen = new Circle(Color.GREEN, 60, 140, 32, 32);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        rect.draw(g);
        circleRed.draw(g);
        circleOrange.draw(g);
        circleGreen.draw(g);
    }

    public Circle getLight(String color) {
        switch(color) {
            case "green":
                return circleGreen;
            case "orange":
                return circleOrange;
            case "red":
                return circleRed;
            default:
                return null;
        }
    }
}
