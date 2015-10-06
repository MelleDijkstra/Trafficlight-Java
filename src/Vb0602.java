import javax.swing.*;
import java.awt.*;

/**
 * Created by Melle Dijkstra on 2015-09-29.
 */
public class Vb0602 extends JFrame {
    public static void main(String args[]) {

        // Basic Code
        JFrame win = new JFrame("Traffic Light - Page 167/170");
        // Set window size
        win.setSize(300, 350);
        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Make Trafficlight (trafficlight is a layout)
        Trafficlight trafficlight = new Trafficlight();

        // Reset button action
        JButton resetBtn = new JButton("Reset");
        resetBtn.addActionListener(e -> {
            trafficlight.getLight("red").switchLight(false);
            trafficlight.getLight("orange").switchLight(false);
            trafficlight.getLight("green").switchLight(false);
            trafficlight.repaint();
        });

        // Red button action
        JButton redBtn = new JButton("Red");
        redBtn.addActionListener(e -> {
            trafficlight.getLight("red").switchLight(true);
            trafficlight.getLight("orange").switchLight(false);
            trafficlight.getLight("green").switchLight(false);
            trafficlight.repaint();
        });

        // Orange button action
        JButton orangeBtn = new JButton("Orange");
        orangeBtn.addActionListener(e -> {
            trafficlight.getLight("orange").switchLight(true);
            trafficlight.getLight("red").switchLight(false);
            trafficlight.getLight("green").switchLight(false);
            trafficlight.repaint();
        });

        // Green button action
        JButton greenBtn = new JButton("Green");
        greenBtn.addActionListener(e -> {
            trafficlight.getLight("green").switchLight(true);
            trafficlight.getLight("red").switchLight(false);
            trafficlight.getLight("orange").switchLight(false);
            trafficlight.repaint();
        });

        // Add buttons to trafficlight
        trafficlight.add(resetBtn);
        trafficlight.add(redBtn);
        trafficlight.add(orangeBtn);
        trafficlight.add(greenBtn);

        // Add trafficlight to the window
        win.add(trafficlight);
        win.setMinimumSize(new Dimension(300, 300));
        win.pack();
        win.setVisible(true);
    }
}
