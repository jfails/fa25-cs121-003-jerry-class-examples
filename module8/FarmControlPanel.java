import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class FarmControlPanel extends JPanel {
    
    private Farm farm;

    public FarmControlPanel()
    {
        this.setLayout(new BorderLayout());
        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new MyActionListener());
        this.add(resetButton, BorderLayout.NORTH);
        this.farm = new Farm(10);
        this.add(farm, BorderLayout.CENTER);
    }

    public class MyActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            farm.reset();
        }   
    }
}
