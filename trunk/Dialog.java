

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.sun.org.apache.xerces.internal.xinclude.XIncludeTextReader;

public class Dialog extends JFrame implements ActionListener {
JLabel lblReport=new JLabel(); 
JButton btnContinues=new JButton("Tiếp tục");
JButton btnCancel=new JButton("Thoát");


public Dialog(String title){
	super(title);
	setLayout(null);
	add(lblReport);
	lblReport.setBounds(20,10,450,27);
		
	add(btnCancel);
	btnCancel.setBounds(230,77,95,27);
	btnCancel.addActionListener(this);
	
	add(btnContinues);
	btnContinues.setBounds(100,77,95,27);
	btnContinues.addActionListener(this);
	
	this.setBounds(300,200,410,160);
}
	/**
	 * @param args
	 * @throws IOException 
	 * @throws Exception 
	 */


public void actionPerformed(ActionEvent Click) {
	// TODO Auto-generated method stub
	if(Click.getSource()==btnCancel){
		this.dispose();
		Add a=new Add("");
		a.dispose();
	}
	else if(Click.getSource()==btnContinues){
		this.dispose();
	}
}
}