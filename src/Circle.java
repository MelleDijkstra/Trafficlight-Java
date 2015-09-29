import java.awt.*;

/**
 * Created by melle_000 on 2015-09-29.
 */
public class Circle {
    // values
    private int x;
    private int y;
    private int breedte;
    private int hoogte;
    private Color color;

    // constructor
    public Circle(Color color, int x, int y, int breedte, int hoogte) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    public void draw(Graphics pen) {
        pen.setColor(color);
        pen.fillOval(x,y,breedte,hoogte);
    }
}