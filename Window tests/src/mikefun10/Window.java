package mikefun10;
 
import java.awt.*;
//import java.awt.event.*;
//import java.util.*;
import javax.swing.*;

	
public class Window {

	public static void main(String[] args) {
		JFrame frame;
		Container contentPane;
		JTextField textfield;
		JButton button;
		FlowLayout layout;
		
		frame = new JFrame();
		frame.setTitle("Basic window v0.1");
		contentPane = frame.getContentPane();
		
		 textfield = new JTextField("HI I'm a text field :3", 30);
		 
		 button = new JButton("The big friendly button");
		 button.addActionListener(new Listener(textfield));
		 
		 contentPane.add(textfield);
		 contentPane.add(button);
		 layout = new FlowLayout();
		 contentPane.setLayout(layout);
		 
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.pack();
		 frame.setVisible(true);
		 

	}

}
