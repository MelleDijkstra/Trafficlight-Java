import javax.swing.*;
import java.awt.*;

/**
 * Created by melle on 29-9-2015.
 */
public class verkeersLicht extends JPanel {
    private boolean groen;
    private boolean orange;
    private boolean rood;

    private Rechthoek rechthoek;
    private Circle circleRED;
    private Circle circleORANGE;
    private Circle circleGREEN;

    public verkeersLicht() {
        setBackground(Color.WHITE);
        rechthoek = new Rechthoek(Color.BLACK, 52, 50, 50, 135);
        circleRED = new Circle(Color.RED, 60, 60, 32, 32);
        circleORANGE = new Circle(Color.ORANGE, 60, 100, 32, 32);
        circleGREEN = new Circle(Color.GREEN, 60, 140, 32, 32);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        rechthoek.teken(g);
        circleRED.teken(g);
        circleORANGE.teken(g);
        circleGREEN.teken(g);
    }
}
