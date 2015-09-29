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

        // make trafficlight
        Trafficlight trafficlight = new Trafficlight();
        JButton resetBtn = new JButton("Reset");
        resetBtn.setActionCommand("reset");
        resetBtn.addActionListener(e -> {
            // TODO make reset action
            System.out.println("add reset action");
        });
        JButton redBtn = new JButton("Red");
        redBtn.addActionListener(e -> {
            // TODO make redBtn action
            System.out.println("add redBtn action");
        });
        JButton orangeBtn = new JButton("Orange");
        orangeBtn.addActionListener(e -> {
            // TODO make orangeBtn action
            System.out.println("add orangeBtn action");
        });
        JButton greenBtn = new JButton("Green");
        greenBtn.addActionListener(e -> {
            // TODO make greenBtn action
            System.out.println("add greenBtn action");
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
