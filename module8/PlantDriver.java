import java.awt.Dimension;

import javax.swing.JFrame;

public class PlantDriver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Truth Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setContentPane(new Farm(10));
        frame.setContentPane(new FarmControlPanel());
        frame.setMinimumSize(new Dimension(200,200));
        frame.pack();
        frame.setVisible(true);
    }
}
