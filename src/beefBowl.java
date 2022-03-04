/* p1519510 Goh Jun Rong DCPE/FT/3B/02*/

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class beefBowl {

	public JFrame frame;
	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					beefBowl window = new beefBowl();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public beefBowl() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBounds(0, 0, 1000, 800);
		contentPane.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(contentPane);
		contentPane.setLayout(null);
		
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
		
		JLabel ingredients = new JLabel("Ingredients");
		ingredients.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ingredients.setBounds(53, 106, 174, 41);
		contentPane.add(ingredients);
		
		JLabel directions = new JLabel("Directions");
		directions.setFont(new Font("Tahoma", Font.PLAIN, 20));
		directions.setBounds(53, 411, 133, 41);
		contentPane.add(directions);
		
		JTextArea ingredientList = new JTextArea();
		ingredientList.setBackground(Color.LIGHT_GRAY);
		ingredientList.setText("1/2 onion\r\n1 green onion/scallion\r\n1/2 cup dashi\r\n1 Tbsp sake\r\n2 Tbsp mirin\r\n1 Tbsp granulated sugar\r\n2 Tbsp soy sauce\r\n3/4 lb thinly sliced beef (chuck or rib eye)\r\n2 Tbsp pickled red ginger\r\n2-3 Onsen egg");
		ingredientList.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		ingredientList.setBounds(54, 160, 627, 253);
		contentPane.add(ingredientList);
		
		JTextArea stepsList = new JTextArea();
		stepsList.setBackground(Color.LIGHT_GRAY);
		stepsList.setText("1) Cut beef into thin slices\r\n\r\n2) Cut the onion thinly into slices and chop the green onion. Set aside.\r\n\r\n3) Heat a large frying pan over medium high heat and add 1/2 cup (120 ml) dashi, \r\n1 Tbsp. sake, 1 Tbsp. sugar, 2 Tbsp. mirin, and 2 Tbsp. soy sauce.\r\n\r\n4) Cover the lid and bring the sauce to boil. Once the sauce is boiling, add the\r\n sliced onions and spread them out. Cover to cook until tender (if you don\u2019t cover, \r\nthe sauce will evaporate, so make sure you cover the lid).\r\n\r\n5) When the onion is tender, add the beef and cook until no longer pink. \r\nSkim the foam or fat with a fine mesh sieve.\r\n\r\n6) Serve the meat and sauce over steamed rice.\r\n\r\n7) Top with chopped green onion and pickled red ginger. If you like to add an egg, \r\nserve with Onsen Tamago. Alternatively, you can pour beaten egg over the meat \r\nwhen it\u2019s almost finished cooking in the pan");
		stepsList.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		stepsList.setBounds(53, 465, 917, 488);
		contentPane.add(stepsList);
		
		JLabel lblNewLabel = new JLabel("Beef Bowl");
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		lblNewLabel.setBounds(53, 59, 200, 33);
		contentPane.add(lblNewLabel);
	}

}
