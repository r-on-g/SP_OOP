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

public class macnCheese {

	public JFrame frame;
	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					macnCheese window = new macnCheese();
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
	public macnCheese() {
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
		ingredients.setBounds(53, 130, 174, 41);
		contentPane.add(ingredients);
		
		JLabel directions = new JLabel("Directions");
		directions.setFont(new Font("Tahoma", Font.PLAIN, 20));
		directions.setBounds(53, 411, 133, 41);
		contentPane.add(directions);
		
		JTextArea ingredientList = new JTextArea();
		ingredientList.setBackground(Color.LIGHT_GRAY);
		ingredientList.setText("8 ounces uncooked elbow macaroni\r\n2 cups shredded sharp cheddar cheese\r\n1/2 cup grated parmesan cheese\r\n3 cups milk\r\n1/4 cup butter\r\n2 1/2 tablespoon all purpose flour\r\n2 tablespoons butter\r\n1/2 cup bread crumbs\r\n1 pinch paprika");
		ingredientList.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		ingredientList.setBounds(53, 173, 627, 243);
		contentPane.add(ingredientList);
		
		JTextArea stepsList = new JTextArea();
		stepsList.setBackground(Color.LIGHT_GRAY);
		stepsList.setText("1) Cook macaroni according to the package directions. Drain.\r\n\r\n2) In a saucepan, melt butter or margarine over medium heat. Stir in enough flour \r\nto make a roux. Add milk to roux slowly, stirring constantly. Stir in cheeses, \r\nand cook over low heat until cheese is melted and the sauce is a little thick. \r\nPut macaroni in large casserole dish, and pour sauce over macaroni. Stir well.\r\n\r\n3) Melt butter or margarine in a skillet over medium heat. Add breadcrumbs and \r\nbrown. Spread over the macaroni and cheese to cover. Sprinkle with a little paprika.\r\n\r\n4) Bake at 350 degrees F (175 degrees C) for 30 minutes. Serve.");
		stepsList.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		stepsList.setBounds(53, 465, 917, 488);
		contentPane.add(stepsList);
		
		JLabel lblNewLabel = new JLabel("Mac n Cheese");
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 30));
		lblNewLabel.setBounds(53, 71, 231, 48);
		contentPane.add(lblNewLabel);
	}

}
