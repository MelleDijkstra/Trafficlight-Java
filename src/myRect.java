import java.awt.*;

/**
 * Created by melle_000 on 2015-09-29.
 */
public class myRect {
    // init values
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    // constructor
    public myRect(Color color, int x, int y, int width, int height) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics pen) {
        pen.setColor(color);
        pen.fillRect(x,y,width,height);
    }
}
