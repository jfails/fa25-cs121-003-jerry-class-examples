import java.awt.GridLayout;
import java.awt.Component;

import javax.swing.JPanel;

public class Farm extends JPanel {

    /**
     * Create a farm that is the specified size (square).
     * @param size the size of the farm
     */
    public Farm(int size)
    {
        this.setLayout(new GridLayout(size, size));
        for (int i = 0; i < size * size; i++)
        {
            this.add(new PlantButton());
        }
    }

    /**
     * Resets the Farm to the default plant.
     */
    public void reset()
    {
        for (Component pb : this.getComponents())
        {
            ((PlantButton)pb).reset();
        }
    }
}
