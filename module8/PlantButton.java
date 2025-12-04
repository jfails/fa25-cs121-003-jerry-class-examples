import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

/**
 * A button that cycles through the plants when clicked
 * @author Jerry Fails
 */
public class PlantButton extends JButton
{
    
    private int plantIndex;
    
    /**
     * Creates a PlantButton with the first value in the PlantType enum.
     */
    public PlantButton()
    {
        reset();
        this.addActionListener(new PlantActionListener());
    }

    /**
     * Returns the PlantType selected by this button
     * @return
     */
    public PlantType getPlantType()
    {
        PlantType[] enumVals = PlantType.values();
        if (plantIndex >=0 && plantIndex < enumVals.length)
        {
            return enumVals[plantIndex];
        }
        else return null;
    }

    /**
     * Resets the value to the first PlantType and updates the button.
     */
    public void reset()
    {
        this.plantIndex = 0;
        updateButton();
    }

    /**
     * A private method to update the look of the button for a new plant
     */
    private void updateButton()
    {
        this.setText("" + getPlantType());
        
    }

    /**
     * Private innter class to manage the actions on this PlantButton (change from false to true and vice versa)
     */
    private class PlantActionListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            plantIndex = (plantIndex + 1) % PlantType.values().length;
            updateButton();
        }        
    }
}
