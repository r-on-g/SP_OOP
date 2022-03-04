/* p1519510 Goh Jun Rong DCPE/FT/3B/02*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class recipeFound extends recipeFinder{
	

	public JFrame frame;
	public JPanel contentPane;
	
	
	JButton omeletteButton = new JButton("Omelette");
	JButton garlicChickenButton = new JButton("Garlic Chicken");
	JButton beefBowlButton = new JButton("Beef Bowl");
	JButton macnCheeseButton = new JButton("Mac n Cheese");
	JButton fishnChipsButton = new JButton("Fish n Chips");
	
	JLabel cookingTime = new JLabel("Cooking Time");
	JLabel recipes = new JLabel("Recipes Avaliable");
	JLabel omeletteTime = new JLabel("15 mins");
	JLabel garlicChickenTime = new JLabel("1h 15 mins");
	JLabel beefBowlTime = new JLabel("20 mins");
	JLabel macnCheeseTime = new JLabel("50 mins");
	JLabel fishnChipsTime = new JLabel("45 mins");
	
	GridBagConstraints gbc = new GridBagConstraints();
	
	
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
					{
						
						recipeFound window = new recipeFound();
						window.frame.setVisible(true);
					} 
				catch (Exception e) 
					{
						e.printStackTrace();
					}
			}
		});
	}

	
	public recipeFound() 
	{
		initialize();
	}

	private void initialize() 
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBounds(0, 0, 1000, 800);
		contentPane.setBackground(Color.LIGHT_GRAY);
		frame.add(contentPane);
		contentPane.setLayout(new GridBagLayout());
		
		JButton homeButton = new JButton("Homepage");
		homeButton.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent arg0) 
				{
					omeletteFound = "0";
					garlicChickenFound = "0";
					beefBowlFound = "0";
					macnCheeseFound = "0";
					fishnChipsFound = "0";
					frame.dispose();
					mainPage a = new mainPage();
					a.frame.setVisible(true);
				}
			}
			);
		homeButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gbc.gridx = 0;
		gbc.gridy = 0;
		contentPane.add(homeButton,gbc);
		
		JButton recipeFinderButton = new JButton("Search with new ingredients");
		recipeFinderButton.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent arg0) 
				{
					omeletteFound = "0";
					garlicChickenFound = "0";
					beefBowlFound = "0";
					macnCheeseFound = "0";
					fishnChipsFound = "0";
					frame.dispose();
					recipeFinder a = new recipeFinder();
					a.frame.setVisible(true);
				}
			}
			);
		recipeFinderButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gbc.gridx = 2;
		gbc.gridy = 0;
		contentPane.add(recipeFinderButton,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.insets = new Insets(50, 0, 15,0);
		recipes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		recipes.setForeground(Color.BLUE);
		recipes.setVisible(false);
		contentPane.add(recipes,gbc);
		
		gbc.gridx = 5;
		gbc.gridy = 1;
		cookingTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cookingTime.setForeground(Color.BLUE);
		cookingTime.setVisible(false);
		contentPane.add(cookingTime,gbc);
		
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx=0.5;
		gbc.insets = new Insets(15, 0, 15,0);
		omeletteButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		omeletteButton.setVisible(false);
		omeletteButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				omeletteFound = "0";
				garlicChickenFound = "0";
				beefBowlFound = "0";
				macnCheeseFound = "0";
				fishnChipsFound = "0";
				frame.dispose();
				omelette a = new omelette();
				a.frame.setVisible(true);
			}
		}
		);
		contentPane.add(omeletteButton,gbc);
		
		gbc.gridx = 5;
		gbc.gridy = 2;
		omeletteTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		omeletteTime.setVisible(false);
		contentPane.add(omeletteTime,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		garlicChickenButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		garlicChickenButton.setVisible(false);
		garlicChickenButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				omeletteFound = "0";
				garlicChickenFound = "0";
				beefBowlFound = "0";
				macnCheeseFound = "0";
				fishnChipsFound = "0";
				frame.dispose();
				garlicChicken a = new garlicChicken();
				a.frame.setVisible(true);
			}
		}
		);
		contentPane.add(garlicChickenButton,gbc);
		
		gbc.gridx = 5;
		gbc.gridy = 3;
		garlicChickenTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		garlicChickenTime.setVisible(false);
		contentPane.add(garlicChickenTime,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 6;
		beefBowlButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		beefBowlButton.setVisible(false);
		beefBowlButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				omeletteFound = "0";
				garlicChickenFound = "0";
				beefBowlFound = "0";
				macnCheeseFound = "0";
				fishnChipsFound = "0";
				frame.dispose();
				beefBowl a = new beefBowl();
				a.frame.setVisible(true);
			}
		}
		);
		contentPane.add(beefBowlButton,gbc);
		
		gbc.gridx = 5;
		gbc.gridy = 6;
		beefBowlTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		beefBowlTime.setVisible(false);
		contentPane.add(beefBowlTime,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 9;
		macnCheeseButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		macnCheeseButton.setVisible(false);
		macnCheeseButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				omeletteFound = "0";
				garlicChickenFound = "0";
				beefBowlFound = "0";
				macnCheeseFound = "0";
				fishnChipsFound = "0";
				frame.dispose();
				macnCheese a = new macnCheese();
				a.frame.setVisible(true);
			}
		}
		);
		contentPane.add(macnCheeseButton,gbc);
		
		gbc.gridx = 5;
		gbc.gridy = 9;
		macnCheeseTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		macnCheeseTime.setVisible(false);
		contentPane.add(macnCheeseTime,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 12;
		fishnChipsButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fishnChipsButton.setVisible(false);
		fishnChipsButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				omeletteFound = "0";
				garlicChickenFound = "0";
				beefBowlFound = "0";
				macnCheeseFound = "0";
				fishnChipsFound = "0";
				frame.dispose();
				fishnChips a = new fishnChips();
				a.frame.setVisible(true);
			}
		}
		);
		contentPane.add(fishnChipsButton,gbc);
		
		gbc.gridx = 5;
		gbc.gridy = 12;
		fishnChipsTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		fishnChipsTime.setVisible(false);
		contentPane.add(fishnChipsTime,gbc);
		
		
	}
	
	public void matchingRecipeFound()
	{
		if ( omeletteFound == "1")
		{
			recipes.setVisible(true);
			cookingTime.setVisible(true);
			omeletteButton.setVisible(true);
			omeletteTime.setVisible(true);
			contentPane.revalidate();
			contentPane.repaint();
		}
		
		if (garlicChickenFound == "1")
		{
			recipes.setVisible(true);
			cookingTime.setVisible(true);
			garlicChickenButton.setVisible(true);
			garlicChickenTime.setVisible(true);
			contentPane.revalidate();
			contentPane.repaint();
		}
		
		if (beefBowlFound == "1")
		{
			recipes.setVisible(true);
			cookingTime.setVisible(true);
			beefBowlButton.setVisible(true);
			beefBowlTime.setVisible(true);
			contentPane.repaint();
		}
		
		if (macnCheeseFound == "1")
		{
			recipes.setVisible(true);
			cookingTime.setVisible(true);
			macnCheeseButton.setVisible(true);
			macnCheeseTime.setVisible(true);
			contentPane.revalidate();
			contentPane.repaint();
		}
		
		if (fishnChipsFound == "1")
		{
			recipes.setVisible(true);
			cookingTime.setVisible(true);
			fishnChipsButton.setVisible(true);
			fishnChipsTime.setVisible(true);
			contentPane.revalidate();
			contentPane.repaint();
		}
	}

}
