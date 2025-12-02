import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * A button that changes from true to false when clicked
 * @author Jerry Fails
 */
public class BoolButton extends JButton
{
    private boolean state;
    
    /**
     * Creates a BoolButton with an initial state of false.
     */
    public BoolButton()
    {
        this.state = false;
        updateButton();
        this.addActionListener(new BoolActionListener());
    }

    /**
     * A private method to update the look of the button for when it's true and false
     */
    private void updateButton()
    {
        this.setText("" + state);
        if (state)
            this.setBackground(Color.GREEN);
        else this.setBackground(Color.RED);
    }

    /**
     * Private innter class to manage the actions on this BoolButton (change from false to true and vice versa)
     */
    private class BoolActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            state = !state;
            updateButton();
        }        
    }
}
