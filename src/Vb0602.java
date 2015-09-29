import javax.swing.*;
import java.awt.*;

/**
 * Created by Melle Dijkstra on 2015-09-29.
 */
public class Vb0602 extends JFrame {
    public static void main(String args[]) {

        // basic code
        JFrame win = new JFrame("Traffic Light - Page 167/170");
        win.setSize(300,350);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        win.setBackground(Color.BLACK);

        // make trafficlight
        Trafficlight trafficlight = new Trafficlight();
        JButton resetBtn = new JButton("Reset");
        resetBtn.setActionCommand("reset");
        resetBtn.addActionListener(e -> {
            trafficlight.getLight("red").on(false);
            trafficlight.getLight("orange").on(false);
            trafficlight.getLight("green").on(false);
            trafficlight.repaint();
        });
        JButton redBtn = new JButton("Red");
        redBtn.addActionListener(e -> {
            trafficlight.getLight("red").on(true);
            trafficlight.repaint();
        });
        JButton orangeBtn = new JButton("Orange");
        orangeBtn.addActionListener(e -> {
            trafficlight.getLight("orange").on(true);
            trafficlight.repaint();
        });
        JButton greenBtn = new JButton("Green");
        greenBtn.addActionListener(e -> {
            trafficlight.getLight("green").on(true);
            trafficlight.repaint();
        });

        // add buttons to trafficlight
        trafficlight.add(resetBtn);
        trafficlight.add(redBtn);
        trafficlight.add(orangeBtn);
        trafficlight.add(greenBtn);

        win.add(trafficlight);
        win.setMinimumSize(new Dimension(300,300));
        win.pack();
        win.setVisible(true);
    }
}
