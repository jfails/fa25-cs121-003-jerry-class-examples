import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TruthTable extends JPanel
{
    // FIELDS
    private int clickCount;
    private JButton button;
    private JLabel label;

    /**
     * Default constructor for TruthTable (with a button and a label).
     */
    public TruthTable()
    {
        this.clickCount = 0;

        this.setLayout(new BorderLayout());

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(4,4));

        for (int i = 0; i < 9; i++)
        {
            BoolButton button = new BoolButton();
            gridPanel.add(button);
            button.addActionListener(new MyActionListener());
        }
        this.label = new JLabel("Num Clicked: " + clickCount);

        this.add(gridPanel, BorderLayout.CENTER);
        this.add(label, BorderLayout.NORTH);

        this.setPreferredSize(new Dimension(600,400));
    }


    private class MyActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            clickCount++;
            label.setText("Num Clicked: " + clickCount);
        }
    }
    
}
