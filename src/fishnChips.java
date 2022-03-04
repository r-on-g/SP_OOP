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

public class fishnChips {

	public JFrame frame;
	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					fishnChips window = new fishnChips();
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
	public fishnChips() {
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
		ingredients.setBounds(53, 117, 174, 41);
		contentPane.add(ingredients);
		
		JLabel directions = new JLabel("Directions");
		directions.setFont(new Font("Tahoma", Font.PLAIN, 20));
		directions.setBounds(53, 398, 133, 41);
		contentPane.add(directions);
		
		JTextArea ingredientList = new JTextArea();
		ingredientList.setBackground(Color.LIGHT_GRAY);
		ingredientList.setText("4 large potatoes, peeled and cut into strips\r\n1 cup all-purpose flour \r\n1 teaspoon baking powder \r\n1 teaspoon salt \r\n1 teaspoon ground black pepper \r\n1 cup milk \r\n1 egg \r\n1 quart vegetable oil for frying \r\n1 1/2 pounds cod fillets");
		ingredientList.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		ingredientList.setBounds(49, 164, 627, 243);
		contentPane.add(ingredientList);
		
		JTextArea stepsList = new JTextArea();
		stepsList.setBackground(Color.LIGHT_GRAY);
		stepsList.setText("1) Place potatoes in a medium-size bowl of cold water. In a separate \r\nmedium-size mixing bowl, mix together flour, baking powder, salt, and pepper. \r\nStir in the milk and egg; stir until the mixture is smooth. Let mixture stand for 20 minutes.\r\n\r\n2) Preheat the oil in a large pot or electric skillet to 350 degrees F (175 degrees C).\r\n\r\n3) Fry the potatoes in the hot oil until they are tender. Drain them on paper towels.\r\n\r\n4) Dredge the fish in the batter, one piece at a time, and place them in the hot oil. \r\nFry until the fish is golden brown. If necessary, increase the heat to maintain the \r\n350 degrees F (175 degrees C) temperature. Drain well on paper towels.\r\n\r\n5) Fry the potatoes again for 1 to 2 minutes for added crispness");
		stepsList.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		stepsList.setBounds(53, 452, 917, 488);
		contentPane.add(stepsList);
		
		JLabel lblNewLabel = new JLabel("Fish n Chips");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setBounds(53, 69, 192, 41);
		contentPane.add(lblNewLabel);
	}

}
