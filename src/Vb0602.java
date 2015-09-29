import javax.swing.*;
import java.awt.*;

/**
 * Created by melle_000 on 2015-09-29.
 */
public class Vb0602 extends JFrame {
    public static void main(String args[]) {

        // basic code
        JFrame win = new JFrame("Traffic Light - Pagina 167");
        win.setSize(300,350);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // make stoplicht (layout)
        verkeersLicht layout = new verkeersLicht();
        JButton resetBtn = new JButton("Reset");
        resetBtn.setActionCommand("reset");
        resetBtn.addActionListener(e -> {

        });
        JButton redBtn = new JButton("Red");
        JButton orangeBtn = new JButton("Orange");
        JButton greenBtn = new JButton("Green");

        // add buttons to layout
        layout.add(resetBtn);
        layout.add(redBtn);
        layout.add(orangeBtn);
        layout.add(greenBtn);

        win.add(layout);
        win.setMinimumSize(new Dimension(300,300));
        win.pack();
        win.setVisible(true);
    }
}
