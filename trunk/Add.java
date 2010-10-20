

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.accessibility.Accessible;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.xml.transform.dom.DOMSource;

import com.sun.corba.se.pept.transport.Connection;
import com.sun.org.apache.xerces.internal.xinclude.XIncludeTextReader;

public class Add extends JFrame implements ActionListener {
JTextArea txtMean=new JTextArea();		
JTextArea txtMean1=new JTextArea();	
JTextArea txtMean2=new JTextArea();	
JTextArea txtMean3=new JTextArea();	
JTextArea txtMean4=new JTextArea();	
JLabel lblCaption=new JLabel("");
JLabel lblCaption1=new JLabel("Cặp số đã có");
JLabel lblCaption2=new JLabel("Xuất hiên");
JLabel lblCaption3=new JLabel("Cặp số Chưa có");
JScrollPane scrollPane = new JScrollPane(txtMean1);	




JButton btnCancel=new JButton("Thoat");
JScrollPane frame=new JScrollPane();

public Add(String title){
	super(title);
	setLayout(null);
	add(lblCaption);
	lblCaption.setBounds(10,400,200,27);
	add(lblCaption1);
	lblCaption1.setBounds(10,10,100,27);
	add(lblCaption2);
	lblCaption2.setBounds(110,10,100,27);
	add(lblCaption3);
	lblCaption3.setBounds(230,10,100,27);
     
	
	
	add(txtMean);
	txtMean.setBounds(20,50,180,335);
	add(txtMean1);
	txtMean1.setBounds(210,50,50,335);
	add(txtMean2);
	txtMean2.setBounds(263,50,50,335);
	add(txtMean3);
	txtMean3.setBounds(316,50,50,335);
	add(txtMean4);
	txtMean4.setBounds(369,50,50,335);
	
	add(scrollPane);
	scrollPane.setBounds(200,45,230,350);
	

	add(frame);
	frame.setBounds(15,45,410,350);
			
	add(btnCancel);
	btnCancel.setBounds(350,400,75,27);
	btnCancel.addActionListener(this)	;
	
	this.setBounds(100,100,450,470);
}

public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
	
	if(ae.getSource()==btnCancel){	
		
	this.dispose();
	
	}
}

}