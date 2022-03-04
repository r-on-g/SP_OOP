/* p1519510 Goh Jun Rong DCPE/FT/3B/02*/

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class recipeFinder  {

	public JFrame frame;
	public JPanel contentPane;
	
	JLabel ingredientOne = new JLabel ("Enter Ingredient");
	JLabel ingredientTwo = new JLabel ("Enter Ingredient");
	JLabel ingredientThree = new JLabel ("Enter Ingredient");
	
	JTextField ingredient1 = new JTextField();
	JTextField ingredient2 = new JTextField();
	JTextField ingredient3 = new JTextField();
	
	JLabel notFound = new JLabel("Recipe not found for entered ingredients");
	
	String omelette [] = {"egg","cheese","ham","butter","water"};
	String garlicChicken [] = {"chicken","garlic","honey","water","chicken broth","rice wine vinegar","soy sauce"};
	String beefBowl[] = {"beef","egg","onion","scallion","sake","dashi","mirin","granulated sugar","soy sauce","pickled red ginger"};
	String macnCheese[] = {"macroni","cheese","milk","butter","bread crumbs","flour","paprika"};
	String fishnChips[] = {"fish","flour","potato","egg","milk","baking powder","vegetable oil"};
	
	static String omeletteFound,garlicChickenFound,beefBowlFound,macnCheeseFound,fishnChipsFound;
	
	GridBagConstraints gbc = new GridBagConstraints();

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try
				{
					recipeFinder window = new recipeFinder();
					window.frame.setVisible(true);
				} 
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	
	public recipeFinder()
	{
		initialize();
	}


	private void initialize() 
	{
		
	
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane  = new JPanel();
		contentPane.setBounds(0, 0, 1000, 800);
		contentPane.setBackground(Color.LIGHT_GRAY);
		frame.add(contentPane);
		contentPane.setLayout(new GridBagLayout());
		
		JButton homeButton = new JButton("Homepage");
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
		homeButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		gbc.gridx = 1;
		gbc.gridy = 0;	
		gbc.insets = new Insets(15, 100, 15,15);
		gbc.gridwidth=2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		contentPane.add(homeButton,gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.insets = new Insets(0, 100, 0, 0);
		ingredientOne.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(ingredientOne,gbc);
		
		gbc.gridx = 5;
		gbc.gridy = 3;
		gbc.insets = new Insets(15, 0, 15,100);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		ingredient1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(ingredient1,gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 6;
		gbc.weightx = 0.5;
		gbc.insets = new Insets(0, 100, 0, 0);
		ingredientTwo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(ingredientTwo,gbc);
		
		gbc.gridx = 5;
		gbc.gridy = 6;
		gbc.insets = new Insets(15, 0, 15,100);
		gbc.weightx = 0.5;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		ingredient2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(ingredient2,gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 9;
		gbc.weightx = 0.5;
		gbc.insets = new Insets(0, 100, 0, 0);
		ingredientThree.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(ingredientThree,gbc);
		
		gbc.gridx = 5;
		gbc.gridy = 9;
		gbc.insets = new Insets(15, 0, 15,100);
		gbc.weightx = 0.5;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		ingredient3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(ingredient3,gbc);
		
		
		gbc.gridx = 3;
		gbc.gridy = 20;
		gbc.weightx= 0.2;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		JButton searchButton = new JButton("search");
		searchButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		searchButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
				
				String search [] = {ingredient1.getText(),ingredient2.getText(),ingredient3.getText()};
				for(int i=0; i <search.length; i++)
					{
						for (int y=0; y<omelette.length; y++)
							{
								if (search[i].equalsIgnoreCase(omelette[y]))
									{
										omeletteFound = "1";
									}
							}
						
						for (int y=0; y<garlicChicken.length;y++)
							{
								if (search[i].equalsIgnoreCase(garlicChicken[y]))
									{
										garlicChickenFound = "1";
									}
								
							}
						
						for (int y=0; y<beefBowl.length;y++)
							{
								if (search[i].equalsIgnoreCase(beefBowl[y]))
									{
										beefBowlFound = "1";
									}
							}
						
								
						for (int y=0; y<macnCheese.length;y++)
							{
								if (search[i].equalsIgnoreCase(macnCheese[y]))
									{
										macnCheeseFound = "1";
									}
							}
						
						for (int y=0; y<fishnChips.length;y++)
						{
							if (search[i].equalsIgnoreCase(fishnChips[y]))
								{
									fishnChipsFound = "1";
								}
						}
							
							
					}
				
					if ( omeletteFound == "1" || garlicChickenFound == "1" ||beefBowlFound =="1"|| macnCheeseFound == "1" || fishnChipsFound == "1")
					{
						
						frame.dispose();
						recipeFound a = new recipeFound();
						a.matchingRecipeFound();
						a.frame.setVisible(true);
					}
					else
					{
						gbc.gridx=3;
						gbc.gridy=30;
						notFound.setFont(new Font("Tahoma", Font.PLAIN, 20));
						notFound.setForeground(Color.BLUE);
						contentPane.add(notFound,gbc);
						contentPane.revalidate();
						contentPane.repaint();
						
					}
				
				}
				
				
			
		}
		);
		contentPane.add(searchButton,gbc);
		
		
	}
	
	
	
	
}


