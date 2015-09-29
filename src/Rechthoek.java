import java.awt.*;

/**
 * Created by Melle Dijkstra on 2015-09-29.
 */
public class Rechthoek {
    // values
    private int x;
    private int y;
    private int breedte;
    private int hoogte;
    private Color kleur;

    // constructor
    public Rechthoek(Color kleur, int x, int y, int breedte, int hoogte) {
        this.kleur = kleur;
        this.x = x;
        this.y = y;
        this.breedte = breedte;
        this.hoogte = hoogte;
    }

    public void teken(Graphics pen) {
        pen.setColor(kleur);
        pen.fillRect(x,y,breedte,hoogte);
    }
}
