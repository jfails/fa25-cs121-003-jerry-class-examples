import java.awt.Dimension;

import javax.swing.JFrame;

public class TruthTableDriver {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Truth Table");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new TruthTable());
        frame.setMinimumSize(new Dimension(200,200));
        frame.pack();
        frame.setVisible(true);
    }
}
