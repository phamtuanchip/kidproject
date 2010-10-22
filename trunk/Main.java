import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

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
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import javax.print.attribute.AttributeSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
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

public class Main extends JFrame implements ActionListener {
	Date date=new Date();	
	JLabel lblCaption=new JLabel("");
	JLabel lblTimkiem=new JLabel("Tìm theo ngày :");
	JLabel lblBaongoai=new JLabel("");

	JLabel lblDacbiet=new JLabel("Đặc Biệt:");
	JLabel lblNhat=new JLabel("Giải Nhất");
	JLabel lblNhi=new JLabel("Giả Nhì");
	JLabel lblBa=new JLabel("Giải Ba");
	JLabel lblBon=new JLabel("Giải Bốn");
	JLabel lblNam=new JLabel("Giải Năm");
	JLabel lblSau=new JLabel("Giải Sáu");
	JLabel lblBay=new JLabel("Giải Bảy");
	JScrollPane frame=new JScrollPane();

	JComboBox jcbDate=new JComboBox();

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

	JButton btnThem=new JButton("Them du lieu");
	JButton btnAdd=new JButton("Luu lai");
	JButton btnCancel=new JButton("Thoat");
	JButton btnTinhKQ=new JButton("Tinh ket qua");
	JButton btnBack=new JButton("Quay lai");
	JScrollPane frame1=new JScrollPane();
//From form ADD old
	JTextArea txtMean=new JTextArea();		
	JTextArea txtMean1=new JTextArea();	
	JTextArea txtMean2=new JTextArea();	
	JTextArea txtMean3=new JTextArea();	
	JTextArea txtMean4=new JTextArea();	
	
	JLabel lblCaption1=new JLabel("Cặp số đã có");
	JLabel lblCaption2=new JLabel("Xuất hiên");
	JLabel lblCaption3=new JLabel("Cặp số Chưa có");
	JScrollPane scrollPane = new JScrollPane(txtMean1);	


	String Time;
    int Status=0;

	public Main(String title){
		super(title);
		setLayout(null);
		
		
		SimpleDateFormat sdf;
		sdf = new SimpleDateFormat("dd/MM /yyyy ");
		add(lblCaption);
		lblCaption.setText("Ngay cap nhap :"+sdf.format(date));
		lblCaption.setBounds(30,10,300,27);
		Time=sdf.format(date);
		
		add(lblTimkiem);
		lblTimkiem.setBounds(210,10,100,27);
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
		
		add(lblCaption1);
		lblCaption1.setBounds(510,10,100,27);
		add(lblCaption2);
		lblCaption2.setBounds(610,10,100,27);
		add(lblCaption3);
		lblCaption3.setBounds(730,10,100,27);
	     		
		
		add(jcbDate);
		jcbDate.setBounds(310,10,170,25);	
		jcbDate.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				System.out.println(jcbDate.getSelectedItem()); // TODO Auto-generated Event stub mouseClicked()
			}
		});
		
		add(btnThem);
		btnThem.setBounds(30,380,130,27);
		btnThem.addActionListener(this);
		
		add(btnCancel);
		btnCancel.setBounds(280,380,75,27);
		btnCancel.addActionListener(this);
		
		add(btnAdd);
		btnAdd.setBounds(175,380,85,27);
		btnAdd.addActionListener(this);
		
		add(btnTinhKQ);
		btnTinhKQ.setBounds(375,380,105,27);
		btnTinhKQ.addActionListener(this);
		
		add(lblBaongoai);
		lblBaongoai.setBounds(50,67,450,407);
		lblBaongoai.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseMoved(java.awt.event.MouseEvent e) {
				if(!txtDacbiet.getText().equals("")&& Status==0) NgungTachso(); // TODO Auto-generated Event stub mouseMoved()
			}
		});
		
		add(frame);
		frame.setBounds(10,10,470,360);
		
		frame.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseMoved(java.awt.event.MouseEvent e) {
				if(!txtDacbiet.getText().equals("")&& Status==0)Tachso(); // TODO Auto-generated Event stub mouseMoved()
			}
		});
		
		//From ADD Old

		add(txtMean);
		txtMean.setBounds(490,50,180,350);
		add(txtMean1);
		txtMean1.setBounds(680,50,50,350);
		add(txtMean2);
		txtMean2.setBounds(733,50,50,350);
		add(txtMean3);
		txtMean3.setBounds(786,50,50,350);
		add(txtMean4);
		txtMean4.setBounds(839,50,50,350);
		
		add(scrollPane);
		scrollPane.setBounds(675,45,200,365);
		
		add(frame1);
		frame1.setBounds(485,45,410,365);
		

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
	        M.setBounds(50,85,910,470);
	        try {
				M.Load();
			} catch (InvalidPropertiesFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		    
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
			StringBuffer s =new StringBuffer();
	        s.append(txtDacbiet.getText());
	        txtDacbiet.setText(s.substring(0,3)+s.substring(s.length()-2));
	        s.append(txtNhat.getText());
	        txtNhat.setText(s.substring(0,3)+s.substring(s.length()-2)); 
	        s.append(txtNhi1.getText());
	        txtNhi1.setText(s.substring(0,3)+s.substring(s.length()-2)); 
	        s.append(txtNhi2.getText());
	        txtNhi2.setText(s.substring(0,3)+s.substring(s.length()-2)); 
	        
	        s.append(txtBa1.getText());
	        txtBa1.setText(s.substring(0,3)+s.substring(s.length()-2)); 
	        s.append(txtBa2.getText());
	        txtBa2.setText(s.substring(0,3)+s.substring(s.length()-2)); 
	        s.append(txtBa3.getText());
	        txtBa3.setText(s.substring(0,3)+s.substring(s.length()-2)); 
	        s.append(txtBa4.getText());
	        txtBa4.setText(s.substring(0,3)+s.substring(s.length()-2)); 
	        s.append(txtBa5.getText());
	        txtBa5.setText(s.substring(0,3)+s.substring(s.length()-2)); 
	        s.append(txtBa6.getText());
	        txtBa6.setText(s.substring(0,3)+s.substring(s.length()-2)); 
	        
	        s.append(txtBon1.getText());
	        txtBon1.setText(s.substring(0,2)+s.substring(s.length()-2)); 
	        s.append(txtBon2.getText());
	        txtBon2.setText(s.substring(0,2)+s.substring(s.length()-2));
	        s.append(txtBon3.getText());
	        txtBon3.setText(s.substring(0,2)+s.substring(s.length()-2)); 
	        s.append(txtBon4.getText());
	        txtBon4.setText(s.substring(0,2)+s.substring(s.length()-2)); 
	        
	        s.append(txtNam1.getText());
	        txtNam1.setText(s.substring(0,2)+s.substring(s.length()-2)); 
	        s.append(txtNam2.getText());
	        txtNam2.setText(s.substring(0,2)+s.substring(s.length()-2)); 
	        s.append(txtNam3.getText());
	        txtNam3.setText(s.substring(0,2)+s.substring(s.length()-2)); 
	        s.append(txtNam4.getText());
	        txtNam4.setText(s.substring(0,2)+s.substring(s.length()-2)); 
	        s.append(txtNam5.getText());
	        txtNam5.setText(s.substring(0,2)+s.substring(s.length()-2)); 
	        s.append(txtNam6.getText());
	        txtNam6.setText(s.substring(0,2)+s.substring(s.length()-2)); 
	        
	        s.append(txtSau1.getText());
	        txtSau1.setText(s.substring(0,1)+s.substring(s.length()-2)); 
	        s.append(txtSau2.getText());
	        txtSau2.setText(s.substring(0,1)+s.substring(s.length()-2)); 
	        s.append(txtSau3.getText());
	        txtSau3.setText(s.substring(0,1)+s.substring(s.length()-2)); 
	        
		}
		public void runAdd() throws InvalidPropertiesFormatException, FileNotFoundException, IOException {
			
			
			
			Properties prop = new Properties();

//			 ghi vao xml
			prop.setProperty("DB",txtDacbiet.getText());
			prop.setProperty("Nhat",txtNhat.getText());
			
			prop.setProperty("Nhi1",txtNhi1.getText());
			prop.setProperty("Nhi2",txtNhi2.getText());
			
			prop.setProperty("Ba1",txtBa1.getText());
			prop.setProperty("Ba2",txtBa2.getText());
			prop.setProperty("Ba3",txtBa3.getText());
			prop.setProperty("Ba4",txtBa4.getText());
			prop.setProperty("Ba5",txtBa5.getText());
			prop.setProperty("Ba6",txtBa6.getText());
			
			prop.setProperty("Bon1",txtBon1.getText());
			prop.setProperty("Bon2",txtBon2.getText());
			prop.setProperty("Bon3",txtBon3.getText());
			prop.setProperty("Bon4",txtBon4.getText());
			
			prop.setProperty("Nam1",txtNam1.getText());
			prop.setProperty("Nam2",txtNam2.getText());
			prop.setProperty("Nam3",txtNam3.getText());
			prop.setProperty("Nam4",txtNam4.getText());
			prop.setProperty("Nam5",txtNam5.getText());
			prop.setProperty("Nam6",txtNam6.getText());
		
			prop.setProperty("Sau1",txtSau1.getText());
			prop.setProperty("Sau2",txtSau2.getText());
			prop.setProperty("Sau3",txtSau3.getText());
			
			prop.setProperty("Bay1",txtBay1.getText());
			prop.setProperty("Bay2",txtBay2.getText());
			prop.setProperty("Bay3",txtBay3.getText());
			prop.setProperty("Bay4",txtBay4.getText());
			
			prop.storeToXML(new FileOutputStream("Data.xml"),"last updated at "+new Date().toString()+" By JGuru");
	 	
		}	

//		 doc tu xml
		public void Load() throws InvalidPropertiesFormatException, FileNotFoundException, IOException{
		Properties prop = new Properties();
		prop.loadFromXML(new FileInputStream("Data.xml"));
		String DB = prop.getProperty("DB");
		txtDacbiet.setText(DB);
		String Nhat = prop.getProperty("Nhat");
		txtNhat.setText(Nhat);
		
		String Nhi1 = prop.getProperty("Nhi1");
		txtNhi1.setText(Nhi1);
		String Nhi2 = prop.getProperty("Nhi2");
		txtNhi2.setText(Nhi2);
		
		String Ba1 = prop.getProperty("Ba1");
		txtBa1.setText(Ba1);
		String Ba2 = prop.getProperty("Ba2");
		txtBa2.setText(Ba2);
		String Ba3 = prop.getProperty("Ba3");
		txtBa3.setText(Ba3);
		String Ba4 = prop.getProperty("Ba4");
		txtBa4.setText(Ba4);
		String Ba5 = prop.getProperty("Ba5");
		txtBa5.setText(Ba5);
		String Ba6 = prop.getProperty("Ba6");
		txtBa6.setText(Ba6);
		
		String Bon1 = prop.getProperty("Bon1");
		txtBon1.setText(Bon1);
		String Bon2 = prop.getProperty("Bon2");
		txtBon2.setText(Bon2);
		String Bon3 = prop.getProperty("Bon3");
		txtBon3.setText(Bon3);
		String Bon4 = prop.getProperty("Bon4");
		txtBon4.setText(Bon4);
		
		String Nam1 = prop.getProperty("Nam1");
		txtNam1.setText(Nam1);
		String Nam2 = prop.getProperty("Nam2");
		txtNam2.setText(Nam2);
		String Nam3 = prop.getProperty("Nam3");
		txtNam3.setText(Nam3);
		String Nam4 = prop.getProperty("Nam4");
		txtNam4.setText(Nam4);
		String Nam5 = prop.getProperty("Nam5");
		txtNam5.setText(Nam5);
		String Nam6= prop.getProperty("Nam6");
		txtNam6.setText(Nam6);
		
		String Sau1 = prop.getProperty("Sau1");
		txtSau1.setText(Sau1);
		String Sau2 = prop.getProperty("Sau2");
		txtSau2.setText(Sau2);
		String Sau3 = prop.getProperty("Sau3");
		txtSau3.setText(Sau3);
		
		String Bay1 = prop.getProperty("Bay1");
		txtBay1.setText(Bay1);
		String Bay2 = prop.getProperty("Bay2");
		txtBay2.setText(Bay2);
		String Bay3 = prop.getProperty("Bay3");
		txtBay3.setText(Bay3);
		String Bay4 = prop.getProperty("Bay4");
		txtBay4.setText(Bay3);
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
	        //Add tinhKQ=new Add("Tinh Ket Qua");
			//tinhKQ.setVisible(true);
		
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
	    		 txtMean.append(S[kq].toString()+"____________"+dem[kq]+" lan"+"\n"); 
	    	 }else{
	    		 if((kq>=0)&&(kq<=21)) txtMean1.append(" "+S[kq].toString()+"\n"); 
	    		 if((kq>=22)&&(kq<=42)) txtMean2.append(" "+S[kq].toString()+"\n"); 
	    		 if((kq>=43)&&(kq<=84)) txtMean3.append(" "+S[kq].toString()+"\n"); 
	    		 if((kq>=85)&&(kq<100)) txtMean4.append(" "+S[kq].toString()+"\n"); 
	    	 }
	    }
	   
	     
		}//Ket thuc tinhKQ
		
		
		
		public void actionPerformed(ActionEvent Click)  {
			// TODO Auto-generated method stub
			
			if(Click.getSource()==btnThem){
			   if(Status==0){
				   Status=1;
				   
			   } else if(Status==1){
					   Status=0;
				   }
			  
			}
			else if(Click.getSource()==btnCancel){
				this.dispose();
				
			}
			else if(Click.getSource()==btnTinhKQ){
				txtMean.setText("");
				txtMean1.setText("");
				txtMean2.setText("");
				txtMean3.setText("");
				txtMean4.setText("");
				TinhKQ();
		       
			}
			else if(Click.getSource()==btnAdd){
				try {
					
					runAdd();
				} catch (InvalidPropertiesFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//Dialog Dlg=new Dialog("Thong bao");
				//Dlg.setVisible(true);
				//Dlg.lblReport.setText("Đã cập nhập dữ liệu :"+lblCaption.getText());
			}
		}

}


