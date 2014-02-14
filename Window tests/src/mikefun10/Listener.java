package mikefun10;


import java.awt.event.*;

import javax.swing.*;

public class Listener implements ActionListener {

	JTextField textfield;
	
	Listener(JTextField textfield) 
	{
	    this.textfield = textfield;
	}

	
	public void actionPerformed(ActionEvent e)
	{
     textfield.setText("WHY DID YOU PRESS THE BUTTON!!!!!");
	}

}
/*
@Override
  public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub

}*/