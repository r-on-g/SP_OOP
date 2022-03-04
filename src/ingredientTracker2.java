/* p1519510 Goh Jun Rong DCPE/FT/3B/02*/

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.io.*;

public class ingredientTracker2 
{

	public JFrame frame;
	public JPanel contentPane;
	
	public Scanner sc;
	
	int row1AlertLevel,row2AlertLevel,row3AlertLevel,row4AlertLevel,row5AlertLevel,row6AlertLevel ;
	String alert1State,alert2State,alert3State,alert4State,alert5State,alert6State;
	
	JLabel ingredient = new JLabel("Ingredient");
	JLabel quantity = new JLabel("Quantity");
	
	JTextField ingredient1 = new JTextField ();
	JTextField quantity1  = new JTextField ();
	JButton addButton = new JButton("Add");
	JButton minusButton = new JButton("Minus");
	JButton alertButton = new JButton("Alert");
	JLabel alert1 = new JLabel();
	
	JTextField ingredient2 = new JTextField ();
	JTextField quantity2  = new JTextField ();
	JButton addButton2 = new JButton("Add");
	JButton minusButton2 = new JButton("Minus");
	JButton alertButton2 = new JButton("Alert");
	JLabel alert2 = new JLabel();
	
	JTextField ingredient3 = new JTextField ();
	JTextField quantity3  = new JTextField ();
	JButton addButton3 = new JButton("Add");
	JButton minusButton3 = new JButton("Minus");
	JButton alertButton3 = new JButton("Alert");
	JLabel alert3 = new JLabel();
	
	JTextField ingredient4 = new JTextField ();
	JTextField quantity4  = new JTextField ();
	JButton addButton4 = new JButton("Add");
	JButton minusButton4 = new JButton("Minus");
	JButton alertButton4 = new JButton("Alert");
	JLabel alert4 = new JLabel();
	
	JTextField ingredient5 = new JTextField ();
	JTextField quantity5  = new JTextField ();
	JButton addButton5 = new JButton("Add");
	JButton minusButton5 = new JButton("Minus");
	JButton alertButton5 = new JButton("Alert");
	JLabel alert5 = new JLabel();
	
	JTextField ingredient6 = new JTextField ();
	JTextField quantity6  = new JTextField ();
	JButton addButton6 = new JButton("Add");
	JButton minusButton6 = new JButton("Minus");
	JButton alertButton6 = new JButton("Alert");
	JLabel alert6 = new JLabel();
	
	int county = 100;
	
	GridBagConstraints gbc = new GridBagConstraints();
	

	public static void main(String[] args)  
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					ingredientTracker2 window = new ingredientTracker2();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}


	public ingredientTracker2() 
	{
		initialize();
	}

	
	private void initialize() 
	{
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new JPanel();
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
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		contentPane.add(homeButton,gbc);
				
				readFile1();
				row1();
				readFile2();
				row2();
				readFile3();
				row3();
				readFile4();
				row4();
				readFile5();
				row5();
				readFile6();
				row6();
				
				gbc.gridx=0;
				gbc.gridy=50;
				gbc.insets= new Insets(20,50,0,0);
				ingredient.setFont(new Font("Tahoma", Font.PLAIN, 30));
				contentPane.add(ingredient,gbc);
				
				gbc.gridx=1;
				gbc.gridy=50;
				gbc.insets= new Insets(0,120,0,0);
				quantity.setFont(new Font("Tahoma", Font.PLAIN, 30));
				contentPane.add(quantity,gbc);
				
				gbc.gridx=1;
				gbc.gridy=3;
				gbc.gridwidth = 5;
				gbc.fill= GridBagConstraints.HORIZONTAL;
				alert1.setFont(new Font("Tahoma", Font.PLAIN, 30));
				alert1.setForeground(Color.BLUE);
				alert1.setText(ingredient1.getText() + " is running low");
				
				gbc.gridx=1;
				gbc.gridy=5;
				gbc.gridwidth = 5;
				gbc.fill= GridBagConstraints.HORIZONTAL;
				alert2.setFont(new Font("Tahoma", Font.PLAIN, 30));
				alert2.setForeground(Color.BLUE);
				alert2.setText(ingredient2.getText() + " is running low");
				
				gbc.gridx=1;
				gbc.gridy=7;
				gbc.gridwidth = 5;
				gbc.fill= GridBagConstraints.HORIZONTAL;
				alert3.setFont(new Font("Tahoma", Font.PLAIN, 30));
				alert3.setForeground(Color.BLUE);
				alert3.setText(ingredient3.getText() + " is running low");
				
				gbc.gridx=1;
				gbc.gridy=9;
				gbc.gridwidth = 5;
				gbc.fill= GridBagConstraints.HORIZONTAL;
				alert4.setFont(new Font("Tahoma", Font.PLAIN, 30));
				alert4.setForeground(Color.BLUE);
				alert4.setText(ingredient4.getText() + " is running low");
				
				gbc.gridx=1;
				gbc.gridy=11;
				gbc.gridwidth = 5;
				gbc.fill= GridBagConstraints.HORIZONTAL;
				alert5.setFont(new Font("Tahoma", Font.PLAIN, 30));
				alert5.setForeground(Color.BLUE);
				alert5.setText(ingredient5.getText() + " is running low");
				
				gbc.gridx=1;
				gbc.gridy=13;
				gbc.gridwidth = 5;
				gbc.fill= GridBagConstraints.HORIZONTAL;
				alert6.setFont(new Font("Tahoma", Font.PLAIN, 30));
				alert6.setForeground(Color.BLUE);
				alert6.setText(ingredient6.getText() + " is running low");
		
				JButton saveButton = new JButton("Save changes");
				saveButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
				gbc.gridx = 1;
				gbc.gridy = 9999;
				saveButton.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent arg0) 
					{
						if (ingredient1.getText().equals(""))
						{
							row1AlertLevel=0;
						}
						
						
						String row1 [] = {ingredient1.getText(),quantity1.getText(),Integer.toString(row1AlertLevel),alert1State};
						writeToFile1(row1);
						
						if (ingredient2.getText().equals(""))
						{
							row2AlertLevel=0;
						}
						
						String row2 [] = {ingredient2.getText(),quantity2.getText(),Integer.toString(row2AlertLevel),alert2State};
						writeToFile2(row2);
						
						if (ingredient3.getText().equals(""))
						{
							row3AlertLevel=0;
						}
						String row3 [] = {ingredient3.getText(),quantity3.getText(),Integer.toString(row3AlertLevel),alert3State};
						writeToFile3(row3);
						
						if (ingredient4.getText().equals(""))
						{
							row4AlertLevel=0;
						}
						String row4 [] = {ingredient4.getText(),quantity4.getText(),Integer.toString(row4AlertLevel),alert4State};
						writeToFile4(row4);
						
						if (ingredient5.getText().equals(""))
						{
							row5AlertLevel=0;
						}
						String row5 [] = {ingredient5.getText(),quantity5.getText(),Integer.toString(row5AlertLevel),alert5State};
						writeToFile5(row5);
						
						if (ingredient6.getText().equals(""))
						{
							row6AlertLevel=0;
						}
						String row6 [] = {ingredient6.getText(),quantity6.getText(),Integer.toString(row6AlertLevel),alert6State};
						writeToFile6(row6);
					}
					
				}
				);
				contentPane.add(saveButton,gbc);
				
	
		 	}
	
	public void readFile1()
	{
		try
		{
			sc = new Scanner(new File("src/row1.txt"));
			while (sc.hasNext())
			{
				
				String firstLine = sc.next();
				String secondLine = sc.next();
				String thirdLine = sc.next();
				String fourthLine = sc.next();
				
				if (firstLine.equals(""))
				{
					ingredient1.setText("");
				}
				else 
				{
					ingredient1.setText(firstLine);
				}
				if (secondLine.equals(""))
				{
					quantity1.setText("");
				}
				else 
				{
					quantity1.setText(secondLine);
				}
				
				row1AlertLevel = Integer.parseInt(thirdLine);
				
				if (fourthLine.equals("1"))
				{
					
					gbc.gridx=1;
					gbc.gridy=3;
					gbc.fill= GridBagConstraints.HORIZONTAL;
					contentPane.add(alert1,gbc);
				}
				
				alert1State = fourthLine;
				
			}
			
		}
		
		catch (Exception e)
		{
			
		}
		
	}
	
	public void writeToFile1(String textLine[]) 
	{
		
		try 
		{
			File file = new File ("src/row1.txt");
			
			if (!file.exists())
			{
				file.createNewFile();
			}
			
			PrintWriter print = new PrintWriter(file);
			for (int i =0; i<textLine.length; i++)
			{
				print.println(textLine[i]);
			}
			print.close();
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void readFile2()
	{
		try
		{
			sc = new Scanner(new File("src/row2.txt"));
			while (sc.hasNext())
			{
				
				String firstLine = sc.next();
				String secondLine = sc.next();
				String thirdLine = sc.next();
				String fourthLine = sc.next();
				
				if (firstLine.equals(""))
				{
					ingredient2.setText("");
				}
				else 
				{
					ingredient2.setText(firstLine);
				}
				if (secondLine.equals(""))
				{
					quantity2.setText("");
				}
				else 
				{
					quantity2.setText(secondLine);
				}
				
				row2AlertLevel = Integer.parseInt(thirdLine);
				
				if (fourthLine.equals("1"))
				{
					
					gbc.gridx=1;
					gbc.gridy=5;
					gbc.fill= GridBagConstraints.HORIZONTAL;
					contentPane.add(alert2,gbc);
				}
				
				alert2State = fourthLine;
				
			}
		}
		
		catch (Exception e)
		{
			
		}
		
	}
	
	public void writeToFile2(String textLine[]) 
	{
		
		try 
		{
			File file = new File ("src/row2.txt");
			
			if (!file.exists())
			{
				file.createNewFile();
			}
			
			PrintWriter print = new PrintWriter(file);
			for (int i =0; i<textLine.length; i++)
			{
				print.println(textLine[i]);
			}
			print.close();
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void readFile3()
	{
		try
		{
			sc = new Scanner(new File("src/row3.txt"));
			while (sc.hasNext())
			{
				
				String firstLine = sc.next();
				String secondLine = sc.next();
				String thirdLine = sc.next();
				String fourthLine = sc.next();
				
				if (firstLine.equals(""))
				{
					ingredient3.setText("");
				}
				else 
				{
					ingredient3.setText(firstLine);
				}
				if (secondLine.equals(""))
				{
					quantity3.setText("");
				}
				else 
				{
					quantity3.setText(secondLine);
				}
				
				row3AlertLevel = Integer.parseInt(thirdLine);
				
				if (fourthLine.equals("1"))
				{
					
					gbc.gridx=1;
					gbc.gridy=7;
					gbc.fill= GridBagConstraints.HORIZONTAL;
					contentPane.add(alert3,gbc);
				}
				
				alert3State = fourthLine;
			}
		}
		
		catch (Exception e)
		{
			
		}
		
	}
	
	public void writeToFile3(String textLine[]) 
	{
		
		try 
		{
			File file = new File ("src/row3.txt");
			
			if (!file.exists())
			{
				file.createNewFile();
			}
			
			PrintWriter print = new PrintWriter(file);
			for (int i =0; i<textLine.length; i++)
			{
				print.println(textLine[i]);
			}
			print.close();
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void readFile4()
	{
		try
		{
			sc = new Scanner(new File("src/row4.txt"));
			while (sc.hasNext())
			{
				
				String firstLine = sc.next();
				String secondLine = sc.next();
				String thirdLine = sc.next();
				String fourthLine = sc.next();
				
				if (firstLine.equals(""))
				{
					ingredient4.setText("");
				}
				else 
				{
					ingredient4.setText(firstLine);
				}
				if (secondLine.equals(""))
				{
					quantity4.setText("");
				}
				else 
				{
					quantity4.setText(secondLine);
				}
				
				row4AlertLevel = Integer.parseInt(thirdLine);
				
				if (fourthLine.equals("1"))
				{
					
					gbc.gridx=1;
					gbc.gridy=9;
					gbc.fill= GridBagConstraints.HORIZONTAL;
					contentPane.add(alert4,gbc);
				}
				
				alert4State = fourthLine;
			}
		}
		
		catch (Exception e)
		{
			
		}
		
	}
	
	public void writeToFile4(String textLine[]) 
	{
		
		try 
		{
			File file = new File ("src/row4.txt");
			
			if (!file.exists())
			{
				file.createNewFile();
			}
			
			PrintWriter print = new PrintWriter(file);
			for (int i =0; i<textLine.length; i++)
			{
				print.println(textLine[i]);
			}
			print.close();
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void readFile5()
	{
		try
		{
			sc = new Scanner(new File("src/row5.txt"));
			while (sc.hasNext())
			{
				
				String firstLine = sc.next();
				String secondLine = sc.next();
				String thirdLine = sc.next();
				String fourthLine = sc.next();
				
				if (firstLine.equals(""))
				{
					ingredient5.setText("");
				}
				else 
				{
					ingredient5.setText(firstLine);
				}
				if (secondLine.equals(""))
				{
					quantity5.setText("");
				}
				else 
				{
					quantity5.setText(secondLine);
				}
				
				row5AlertLevel = Integer.parseInt(thirdLine);
				
				if (fourthLine.equals("1"))
				{
					
					gbc.gridx=1;
					gbc.gridy=11;
					gbc.fill= GridBagConstraints.HORIZONTAL;
					contentPane.add(alert5,gbc);
				}
				
				alert5State = fourthLine;
			}
		}
		
		catch (Exception e)
		{
			
		}
		
	}
	
	public void writeToFile5(String textLine[]) 
	{
		
		try 
		{
			File file = new File ("src/row5.txt");
			
			if (!file.exists())
			{
				file.createNewFile();
			}
			
			PrintWriter print = new PrintWriter(file);
			for (int i =0; i<textLine.length; i++)
			{
				print.println(textLine[i]);
			}
			print.close();
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void readFile6()
	{
		try
		{
			sc = new Scanner(new File("src/row6.txt"));
			while (sc.hasNext())
			{
				
				String firstLine = sc.next();
				String secondLine = sc.next();
				String thirdLine = sc.next();
				String fourthLine = sc.next();
				
				if (firstLine.equals(""))
				{
					ingredient6.setText("");
				}
				else 
				{
					ingredient6.setText(firstLine);
				}
				if (secondLine.equals(""))
				{
					quantity6.setText("");
				}
				else 
				{
					quantity6.setText(secondLine);
				}
				
				row6AlertLevel = Integer.parseInt(thirdLine);
				
				if (fourthLine.equals("1"))
				{
					
					gbc.gridx=1;
					gbc.gridy=13;
					gbc.fill= GridBagConstraints.HORIZONTAL;
					contentPane.add(alert6,gbc);
				}
				
				alert6State = fourthLine;
			}
		}
		
		catch (Exception e)
		{
			
		}
		
	}
	
	public void writeToFile6(String textLine[]) 
	{
		
		try 
		{
			File file = new File ("src/row6.txt");
			
			if (!file.exists())
			{
				file.createNewFile();
			}
			
			PrintWriter print = new PrintWriter(file);
			for (int i =0; i<textLine.length; i++)
			{
				print.println(textLine[i]);
			}
			print.close();
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public void row1 ()
	{
		
		
		ingredient1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gbc.gridx = 0;
		gbc.gridy = 100;
		gbc.insets = new Insets(15, 15, 15,15);
		gbc.weightx= 0.5;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		contentPane.add(ingredient1,gbc);
		
		
		quantity1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gbc.gridx = 1;
		gbc.gridy = 100;
		gbc.insets = new Insets(15, 100, 15,10);
		gbc.weightx= 0.5;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		contentPane.add(quantity1,gbc);
		
		
		gbc.gridx = 4;
		gbc.gridy = 100;
		gbc.insets = new Insets(15, 15, 15,15);
		addButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
					if (!quantity1.getText().equals(""))
					{
						
						String quantity = quantity1.getText();
						int newQuantity= Integer.parseInt(quantity);
						newQuantity ++ ;
						quantity1.setText(Integer.toString(newQuantity));		
						
						String alertQuantity = quantity1.getText();
						int compareQuantity= Integer.parseInt(alertQuantity);
						
						if (compareQuantity > row1AlertLevel)
							{
								alert1State = "0";
								contentPane.remove(alert1);
								contentPane.revalidate();
								contentPane.repaint();
							}
					}
				}
				catch(NumberFormatException e)
				{
					JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity"); 
				}
			}
		});
		contentPane.add(addButton,gbc);
		
		
		gbc.gridx = 8;
		gbc.gridy = 100;
		gbc.insets = new Insets(15, 15, 15,15);
		minusButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		minusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
				
					if (!quantity1.getText().equals(""))
					{
					
						String quantity = quantity1.getText();
						int newQuantity= Integer.parseInt(quantity);
						newQuantity -- ;
						
						if(newQuantity == 0)
						{
								ingredient1.setText("");
								quantity1.setText("");
								alert1State = "0";
								contentPane.remove(alert1);
								contentPane.revalidate();
								contentPane.repaint();
						}
						else 
						{
								quantity1.setText(Integer.toString(newQuantity));	
						}
					
					}
					
					if (!quantity1.getText().equals(""))
					{
						String alertQuantity = quantity1.getText();
						int compareQuantity= Integer.parseInt(alertQuantity);
						if (compareQuantity <= row1AlertLevel)
							{
								gbc.gridx=1;
								gbc.gridy=3;
								gbc.gridwidth = 5;
								gbc.fill= GridBagConstraints.HORIZONTAL;
								alert1State = "1";
								alert1.setText(ingredient1.getText()+" is running low");
								contentPane.add(alert1,gbc);
								contentPane.revalidate();
								contentPane.repaint();
								
							}
					}
					
					
				}
				catch (NumberFormatException e)
				{
					JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity"); 
				}
				
			
			}
		});
		contentPane.add(minusButton,gbc);
		
		
		gbc.gridx = 12;
		gbc.gridy = 100;
		gbc.insets = new Insets(15, 15, 15,15);
		alertButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		alertButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if (!ingredient1.getText().equals(""))
				{
					try
					{
						String alertLevel = JOptionPane.showInputDialog("Please input ingredient quantity when alert is to be shown");
						while (Integer.parseInt(alertLevel)<0)
						{
							alertLevel = JOptionPane.showInputDialog("Must be a positive value");
							
						}
						row1AlertLevel = Integer.parseInt(alertLevel);
					}
				
				catch(NumberFormatException e)
					{
						JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity");
						
					}
				}
				
				
				
				
			}
		});
		
		contentPane.add(alertButton,gbc);
		
	}
	
	public void row2 ()
	{
		ingredient2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gbc.gridx = 0;
		gbc.gridy = 110;
		gbc.insets = new Insets(15, 15, 15,15);
		gbc.weightx= 0.5;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		contentPane.add(ingredient2,gbc);
		
	
		quantity2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gbc.gridx = 1;
		gbc.gridy = 110;
		gbc.insets = new Insets(15, 100, 15,10);
		gbc.weightx= 0.5;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		contentPane.add(quantity2,gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 110;
		gbc.insets = new Insets(15, 15, 15,15);
		addButton2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		addButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
					if (!quantity2.getText().equals(""))
					{
						
						String quantity = quantity2.getText();
						int newQuantity= Integer.parseInt(quantity);
						newQuantity ++ ;
						quantity2.setText(Integer.toString(newQuantity));		
						
						String alertQuantity = quantity2.getText();
						int compareQuantity= Integer.parseInt(alertQuantity);
						if (compareQuantity > row2AlertLevel)
							{
								alert2State = "0";
								contentPane.remove(alert2);
								contentPane.revalidate();
								contentPane.repaint();
							}
					}
					
				}
				catch (NumberFormatException e)
				{
					JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity"); 
				}
				
			}
		});
		contentPane.add(addButton2,gbc);
		
		gbc.gridx = 8;
		gbc.gridy = 110;
		gbc.insets = new Insets(15, 15, 15,15);
		minusButton2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		minusButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
					if (!quantity2.getText().equals(""))
					{
					
						String quantity = quantity2.getText();
						int newQuantity= Integer.parseInt(quantity);
						newQuantity -- ;
						
						if(newQuantity == 0)
						{
								
								ingredient2.setText("");
								quantity2.setText("");
								alert2State = "0";
								contentPane.remove(alert2);
								contentPane.revalidate();
								contentPane.repaint();
						}
						else 
						{
								quantity2.setText(Integer.toString(newQuantity));	
						}
					
					}
					
					if (!quantity2.getText().equals(""))
					{
						String alertQuantity = quantity2.getText();
						int compareQuantity= Integer.parseInt(alertQuantity);
						if (compareQuantity <= row2AlertLevel)
							{
								
								
								gbc.gridx=1;
								gbc.gridy=5;
								gbc.gridwidth = 5;
								gbc.fill= GridBagConstraints.HORIZONTAL;
								alert2State = "1";
								alert2.setText(ingredient2.getText()+" is running low");
								contentPane.add(alert2,gbc);
								contentPane.revalidate();
								contentPane.repaint();
								
							}
					}
				}
				catch (NumberFormatException e)
				{
					JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity"); 
				}
			}
		});
		contentPane.add(minusButton2,gbc);
		
		
		gbc.gridx = 12;
		gbc.gridy = 110;
		gbc.insets = new Insets(15, 15, 15,15);
		alertButton2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		alertButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if (!ingredient2.getText().equals(""))
				{
					try
					{
						String alertLevel = JOptionPane.showInputDialog("Please input ingredient quantity when alert is to be shown");
						while (Integer.parseInt(alertLevel)<0)
						{
							alertLevel = JOptionPane.showInputDialog("Must be a positive value");
							
						}
						row2AlertLevel = Integer.parseInt(alertLevel);
					}
				
					catch(NumberFormatException e)
					{
						JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity");
					}
				}
				
			}
		});
		contentPane.add(alertButton2,gbc);
	}
	
	public void row3()
	{
		ingredient3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gbc.gridx = 0;
		gbc.gridy = 120;
		gbc.insets = new Insets(15, 15, 15,15);
		gbc.weightx= 0.5;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		contentPane.add(ingredient3,gbc);
		
	
		quantity3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gbc.gridx = 1;
		gbc.gridy = 120;
		gbc.insets = new Insets(15, 100, 15,10);
		gbc.weightx= 0.5;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		contentPane.add(quantity3,gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 120;
		gbc.insets = new Insets(15, 15, 15,15);
		addButton3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		addButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					if (!quantity3.getText().equals(""))
					{
						
						String quantity = quantity3.getText();
						int newQuantity= Integer.parseInt(quantity);
						newQuantity ++ ;
						quantity3.setText(Integer.toString(newQuantity));		
						
						String alertQuantity = quantity3.getText();
						int compareQuantity= Integer.parseInt(alertQuantity);
						if (compareQuantity > row3AlertLevel)
							{
								alert3State = "0";
								contentPane.remove(alert3);
								contentPane.revalidate();
								contentPane.repaint();
							}
					}
				}
				catch (NumberFormatException e)
				{
					JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity"); 
				}
			}
		});
		contentPane.add(addButton3,gbc);
		
		gbc.gridx = 8;
		gbc.gridy = 120;
		gbc.insets = new Insets(15, 15, 15,15);
		minusButton3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		minusButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
					if (!quantity3.getText().equals(""))
					{
					
						String quantity = quantity3.getText();
						int newQuantity= Integer.parseInt(quantity);
						newQuantity -- ;
						
						if(newQuantity == 0)
						{
								ingredient3.setText("");
								quantity3.setText("");
								alert3State = "0";
								contentPane.remove(alert3);
								contentPane.revalidate();
								contentPane.repaint();
						}
						else 
						{
								quantity3.setText(Integer.toString(newQuantity));	
						}
					
					}
					
					if (!quantity3.getText().equals(""))
					{
						String alertQuantity = quantity3.getText();
						int compareQuantity= Integer.parseInt(alertQuantity);
						if (compareQuantity <= row3AlertLevel)
							{
								
								gbc.gridx=1;
								gbc.gridy=7;
								gbc.gridwidth = 5;
								gbc.fill= GridBagConstraints.HORIZONTAL;
								alert3State = "1";
								alert3.setText(ingredient3.getText()+" is running low");
								contentPane.add(alert3,gbc);
								contentPane.revalidate();
								contentPane.repaint();
								
							}
					}		
				}
				catch (NumberFormatException e)
				{
					JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity"); 
				}
				
			}
		});
		contentPane.add(minusButton3,gbc);
		
		
		gbc.gridx = 12;
		gbc.gridy = 120;
		gbc.insets = new Insets(15, 15, 15,15);
		alertButton3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		alertButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{	
				if (!ingredient3.getText().equals(""))
			
				{
					try
					{
						String alertLevel = JOptionPane.showInputDialog("Please input ingredient quantity when alert is to be shown");
						while (Integer.parseInt(alertLevel)<0)
						{
							alertLevel = JOptionPane.showInputDialog("Must be a positive value");
							
						}
						row3AlertLevel = Integer.parseInt(alertLevel);
					}
				
					catch(NumberFormatException e)
					{
						JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity");
					}
				}
				
			}
		});
		contentPane.add(alertButton3,gbc);
	}
	
	public void row4()
	{
		
		ingredient4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gbc.gridx = 0;
		gbc.gridy = 130;
		gbc.insets = new Insets(15, 15, 15,15);
		gbc.weightx= 0.5;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		contentPane.add(ingredient4,gbc);
		
	
		quantity4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gbc.gridx = 1;
		gbc.gridy = 130;
		gbc.insets = new Insets(15, 100, 15,10);
		gbc.weightx= 0.5;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		contentPane.add(quantity4,gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 130;
		gbc.insets = new Insets(15, 15, 15,15);
		addButton4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		addButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
					if (!quantity4.getText().equals(""))
					{
						
						String quantity = quantity4.getText();
						int newQuantity= Integer.parseInt(quantity);
						newQuantity ++ ;
						quantity4.setText(Integer.toString(newQuantity));		
						
						String alertQuantity = quantity4.getText();
						int compareQuantity= Integer.parseInt(alertQuantity);
						if (compareQuantity > row4AlertLevel)
							{
								alert4State = "0";
								contentPane.remove(alert4);
								contentPane.revalidate();
								contentPane.repaint();
							}
					}		
				}
				catch (NumberFormatException e)
				{
					JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity"); 
				}
					
			}
		});
		contentPane.add(addButton4,gbc);
		
		gbc.gridx = 8;
		gbc.gridy = 130;
		gbc.insets = new Insets(15, 15, 15,15);
		minusButton4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		minusButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
					if (!quantity4.getText().equals(""))
					{
					
						String quantity = quantity4.getText();
						int newQuantity= Integer.parseInt(quantity);
						newQuantity -- ;
						
						if(newQuantity == 0)
						{
								ingredient4.setText("");
								quantity4.setText("");
								alert4State = "0";
								contentPane.remove(alert4);
								contentPane.revalidate();
								contentPane.repaint();
						}
						else 
						{
								quantity4.setText(Integer.toString(newQuantity));	
						}
					
					}
					
					if (!quantity4.getText().equals(""))
					{
						String alertQuantity = quantity4.getText();
						int compareQuantity= Integer.parseInt(alertQuantity);
						if (compareQuantity <= row4AlertLevel)
							{
								
								gbc.gridx=1;
								gbc.gridy=9;
								gbc.gridwidth = 5;
								gbc.fill= GridBagConstraints.HORIZONTAL;
								alert4State = "1";
								alert4.setText(ingredient4.getText()+" is running low");
								contentPane.add(alert4,gbc);
								contentPane.revalidate();
								contentPane.repaint();
								
							}
					}	
				}
				catch (NumberFormatException e)
				{
					JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity"); 
				}
			}
		});
		contentPane.add(minusButton4,gbc);
		
		
		gbc.gridx = 12;
		gbc.gridy = 130;
		gbc.insets = new Insets(15, 15, 15,15);
		alertButton4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		alertButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{	
				if (!ingredient4.getText().equals(""))
				{
					try
					{
						String alertLevel = JOptionPane.showInputDialog("Please input ingredient quantity when alert is to be shown");
						while (Integer.parseInt(alertLevel)<0)
						{
							alertLevel = JOptionPane.showInputDialog("Must be a positive value");
							
						}
						row4AlertLevel = Integer.parseInt(alertLevel);
					}
				
					catch(NumberFormatException e)
					{
						JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity");
					}
				}
				
			}
		});
		contentPane.add(alertButton4,gbc);
	
	}
	
	public void row5()
	{
		
		ingredient5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gbc.gridx = 0;
		gbc.gridy = 140;
		gbc.insets = new Insets(15, 15, 15,15);
		gbc.weightx= 0.5;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		contentPane.add(ingredient5,gbc);
		
	
		quantity5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gbc.gridx = 1;
		gbc.gridy = 140;
		gbc.insets = new Insets(15, 100, 15,10);
		gbc.weightx= 0.5;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		contentPane.add(quantity5,gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 140;
		gbc.insets = new Insets(15, 15, 15,15);
		addButton5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		addButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try 
				{
					if (!quantity5.getText().equals(""))
					{
						
						String quantity = quantity5.getText();
						int newQuantity= Integer.parseInt(quantity);
						newQuantity ++ ;
						quantity5.setText(Integer.toString(newQuantity));		
						
						String alertQuantity = quantity5.getText();
						int compareQuantity= Integer.parseInt(alertQuantity);
						if (compareQuantity > row5AlertLevel)
							{
								alert5State = "0";
								contentPane.remove(alert5);
								contentPane.revalidate();
								contentPane.repaint();
							}
					}	
				}
				catch (NumberFormatException e)
				{
					JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity"); 
				}
				
			}
		});
		contentPane.add(addButton5,gbc);
		
		gbc.gridx = 8;
		gbc.gridy = 140;
		gbc.insets = new Insets(15, 15, 15,15);
		minusButton5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		minusButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					if (!quantity5.getText().equals(""))
					{
					
						String quantity = quantity5.getText();
						int newQuantity= Integer.parseInt(quantity);
						newQuantity -- ;
						
						if(newQuantity == 0)
						{
								ingredient5.setText("");
								quantity5.setText("");
								alert5State = "0";
								contentPane.remove(alert5);
								contentPane.revalidate();
								contentPane.repaint();
						}
						else 
						{
								quantity5.setText(Integer.toString(newQuantity));	
						}
					
					}
					
					if (!quantity5.getText().equals(""))
					{
						String alertQuantity = quantity5.getText();
						int compareQuantity= Integer.parseInt(alertQuantity);
						if (compareQuantity <= row5AlertLevel)
							{
								
								gbc.gridx=1;
								gbc.gridy=11;
								gbc.gridwidth = 5;
								gbc.fill= GridBagConstraints.HORIZONTAL;
								alert5State = "1";
								alert5.setText(ingredient5.getText()+" is running low");
								contentPane.add(alert5,gbc);
								contentPane.revalidate();
								contentPane.repaint();
								
							}
					}	
				}
				catch (NumberFormatException e)
				{
					JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity"); 
				}
			}
		});
		contentPane.add(minusButton5,gbc);
		
		
		gbc.gridx = 12;
		gbc.gridy = 140;
		gbc.insets = new Insets(15, 15, 15,15);
		alertButton5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		alertButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if (!ingredient5.getText().equals(""))
				{
					try
					{
						String alertLevel = JOptionPane.showInputDialog("Please input ingredient quantity when alert is to be shown");
						while (Integer.parseInt(alertLevel)<0)
						{
							alertLevel = JOptionPane.showInputDialog("Must be a positive value");
							
						}
						row5AlertLevel = Integer.parseInt(alertLevel);
					}
				
					catch(NumberFormatException e)
					{
						JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity");
					}
				}
			
				
			}
		});
		contentPane.add(alertButton5,gbc);
	
	}
	
	public void row6()
	{
		
		ingredient6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gbc.gridx = 0;
		gbc.gridy = 150;
		gbc.insets = new Insets(15, 15, 15,15);
		gbc.weightx= 0.5;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		contentPane.add(ingredient6,gbc);
		
	
		quantity6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		gbc.gridx = 1;
		gbc.gridy = 150;
		gbc.insets = new Insets(15, 100, 15,10);
		gbc.weightx= 0.5;
		gbc.fill= GridBagConstraints.HORIZONTAL;
		contentPane.add(quantity6,gbc);
		
		gbc.gridx = 4;
		gbc.gridy = 150;
		gbc.insets = new Insets(15, 15, 15,15);
		addButton6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		addButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					if (!quantity6.getText().equals(""))
					{
						
						String quantity = quantity6.getText();
						int newQuantity= Integer.parseInt(quantity);
						newQuantity ++ ;
						quantity6.setText(Integer.toString(newQuantity));		
						
						String alertQuantity = quantity6.getText();
						int compareQuantity= Integer.parseInt(alertQuantity);
						if (compareQuantity > row6AlertLevel)
							{
								alert6State = "0";
								contentPane.remove(alert6);
								contentPane.revalidate();
								contentPane.repaint();
							}
					}
				}
				catch (NumberFormatException e)
				{
					JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity"); 
				}
				
			}
		});
		contentPane.add(addButton6,gbc);
		
		gbc.gridx = 8;
		gbc.gridy = 150;
		gbc.insets = new Insets(15, 15, 15,15);
		minusButton6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		minusButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				try
				{
					if (!quantity6.getText().equals(""))
					{
					
						String quantity = quantity6.getText();
						int newQuantity= Integer.parseInt(quantity);
						newQuantity -- ;
						
						if(newQuantity == 0)
						{
								ingredient6.setText("");
								quantity6.setText("");
								alert6State = "0";
								contentPane.remove(alert6);
								contentPane.revalidate();
								contentPane.repaint();
						}
						else 
						{
								quantity6.setText(Integer.toString(newQuantity));	
						}
					
					}
					
					if (!quantity6.getText().equals(""))
					{
						String alertQuantity = quantity6.getText();
						int compareQuantity= Integer.parseInt(alertQuantity);
						if (compareQuantity <= row6AlertLevel)
							{
								
								gbc.gridx=1;
								gbc.gridy=13;
								gbc.gridwidth = 5;
								gbc.fill= GridBagConstraints.HORIZONTAL;
								alert6State = "1";
								alert6.setText(ingredient6.getText()+" is running low");
								contentPane.add(alert6,gbc);
								contentPane.revalidate();
								contentPane.repaint();
								
							}
					}	
				}
				catch (NumberFormatException e)
				{
					JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity"); 
				}
			}
		});
		contentPane.add(minusButton6,gbc);
		
		
		gbc.gridx = 12;
		gbc.gridy = 150;
		gbc.insets = new Insets(15, 15, 15,15);
		alertButton6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		alertButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if (!ingredient6.getText().equals(""))
				{
					try
					{
						String alertLevel = JOptionPane.showInputDialog("Please input ingredient quantity when alert is to be shown");
						while (Integer.parseInt(alertLevel)<0)
						{
							alertLevel = JOptionPane.showInputDialog("Must be a positive value");
							
						}
						row6AlertLevel = Integer.parseInt(alertLevel);
					}
				
					catch(NumberFormatException e)
					{
						JOptionPane.showMessageDialog(contentPane,"Please enter a valid quantity");
					}
				}
			
				
			}
		});
		contentPane.add(alertButton6,gbc);
	
	}

}

