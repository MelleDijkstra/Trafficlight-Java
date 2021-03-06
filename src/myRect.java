import java.awt.*;

/**
 * Created by melle_000 on 2015-09-29.
 */
public class myRect {
    // Initialize values
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    // Constructor
    public myRect(Color color, int x, int y, int width, int height) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Draw the rectangle
    public void draw(Graphics pen) {
        pen.setColor(color);
        pen.fillRect(x,y,width,height);
    }
}
