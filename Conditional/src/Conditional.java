import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
      
public class Conditional extends JFrame
       {
       private static final long serialVersionUID = 1L;
       static String name; 
       static int className;
       static JFrame frame = new JFrame();
	   public static void main(String[] args)
	   {
	   name = JOptionPane.showInputDialog("What is your name?");  
	   JOptionPane.showMessageDialog(frame, "Hi, " + name);
	   
	   Object[] options = {"Less Than 18", "18 and older" , "100++"};
		className = JOptionPane.showOptionDialog(frame, "How Old Are You?",
				"Your Age",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null, options, options[1]);
		
		switch(className)
		 {
		case 0:
			{
			JOptionPane.showMessageDialog(frame, "Wow!! You are so young!");
			break;
			}
		case 1:
			{
			JOptionPane.showMessageDialog(frame, "Why are you in high school still!!??");
			break;
			}
		case 2:
			{
			JOptionPane.showMessageDialog(frame, "How are you still alive!?");
			break;		
			}
		 }
	   final String[] colors = {"Red", "Blue", "Green"};
	   
		{
		final JFrame frame = new JFrame();
			 
		String colorChoices = (String) JOptionPane.showInputDialog(
			    frame, 
		        "What is your favorite color out of these?",
		        "Favorite Color",
		        JOptionPane.QUESTION_MESSAGE, 
		        null, 
		        colors, 
		        colors[1]);
		  
		switch(colorChoices)
			  {
			  case "Red":
				{
				JOptionPane.showMessageDialog(frame, "Eww Red!");
				break;
				}
			  case "Blue":
			    {
			    JOptionPane.showMessageDialog(frame, "That A Great Color!!");
				break;  
			    }
			  case "Green":
				{
				JOptionPane.showMessageDialog(frame, "Thats Mine too");
				}
			 
			 }
       	   }
	   }
   }
     