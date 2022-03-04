/* p1519510 Goh Jun Rong DCPE/FT/3B/02*/

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mainPage {

	public JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainPage window = new mainPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public mainPage()
	{
		initialize();
	}

	private void initialize() 
	{
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton ingredientTracker = new JButton("Ingredient Tracker");
		ingredientTracker.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ingredientTracker.setForeground(Color.BLACK);
		ingredientTracker.setBounds(160, 302, 245, 145);
		ingredientTracker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				frame.dispose();
				ingredientTracker2 ingredientTrackerPage = new ingredientTracker2();
				ingredientTrackerPage.frame.setVisible(true);
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(ingredientTracker);
		
		JButton recipeFinder = new JButton("Recipe finder ");
		recipeFinder.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.dispose();
				recipeFinder recipeFinderPage = new recipeFinder();
				recipeFinderPage.frame.setVisible(true);
			}
		});
		recipeFinder.setFont(new Font("Tahoma", Font.PLAIN, 20));
		recipeFinder.setBounds(636, 302, 245, 145);
		frame.getContentPane().add(recipeFinder);
		
		JLabel welcome = new JLabel("Welcome");
		welcome.setFont(new Font("Trebuchet MS", Font.PLAIN, 40));
		welcome.setBounds(429, 85, 192, 126);
		frame.getContentPane().add(welcome);
	}
	
	
}
