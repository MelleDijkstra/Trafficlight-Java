import java.awt.*;

/**
 * Created by melle_000 on 2015-09-29.
 */
public class Circle {
    // init values
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;
    private boolean fill = true;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Specify if the circle is filled or not
    public void setFill(boolean fill) {
        this.fill = fill;
    }

    // constructor with setting fill option
    public Circle(Color color, int x, int y, int width, int height, boolean fill) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.fill = fill;
    }

    // constructor for circle without setting the fill
    public Circle(Color color, int x, int y, int width, int height) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // draw the circle
    public void draw(Graphics pen) {
        pen.setColor(color);
        if(this.fill) {
            pen.fillOval(x,y, width, height);
        } else {
            pen.drawOval(x,y, width, height);
        }
    }

    // Put on the light (circle) that is currently calling this method
    public void switchLight(boolean val) {
        this.fill = val;
    }
}