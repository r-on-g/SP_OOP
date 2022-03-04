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

public class garlicChicken {

	public JFrame frame;
	public JPanel contentPane;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					garlicChicken window = new garlicChicken();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public garlicChicken() {
		initialize();
	}


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
		ingredients.setBounds(49, 104, 174, 41);
		contentPane.add(ingredients);
		
		JLabel directions = new JLabel("Directions");
		directions.setFont(new Font("Tahoma", Font.PLAIN, 20));
		directions.setBounds(49, 366, 133, 41);
		contentPane.add(directions);
		
		JTextArea ingredientList = new JTextArea();
		ingredientList.setBackground(Color.LIGHT_GRAY);
		ingredientList.setText("6 \tchicken thighs , bone in or out, with or without skin*\r\nSalt and pepper , to season\r\n2 teaspoons \tgarlic powder , to season\r\n6 cloves\t garlic , crushed\r\n1/3 cup \thoney\r\n1/4 cup \twater (or chicken broth)\r\n2 tablespoons \trice wine vinegar\r\n1 tablespoon \tsoy sauce");
		ingredientList.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		ingredientList.setBounds(49, 155, 650, 214);
		contentPane.add(ingredientList);
		
		JTextArea stepsList = new JTextArea();
		stepsList.setBackground(Color.LIGHT_GRAY);
		stepsList.setText("1) Season chicken with salt, pepper and garlic powder; set aside. Heat a pan \r\nor skillet over medium high heat; sear chicken thigh fillets or breast fillets on\r\n both sides until golden and cooked through.\r\n\r\n2) FOR BONE IN THIGHS:\r\nReduce heat after searing on both sides, cover skillet with a lid and continue \r\ncooking until the chicken is cooked through, while turning every 5 minutes \r\nuntil done. Alternatively, see notes for oven method.\r\nDrain most of the excess oil from the pan, leaving about 2 tablespoons of pan \r\njuiced for added flavour.\r\n\r\n3) FOR SAUCE:\r\nWhen chicken is done and cooked through, arrange chicken skin-side up in \r\nthe pan (if cooking with skin); add the garlic between the chicken and fry until \r\nfragrant (about 30 seconds). Add the honey, water, vinegar and soy sauce. \r\nIncrease heat to medium-high and continue to cook until the sauce reduces \r\ndown and thicken slightly (about 3-4 minutes). Garnish with parsley and serve \r\nover vegetables, rice, pasta or with a salad.");
		stepsList.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		stepsList.setBounds(49, 420, 875, 503);
		contentPane.add(stepsList);
		
		JLabel lblNewLabel = new JLabel("Garlic Chicken");
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		lblNewLabel.setBounds(49, 59, 236, 33);
		contentPane.add(lblNewLabel);
	}

}
