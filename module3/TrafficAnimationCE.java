import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;
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
public class TrafficAnimationCE extends JPanel
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

	private Random random;
	private Color cowColor;
	private String name;

	private int angle;

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

		int cowX = squareX;
		int cowY = squareY;
		int cowW = squareW*2;
		int cowH = squareH*2;

		// // draw snake tongue
		// g.setColor(Color.RED);
		// g.drawLine(cowX + cowW - cowW/5, cowY + 2*cowH/3, cowX + cowW, cowY + 2*cowH/3);

		// draw snake head
		// g.setColor(myColor);
		// g.fillOval(snakeX + snakeW/2, snakeY, snakeW/3, snakeH);
		
		// draw cow body
		g.setColor(cowColor);
		g.fillRect(cowX, cowY + cowH/4, 2*cowW/3, cowH/2);
		
		// draw cow legs
		g.fillRect(cowX, cowY + 3*cowH/4, cowW/8, cowH/4);
		g.fillRect(cowX + 2*cowW/3 - cowW/8, cowY + 3*cowH/4, cowW/8, cowH/4);
		
		// draw cow head
		g.fillOval(cowX + 3*cowW/4, cowY, cowW/4, cowW/4);
		g.setFont(new Font("Arial", Font.BOLD, cowW/12));
		g.drawString("My name is " + name + "!", cowX+cowW, cowY+cowW/8);
		double headArea = Math.PI * Math.pow(cowW/8, 2);
		double valueOfCow = headArea * 15;
		DecimalFormat df = new DecimalFormat("#.00");
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		g.drawString(df.format(headArea) + " and this cow is worth " + nf.format(valueOfCow), cowX+cowW-cowW/8, cowY);

		// draw a tail
		angle = angle + stepSize;
		g.drawLine(cowX, cowY + cowH/4, 
			cowX - cowW/4, 
			cowY+cowH/4+cowH/16+(int)(Math.sin(Math.toRadians(angle))*cowH/16));

		// draw snake eye
		// g.setColor(Color.BLACK);
		// g.fillArc(cowX + 2*cowW/3, cowY + cowH/6, cowW/15, cowH/4, 180, 180);

		
		// Polygon p = new Polygon();
		// p.addPoint(cowX, cowY);
		// p.addPoint(cowX+cowW, cowY);
		// p.addPoint(cowX, cowY+cowH);

		// g.setColor(Color.CYAN);
		// g.drawPolygon(p);


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
		frame.getContentPane().add(new TrafficAnimationCE());
		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * Constructor for the display panel initializes necessary variables.
	 * Only called once, when the program first begins. This method also
	 * sets up a Timer that will call paint() with frequency specified by
	 * the DELAY constant.
	 */
	public TrafficAnimationCE()
	{
		// Do not initialize larger than 800x600. I won't be able to
		// grade your project if you do.
		int initWidth = 600;
		int initHeight = 400;

		angle = 0;

		setPreferredSize(new Dimension(initWidth, initHeight));
		this.setDoubleBuffered(true);

		random = new Random();
		cowColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

		// ask for name of cow
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What's the name of the cow: ");
		name = keyboard.nextLine();
		keyboard.close();

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
