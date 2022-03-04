/* p1519510 Goh Jun Rong DCPE/FT/3B/02*/

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JButton;

public class omelette {

	public JFrame frame;
	public JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					omelette window = new omelette();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public omelette() {
		initialize();
	}


	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBounds(0, 0, 1000, 800);
		contentPane.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(contentPane);
		contentPane.setLayout(null);
		
		JLabel ingredients = new JLabel("Ingredients");
		ingredients.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ingredients.setBounds(53, 129, 174, 41);
		contentPane.add(ingredients);
		
		JLabel directions = new JLabel("Directions");
		directions.setFont(new Font("Tahoma", Font.PLAIN, 20));
		directions.setBounds(53, 377, 133, 41);
		contentPane.add(directions);
		
		JTextArea ingredientList = new JTextArea();
		ingredientList.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		ingredientList.setBackground(Color.LIGHT_GRAY);
		ingredientList.setText("2 \teggs\r\n2 tbsp\twater\r\n1/8 tsp\tsalt\r\nDash\tpepper\r\n1 tsp\tbutter\r\n1/3 cup\tfilling, such as shredded cheese, finely chopped ham");
		ingredientList.setBounds(53, 183, 700, 187);
		contentPane.add(ingredientList);
		
		JTextArea stepsList = new JTextArea();
		stepsList.setBackground(Color.LIGHT_GRAY);
		stepsList.setText("1) BEAT eggs, water, salt and pepper in small bowl until blended.\r\n\r\n2) HEAT butter in 6 to 8-inch nonstick omelet pan or skillet over medium-high heat \r\nuntil hot. TILT pan to coat bottom. POUR IN egg mixture. Mixture should set \r\nimmediately at edges.\r\n\r\n3) GENTLY PUSH cooked portions from edges toward the center with inverted \r\nturner so that uncooked eggs can reach the hot pan surface.\r\nCONTINUE cooking, tilting pan and gently moving cooked portions as needed.\r\n\r\n4) When top surface of eggs is thickened and no visible liquid egg remains, \r\nPLACE filling on one side of the omelet. \r\nFOLD omelet in half with turner. \r\nWith a quick flip of the wrist, turn pan and INVERT or SLIDE omelet onto plate. \r\nSERVE immediately.");
		stepsList.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		stepsList.setBounds(53, 431, 917, 379);
		contentPane.add(stepsList);
		
		JButton homeButton = new JButton("Homepage");
		homeButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		homeButton.setBounds(30, 13, 156, 33);
		homeButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
				frame.dispose();
				mainPage a = new mainPage();
				a.frame.setVisible(true);
			}
		}
		);
		contentPane.add(homeButton);
		
		JButton recipeFinderButton = new JButton("Search with new ingredients");
		recipeFinderButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		recipeFinderButton.setBounds(211, 13, 290, 33);
		recipeFinderButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
				frame.dispose();
				recipeFinder a = new recipeFinder();
				a.frame.setVisible(true);
			}
		}
		);
		contentPane.add(recipeFinderButton);
		
		JLabel omelette = new JLabel("Omelette");
		omelette.setForeground(Color.PINK);
		omelette.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		omelette.setBounds(53, 70, 194, 46);
		contentPane.add(omelette);
	}
}
