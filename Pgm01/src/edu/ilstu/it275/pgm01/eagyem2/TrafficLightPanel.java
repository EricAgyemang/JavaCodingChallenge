package edu.ilstu.it275.pgm01.eagyem2;

/**
 * @author eagyem2
 * Importing required libraries into java
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * The class here is TrafficLightPanel and this class describe the traffic light 
 * or stop light extended to JPanel
 */
public class TrafficLightPanel extends JPanel {
    // Initializing the attributes of the class TrafficLightPanel at the point of their declaration
	private static final long serialVersionUID = 12345;
	private static final int PANEL_HEIGHT = 400;
	private static final int PANEL_WIDTH = 400;
	
	// Declaring the method TrafficLightPanel as public to be accessible and used
	public TrafficLightPanel() {
	
		setPreferredSize(new Dimension(PANEL_HEIGHT, PANEL_WIDTH));
		setBackground(Color.WHITE);
	}

	// Using the paint method to draw our rectangles and colored ovals each with one stop light color
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// PUT CODE HERE TO PAINT CIRCLES & RETANGLES!
		//color in the red color for the first oval shape
		g.drawRect(120, 120, 150, 50);
		g.setColor(Color.RED);
		g.fillOval(130, 130, 30, 30);
 
		//color in the yellow color for the second oval shape
		g.setColor(Color.YELLOW);
		g.fillOval(180, 130, 30, 30);
		
		//color in the green color for the third oval shape
		g.setColor(Color.GREEN);
		g.fillOval(230, 130, 30, 30);
		

	}
	
	/**
	 * @param layout
	 */
	public TrafficLightPanel(LayoutManager layout) {
		super(layout);
	}

	/**
	 * @param isDoubleBuffered
	 */
	public TrafficLightPanel(boolean isDoubleBuffered) {
		super(isDoubleBuffered);
	}

	/**
	 * @param layout
	 * @param isDoubleBuffered
	 */
	public TrafficLightPanel(LayoutManager layout, boolean isDoubleBuffered) {
		super(layout, isDoubleBuffered);
	}

	// Declaring the main method 
	public static void main(String[] args) {
		JFrame frame = new JFrame("The Traffic Light");
		TrafficLightPanel panel = new TrafficLightPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}	
	
}