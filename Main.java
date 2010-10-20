

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.print.attribute.AttributeSet;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import javax.swing.text.PlainDocument;


import java.awt.Color;
public class Main extends JFrame implements ActionListener {
Date date=new Date();	
JLabel lblCaption=new JLabel("");


JLabel lblDacbiet=new JLabel("Đặc Biệt:");
JLabel lblNhat=new JLabel("Giải Nhất");
JLabel lblNhi=new JLabel("Giả Nhì");
JLabel lblBa=new JLabel("Giải Ba");
JLabel lblBon=new JLabel("Giải Bốn");
JLabel lblNam=new JLabel("Giải Năm");
JLabel lblSau=new JLabel("Giải Sáu");
JLabel lblBay=new JLabel("Giải Bảy");
JScrollPane frame=new JScrollPane();
JTextField txtDacbiet=new JTextField(""); 


JTextField txtNhat=new JTextField(""); 

JTextField txtNhi1=new JTextField(""); 
JTextField txtNhi2=new JTextField(""); 

JTextField txtBa1=new JTextField(""); 
JTextField txtBa2=new JTextField(""); 
JTextField txtBa3=new JTextField(""); 
JTextField txtBa4=new JTextField(""); 
JTextField txtBa5=new JTextField(""); 
JTextField txtBa6=new JTextField(""); 

JTextField txtBon1=new JTextField(""); 
JTextField txtBon2=new JTextField(""); 
JTextField txtBon3=new JTextField(""); 
JTextField txtBon4=new JTextField(""); 


JTextField txtNam1=new JTextField(""); 
JTextField txtNam2=new JTextField(""); 
JTextField txtNam3=new JTextField(""); 
JTextField txtNam4=new JTextField(""); 
JTextField txtNam5=new JTextField(""); 
JTextField txtNam6=new JTextField(""); 

JTextField txtSau1=new JTextField(""); 
JTextField txtSau2=new JTextField("");
JTextField txtSau3=new JTextField("");

JTextField txtBay1=new JTextField(""); 
JTextField txtBay2=new JTextField(""); 
JTextField txtBay3=new JTextField(""); 
JTextField txtBay4=new JTextField(""); 

JButton btnSearch=new JButton("Tìm");
JButton btnAdd=new JButton("Luu lai");
JButton btnCancel=new JButton("Thoat");
JButton btnTinhKQ=new JButton("Tinh ket qua");
JButton btnBack=new JButton("Quay lai");
JTextField txtDate=new JTextField(""); 
Color Cl=new Color(15);



public Main(String title){
	super(title);
	setLayout(null);
	
	
	SimpleDateFormat sdf;
	sdf = new SimpleDateFormat("dd/MM /yyyy ");
	add(lblCaption);
	lblCaption.setText("Ngay cap nhap :"+sdf.format(date));
			
	lblCaption.setBounds(30,10,300,27);

			
	lblCaption.setBounds(30,10,300,27);	
	
	lblCaption.setBounds(30,10,300,27);
	
	lblCaption.setBounds(30,10,300,27);
	
	lblCaption.setBounds(30,10,300,27);
	
	add(lblDacbiet);
	lblDacbiet.setBounds(30,67,80,27);
	add(lblNhat);
	lblNhat.setBounds(30,104,80,27);
	add(lblNhi);
	lblNhi.setBounds(30,141,80,27);
	add(lblBa);
	lblBa.setBounds(30,178,80,27);
	add(lblBon);
	lblBon.setBounds(30,215,80,27);
	add(lblNam);
	lblNam.setBounds(30,252,80,27);
	add(lblSau);
	lblSau.setBounds(30,289,80,27);
	add(lblBay);
	lblBay.setBounds(30,326,80,27);
	
	add(txtDacbiet);
	txtDacbiet.setBounds(110,67,60,27);

	
	add(txtNhat);
	txtNhat.setBounds(110,104,60,27);
	
	add(txtNhi1);
	txtNhi1.setBounds(110,141,60,27);
	add(txtNhi2);
	txtNhi2.setBounds(170,141,60,27);
	
	add(txtBa1);
	txtBa1.setBounds(110,178,60,27);
	add(txtBa2);
	txtBa2.setBounds(170,178,60,27);
	add(txtBa3);
	txtBa3.setBounds(230,178,60,27);
	add(txtBa4);
	txtBa4.setBounds(290,178,60,27);
	add(txtBa5);
	txtBa5.setBounds(350,178,60,27);
	add(txtBa6);
	txtBa6.setBounds(410,178,60,27);
	
	add(txtBon1);
	txtBon1.setBounds(110,215,60,27);
	add(txtBon2);
	txtBon2.setBounds(170,215,60,27);
	add(txtBon3);
	txtBon3.setBounds(230,215,60,27);
	add(txtBon4);
	txtBon4.setBounds(290,215,60,27);
	
	add(txtNam1);
	txtNam1.setBounds(110,252,60,27);
	add(txtNam2);
	txtNam2.setBounds(170,252,60,27);
	add(txtNam3);
	txtNam3.setBounds(230,252,60,27);
	add(txtNam4);
	txtNam4.setBounds(290,252,60,27);
	add(txtNam5);
	txtNam5.setBounds(350,252,60,27);
	add(txtNam6);
	txtNam6.setBounds(410,252,60,27);
	
	add(txtSau1);
	txtSau1.setBounds(110,289,60,27);
	add(txtSau2);
	txtSau2.setBounds(170,289,60,27);
	add(txtSau3);
	txtSau3.setBounds(230,289,60,27);
	
	add(txtBay1);
	txtBay1.setBounds(110,326,60,27);
	add(txtBay2);
	txtBay2.setBounds(170,326,60,27);
	add(txtBay3);
	txtBay3.setBounds(230,326,60,27);
	add(txtBay4);
	txtBay4.setBounds(290,326,60,27);
	
	
	add(txtDate);
	txtDate.setBounds(360,10,170,27);	
	
	add(btnSearch);
	btnSearch.setBounds(80,380,75,27);
	btnSearch.addActionListener(this);
	
	add(btnCancel);
	btnCancel.setBounds(280,380,75,27);
	btnCancel.addActionListener(this);
	
	add(btnAdd);
	btnAdd.setBounds(175,380,85,27);
	btnAdd.addActionListener(this);
	
	add(btnTinhKQ);
	btnTinhKQ.setBounds(375,380,105,27);
	btnTinhKQ.addActionListener(this);
	
	add(frame);
	frame.setBounds(10,10,520,360);
	
	
}
	/**
	 * @param args
	 * @throws IOException 
	 * @throws Exception 
	 */



	public static void main(String[] args)  {
		
		// TODO Auto-generated method stub
		
        Main M=new Main("KQSX version 1.0.0");
        M.setVisible(true);
        M.setBounds(210,85,550,470);
        M.Load();   

	    
	}
	

	public static PlainDocument getPlainDocument(final int maxLength) {
	PlainDocument p = new PlainDocument() {
	
	public void insertString(int arg0, String arg1, AttributeSet arg2)
	throws BadLocationException {
//	 TODO Auto-generated method stub
	if (getLength() + arg1.length() <= maxLength)
	super.insertString(arg0, arg1, (javax.swing.text.AttributeSet) arg2);
	}

	};
	return p;
	}

	
	
	public void Tachso(){
		StringBuffer s =new StringBuffer();
        s.append(txtDacbiet.getText());
        txtDacbiet.setText(s.substring(0,3)+" | "+s.substring(s.length()-2));
        s.append(txtNhat.getText());
        txtNhat.setText(s.substring(0,3)+" | "+s.substring(s.length()-2)); 
        s.append(txtNhi1.getText());
        txtNhi1.setText(s.substring(0,3)+" | "+s.substring(s.length()-2)); 
        s.append(txtNhi2.getText());
        txtNhi2.setText(s.substring(0,3)+" | "+s.substring(s.length()-2)); 
        
        s.append(txtBa1.getText());
        txtBa1.setText(s.substring(0,3)+" | "+s.substring(s.length()-2)); 
        s.append(txtBa2.getText());
        txtBa2.setText(s.substring(0,3)+" | "+s.substring(s.length()-2)); 
        s.append(txtBa3.getText());
        txtBa3.setText(s.substring(0,3)+" | "+s.substring(s.length()-2)); 
        s.append(txtBa4.getText());
        txtBa4.setText(s.substring(0,3)+" | "+s.substring(s.length()-2)); 
        s.append(txtBa5.getText());
        txtBa5.setText(s.substring(0,3)+" | "+s.substring(s.length()-2)); 
        s.append(txtBa6.getText());
        txtBa6.setText(s.substring(0,3)+" | "+s.substring(s.length()-2)); 
        
        s.append(txtBon1.getText());
        txtBon1.setText(s.substring(0,2)+" | "+s.substring(s.length()-2)); 
        s.append(txtBon2.getText());
        txtBon2.setText(s.substring(0,2)+" | "+s.substring(s.length()-2));
        s.append(txtBon3.getText());
        txtBon3.setText(s.substring(0,2)+" | "+s.substring(s.length()-2)); 
        s.append(txtBon4.getText());
        txtBon4.setText(s.substring(0,2)+" | "+s.substring(s.length()-2)); 
        
        s.append(txtNam1.getText());
        txtNam1.setText(s.substring(0,2)+" | "+s.substring(s.length()-2)); 
        s.append(txtNam2.getText());
        txtNam2.setText(s.substring(0,2)+" | "+s.substring(s.length()-2)); 
        s.append(txtNam3.getText());
        txtNam3.setText(s.substring(0,2)+" | "+s.substring(s.length()-2)); 
        s.append(txtNam4.getText());
        txtNam4.setText(s.substring(0,2)+" | "+s.substring(s.length()-2)); 
        s.append(txtNam5.getText());
        txtNam5.setText(s.substring(0,2)+" | "+s.substring(s.length()-2)); 
        s.append(txtNam6.getText());
        txtNam6.setText(s.substring(0,2)+" | "+s.substring(s.length()-2)); 
        
        s.append(txtSau1.getText());
        txtSau1.setText(s.substring(0,1)+" | "+s.substring(s.length()-2)); 
        s.append(txtSau2.getText());
        txtSau2.setText(s.substring(0,1)+" | "+s.substring(s.length()-2)); 
        s.append(txtSau3.getText());
        txtSau3.setText(s.substring(0,1)+" | "+s.substring(s.length()-2)); 
        
        
	}
	
	public void NgungTachso(){
		Load();
        
	}
	public void runAdd() {

		 	
		    // set this to a MS Access DB you have on your machine
		    String Data="SELECT * FROM KQSXTable";
		    String conStr = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=D:\\DataKQ.mdb";
		try {   
		    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		    java.sql.Connection con=  DriverManager.getConnection(conStr,"","");
		 // ket noi CSDL tu DriverManager
		    java.sql.Statement stmt = con.createStatement();
        //		  thao tac truy nhap record
		    ResultSet rs =stmt.executeQuery(Data);
		    System.out.println("da ket noi");
		    PreparedStatement pS=con.prepareStatement("insert into KQSXTable" +
		    		"(Dacbiet,Nhat,Nhi1,Nhi2," +
		    		"Ba1,Ba2,Ba3,Ba4,Ba5,Ba6," +
		    		"Bon1,Bon2,Bon3,Bon4," +
		    		"Nam1,Nam2,Nam3,Nam4,Nam5,Nam6," +
		    		"Sau1,Sau2,Sau3," +
		    		"Bay1,Bay2,Bay3,Bay4,DateKQ)" +
		    		"values (?,?,?,?,?,?,?,?,?,?," +
		    		        "?,?,?,?,?,?,?,?,?,?," +
		    		        "?,?,?,?,?,?,?,?)");
		      
		    pS.setString(1, txtDacbiet.getText());
		    pS.setString(2, txtNhat.getText());
		    pS.setString(3, txtNhi1.getText());
		    pS.setString(4, txtNhi2.getText());
		    
		    pS.setString(5, txtBa1.getText());
		    pS.setString(6, txtBa2.getText());
		    pS.setString(7, txtBa3.getText());
		    pS.setString(8, txtBa4.getText());
		    pS.setString(9, txtBa5.getText());
		    pS.setString(10, txtBa6.getText());
		    
		    pS.setString(11, txtBon1.getText());
		    pS.setString(12, txtBon2.getText());
		    pS.setString(13, txtBon3.getText());
		    pS.setString(14, txtBon4.getText());
		    		    
		    pS.setString(15, txtNam1.getText());
		    pS.setString(16, txtNam2.getText());
		    pS.setString(17, txtNam3.getText());
		    pS.setString(18, txtNam4.getText());
		    pS.setString(19, txtNam5.getText());
		    pS.setString(20, txtNam6.getText());
		    
		    pS.setString(21, txtSau1.getText());
		    pS.setString(22, txtSau2.getText());
		    pS.setString(23, txtSau3.getText());
		    
		    pS.setString(24, txtBay1.getText());
		    pS.setString(25, txtBay2.getText());
		    pS.setString(26, txtBay3.getText());
		    pS.setString(27, txtBay4.getText());
		    
		    pS.setString(28, lblCaption.getText());
		    pS.executeUpdate();
		  
		    
		} catch (Exception e)  {
		      System.out.println("Error: " + e);
		}
	}
	
	public void Load() {

		   
	    // set this to a MS Access DB you have on your machine
	    String Data="SELECT * FROM KQSXTable";
	    String conStr = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=D:\\DataKQ.mdb";
	try {   
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	    java.sql.Connection con=  DriverManager.getConnection(conStr,"","");
	 // ket noi CSDL tu DriverManager
	    java.sql.Statement stmt = con.createStatement();
    //		  thao tac truy nhap record
	    ResultSet rs =stmt.executeQuery(Data);
	   
	    while(rs.next()){
	    txtDacbiet.setText(rs.getString("Dacbiet"));
	    txtNhat.setText(rs.getString("Nhat"));
	    txtNhi1.setText(rs.getString("Nhi1"));
	    txtNhi2.setText(rs.getString("Nhi2"));
	    
	    txtBa1.setText(rs.getString("Ba1"));
	    txtBa2.setText(rs.getString("Ba2"));
	    txtBa3.setText(rs.getString("Ba3"));
	    txtBa4.setText(rs.getString("Ba4"));
	    txtBa5.setText(rs.getString("Ba5"));
	    txtBa6.setText(rs.getString("Ba6"));
	    
	    txtBon1.setText(rs.getString("Bon1"));
	    txtBon2.setText(rs.getString("Bon2"));
	    txtBon3.setText(rs.getString("Bon3"));
	    txtBon4.setText(rs.getString("Bon4"));
	    
	    txtNam1.setText(rs.getString("Nam1"));
	    txtNam2.setText(rs.getString("Nam2"));
	    txtNam3.setText(rs.getString("Nam3"));
	    txtNam4.setText(rs.getString("Nam4"));
	    txtNam5.setText(rs.getString("Nam5"));
	    txtNam6.setText(rs.getString("Nam6"));
	    
	    txtSau1.setText(rs.getString("Sau1"));
	    txtSau2.setText(rs.getString("Sau2"));
	    txtSau3.setText(rs.getString("Sau3"));
	    
	    txtBay1.setText(rs.getString("Bay1"));
	    txtBay2.setText(rs.getString("Bay2"));
	    txtBay3.setText(rs.getString("Bay3"));
	    txtBay4.setText(rs.getString("Bay4"));
	    
	    txtDate.setText(rs.getString("DateKQ"));
	    }

	    
	} catch (Exception e)  {
	      System.out.println("Error: " + e);
	}
}
	
	public void Next(){
		    String Data="SELECT * FROM KQSXTable";
		    String conStr = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=D:\\DataKQ.mdb";
		try {   
		    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		    java.sql.Connection con=  DriverManager.getConnection(conStr,"","");
		 // ket noi CSDL tu DriverManager
		    java.sql.Statement stmt = con.createStatement();
	    //		  thao tac truy nhap record
		    ResultSet rs =stmt.executeQuery(Data);
		    rs.last();
		} catch (Exception e)  {
		      System.out.println("Error: " + e);
		}
	}
	public void Back(){
	    String Data="SELECT * FROM KQSXTable";
	    String conStr = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=D:\\DataKQ.mdb";
	try {   
	    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	    java.sql.Connection con=  DriverManager.getConnection(conStr,"","");
	 // ket noi CSDL tu DriverManager
	    java.sql.Statement stmt = con.createStatement();
    //		  thao tac truy nhap record
	    ResultSet rs =stmt.executeQuery(Data);
	    rs.last();
	} catch (Exception e)  {
	      System.out.println("Error: " + e);
	}
}
	
	public void TinhKQ(){
	
		StringBuffer s=new StringBuffer();
        s.append(txtDacbiet.getText());
        
        StringBuffer s1=new StringBuffer();
        s1.append(txtNhat.getText());
        
        StringBuffer s21=new StringBuffer();
        s21.append(txtNhi1.getText());
        StringBuffer s22=new StringBuffer();
        s22.append(txtNhi2.getText());
        
        StringBuffer s31=new StringBuffer();
        s31.append(txtBa1.getText());
        StringBuffer s32=new StringBuffer();
        s32.append(txtBa2.getText());
        StringBuffer s33=new StringBuffer();
        s33.append(txtBa3.getText());
        StringBuffer s34=new StringBuffer();
        s34.append(txtBa4.getText());
        StringBuffer s35=new StringBuffer();
        s35.append(txtBa5.getText());
        StringBuffer s36=new StringBuffer();
        s36.append(txtBa6.getText());
        
        StringBuffer s41=new StringBuffer();
        s41.append(txtBon1.getText());
        StringBuffer s42=new StringBuffer();
        s42.append(txtBon2.getText());
        StringBuffer s43=new StringBuffer();
        s43.append(txtBon3.getText());
        StringBuffer s44=new StringBuffer();
        s44.append(txtBon4.getText());
        
        StringBuffer s51=new StringBuffer();
        s51.append(txtNam1.getText());
        StringBuffer s52=new StringBuffer();
        s52.append(txtNam2.getText());
        StringBuffer s53=new StringBuffer();
        s53.append(txtNam3.getText());
        StringBuffer s54=new StringBuffer();
        s54.append(txtNam4.getText());
        StringBuffer s55=new StringBuffer();
        s55.append(txtNam5.getText());
        StringBuffer s56=new StringBuffer();
        s56.append(txtNam6.getText());
        
        StringBuffer s61=new StringBuffer();
        s61.append(txtSau1.getText());
        StringBuffer s62=new StringBuffer();
        s62.append(txtSau2.getText());
        StringBuffer s63=new StringBuffer();
        s63.append(txtSau3.getText());
        
        StringBuffer s71=new StringBuffer();
        s71.append(txtBay1.getText());
        StringBuffer s72=new StringBuffer();
        s72.append(txtBay2.getText());
        StringBuffer s73=new StringBuffer();
        s73.append(txtBay3.getText());
        StringBuffer s74=new StringBuffer();
        s74.append(txtBay4.getText());
        
        int[] dem = new int[100];
       
        String[] S={"00","01","02","03","04","05","06","07","08","09",
        		    "10","11","12","13","14","15","16","17","18","19",
        		    "20","21","22","23","24","25","26","27","28","29",
        		    "30","31","32","33","34","35","36","37","38","39",
        		    "40","41","42","43","44","45","46","47","48","49",
        		    "50","51","52","53","54","55","56","57","58","59",
        		    "60","61","62","63","64","65","66","67","68","69",
        		    "70","71","72","73","74","75","76","77","78","79",
        		    "80","81","82","83","84","85","86","87","88","89",
        		    "90","91","92","93","94","95","96","97","98","99"};
        Add tinhKQ=new Add("Tinh Ket Qua");
		tinhKQ.setVisible(true);
	
		String[]  Chuoi={(s.substring(s.length()-2)),(s1.substring(s1.length()-2)),
		                (s21.substring(s21.length()-2)),(s22.substring(s22.length()-2)),
		                (s31.substring(s31.length()-2)),(s32.substring(s32.length()-2)),
		                (s33.substring(s33.length()-2)),(s34.substring(s34.length()-2)),
		                (s35.substring(s35.length()-2)),(s36.substring(s36.length()-2)),
		                (s41.substring(s41.length()-2)),(s42.substring(s42.length()-2)),
		                (s43.substring(s43.length()-2)),(s44.substring(s44.length()-2)),
		                (s51.substring(s51.length()-2)),(s52.substring(s52.length()-2)),
		                (s53.substring(s53.length()-2)),(s54.substring(s54.length()-2)),
		                (s55.substring(s55.length()-2)),(s56.substring(s56.length()-2)),
		                (s61.substring(s61.length()-2)),(s62.substring(s62.length()-2)),
		                (s63.substring(s63.length()-2)),
		                (s71.substring(s71.length()-2)),(s72.substring(s72.length()-2)),
		                (s73.substring(s73.length()-2)),(s74.substring(s74.length()-2)),};
		
		
   for(int m=0;m<S.length;m++){  
     for(int k=0;k<Chuoi.length;k++){
    	 if(S[m].equals(Chuoi[k])){
    		 dem[m]++;
    	 }
    	
     }
   }
     for(int kq=0;kq<S.length;kq++){
    	 if(dem[kq]!=0){
    		 tinhKQ.txtMean.append(S[kq].toString()+"____________"+dem[kq]+" lan"+"\n"); 
    	 }else{
    		 if((kq>=0)&&(kq<=21)) tinhKQ.txtMean1.append(" "+S[kq].toString()+"\n"); 
    		 if((kq>=22)&&(kq<=42)) tinhKQ.txtMean2.append(" "+S[kq].toString()+"\n"); 
    		 if((kq>=43)&&(kq<=84)) tinhKQ.txtMean3.append(" "+S[kq].toString()+"\n"); 
    		 if((kq>=85)&&(kq<100)) tinhKQ.txtMean4.append(" "+S[kq].toString()+"\n"); 
    	 }
    }
    tinhKQ.lblCaption.setText(txtDate.getText());
     
	}//Ket thuc tinhKQ
	
	
	
	public void actionPerformed(ActionEvent Click)  {
		// TODO Auto-generated method stub
		
		if(Click.getSource()==btnSearch){
			Load();
			
		}
		else if(Click.getSource()==btnCancel){
			this.dispose();
			
		}
		else if(Click.getSource()==btnTinhKQ){
			
			TinhKQ();
	       
		}
		else if(Click.getSource()==btnAdd){
			runAdd();
			Dialog Dlg=new Dialog("Thong bao");
			Dlg.setVisible(true);
			Dlg.lblReport.setText("Đã cập nhập dữ liệu :"+lblCaption.getText());
		}
	}


}//ket thuc lop Main


