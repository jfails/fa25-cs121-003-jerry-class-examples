import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * CS 121 Project 0: Traffic Animation
 *
 * Animates a [put your description here]
 *
 * @author BSU CS 121 Instructors
 * @author [put your name here]
 */
@SuppressWarnings("serial")
public class TrafficAnimation extends JPanel
{
	// This is where you declare constants and variables that need to keep their
	// values between calls	to paintComponent(). Any other variables should be
	// declared locally, in the method where they are used.

	/**
	 * A constant to regulate the frequency of Timer events.
	 * Note: 100ms is 10 frames per second - you should not need
	 * a faster refresh rate than this
	 */
	private final int DELAY = 50; //milliseconds

	/**
	 * The anchor coordinate for drawing / animating. All of your vehicle's
	 * coordinates should be relative to this offset value.
	 */
	private int xOffset = 0;

	/**
	 * The number of pixels added to xOffset each time paintComponent() is called.
	 */
	private int stepSize = 10;

	private Color myColor;

	private final Color BACKGROUND_COLOR = Color.black;

	/* This method draws on the panel's Graphics context.
	 * This is where the majority of your work will be.
	 *
	 * (non-Javadoc)
	 * @see java.awt.Container#paint(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g)
	{
		// Get the current width and height of the window.
		int width = getWidth(); // panel width
		int height = getHeight(); // panel height

		// Fill the graphics page with the background color.
		g.setColor(BACKGROUND_COLOR);
		g.fillRect(0, 0, width, height);

		// Calculate the new xOffset position of the moving object.
		xOffset  = (xOffset + stepSize) % width;

		// This draws a green square. Replace it with your own object.
		int squareW = height/5;
		int squareH = squareW; 
		int squareX = xOffset;
		int squareY = height/2 - squareW/2;

		g.setColor(Color.green);
		// g.fillRect(squareX, squareY, squareW, squareH);

		// TODO: Use width, height, and xOffset to draw your scalable objects
		// at their new positions on the screen

		int snakeX = squareX;
		int snakeY = squareY;
		int snakeW = squareW * 4;
		int snakeH = squareH*2;

		// draw snake tongue
		g.setColor(Color.RED);
		g.drawLine(snakeX + snakeW - snakeW/5, snakeY + 2*snakeH/3, snakeX + snakeW, snakeY + 2*snakeH/3);

		// draw snake head
		g.setColor(myColor);
		g.fillOval(snakeX + snakeW/2, snakeY, snakeW/3, snakeH);
		// draw snake body
		g.fillRect(snakeX + snakeW/6, snakeY + snakeH/4, snakeW/2, snakeH/2);
		// draw snake tail
		g.fillOval(snakeX, snakeY + snakeH/4, snakeW/3, snakeH/2);
		// draw snake eye
		g.setColor(Color.BLACK);
		g.fillArc(snakeX + 2*snakeW/3, snakeY + snakeH/6, snakeW/15, snakeH/4, 180, 180);

		
		Polygon p = new Polygon();
		p.addPoint(snakeX, snakeY);
		p.addPoint(snakeX+snakeW, snakeY);
		p.addPoint(snakeX, snakeY+snakeH);

		g.setColor(Color.CYAN);
		g.drawPolygon(p);


		// Put your code above this line. This makes the drawing smoother.
		Toolkit.getDefaultToolkit().sync();
	}


	//==============================================================
	// You don't need to modify anything beyond this point.
	//==============================================================


	/**
	 * Starting point for this program. Your code will not go in the
	 * main method for this program. It will go in the paintComponent
	 * method above.
	 *
	 * DO NOT MODIFY this method!
	 *
	 * @param args unused
	 */
	public static void main (String[] args)
	{
		// DO NOT MODIFY THIS CODE.
		JFrame frame = new JFrame ("Traffic Animation");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new TrafficAnimation());
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * Constructor for the display panel initializes necessary variables.
	 * Only called once, when the program first begins. This method also
	 * sets up a Timer that will call paint() with frequency specified by
	 * the DELAY constant.
	 */
	public TrafficAnimation()
	{
		// Do not initialize larger than 800x600. I won't be able to
		// grade your project if you do.
		int initWidth = 600;
		int initHeight = 400;
		setPreferredSize(new Dimension(initWidth, initHeight));
		this.setDoubleBuffered(true);

		Random r = new Random();
		myColor = new Color(r.nextInt(256), r.nextInt(256), r.nextInt(256));

		//Start the animation - DO NOT REMOVE
		startAnimation();
	}

	/**
	 * Create an animation thread that runs periodically.
	 * DO NOT MODIFY this method!
	 */
	private void startAnimation()
	{
		ActionListener timerListener = new TimerListener();
		Timer timer = new Timer(DELAY, timerListener);
		timer.start();
	}

	/**
	 * Repaints the graphics panel every time the timer fires.
	 * DO NOT MODIFY this class!
	 */
	private class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			repaint();
		}
	}
}
