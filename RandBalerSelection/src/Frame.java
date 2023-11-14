import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

public class Frame extends JFrame{
	
	//declaration of text fields for user input
	JTextField f1;
	JTextField f2; 
	JTextField f3; 
	JTextField f4; 
	JTextField f5; 
	JTextField f6; 
	JTextField f7; 
	JTextField f8; 
	JTextField f9; 
	
	//declaration of our ImageIcon displayed within our GUI window. 
	ImageIcon HEB;
	
	//declaration of our labels within our GUI window.
	JLabel label;//this label houses our logo at the top of the GUI Window. 
	JLabel instr;
	JLabel l1; 
	JLabel l2; 
	JLabel l3; 
	JLabel l4; 
	JLabel l5; 
	JLabel l6; 
	JLabel l7; 
	JLabel l8;
	JLabel l9;
	
	// declaration of our Strings used to transfer info from our TextFields to our Labels.
	String s1;
	String s2; 
	String s3; 
	String s4; 
	String s5; 
	String s6; 
	String s7; 
	String s8;
	String s9; 
	
	//declaration of our buttons within our window.
	JButton button1;
	JButton button2; 
	
	//declaration of our integers to house our instances of our random numbers.
	int x1; 
	int x2; 
	int x3; 
	int x4; 
	int x5; 
	int x6;
	int x7; 
	int x8;
	int x9; 
	
	Frame(){ 
		
		//designation of a image to our ImageIcon previously declared. 
		HEB = new ImageIcon("HEB.jpeg");
		
		//attributes of our label that houses our Logo. 
		label = new JLabel();
		label.setIcon(HEB);
		label.setBounds(52,0,1400,345);

		//Attributes of the our GUI frame. 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("RGC DAILY ASSIGNMENTS");
		this.setSize(1500, 1050);
		this.getContentPane().setBackground(Color.BLACK);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.add(label);
		
		//Instructions above out TextFields to notify the user of what to do. 
		instr = new JLabel("Please input the name of the partners within the boxes below:");
		instr.setBounds(25,350,510,75);
		instr.setFont(new Font ("MV Boli",Font.BOLD,16));
		instr.setForeground(Color.red);
		this.add(instr);
		
		//designation of our new Labels 
		l1 = new JLabel();		
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		l5 = new JLabel();
		l6 = new JLabel();
		l7 = new JLabel();
		l8 = new JLabel();
		l9 = new JLabel();

		//designation of the position of our labels on our Frame. 
		l1.setBounds(950,400,175,50);
		l2.setBounds(950,455,175,50);
		l3.setBounds(950,510,175,50);
		l4.setBounds(950,565,175,50);
		l5.setBounds(1125,400,175,50);
		l6.setBounds(1125,455,175,50);
		l7.setBounds(1125,510,175,50);
		l8.setBounds(1125,565,175,50);
		l9.setBounds(1040,620,175,50);
		
		//calling our our Color method below.
		Color();

		l1.setFont(new Font("MV Boli",Font.BOLD,25));
		l2.setFont(new Font("MV Boli",Font.BOLD,25));
		l3.setFont(new Font("MV Boli",Font.BOLD,25));
		l4.setFont(new Font("MV Boli",Font.BOLD,25));
		l5.setFont(new Font("MV Boli",Font.BOLD,25));
		l6.setFont(new Font("MV Boli",Font.BOLD,25));
		l7.setFont(new Font("MV Boli",Font.BOLD,25));
		l8.setFont(new Font("MV Boli",Font.BOLD,25));
		l9.setFont(new Font("MV Boli",Font.BOLD,25));
				
		this.add(l1);
		this.add(l2);
		this.add(l3);
		this.add(l4);
		this.add(l5);
		this.add(l6);
		this.add(l7);
		this.add(l8);
		this.add(l9);
				
		button1 = new JButton("Submit!!!");
		button2 = new JButton("Clear!!!");
		
		button1.setBounds(195,675,70,35);
		button2.setBounds(265,675,70,35);
		
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button1) {
					Results();
				}
			}
			
		});

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button2) {
					Clear();
				}
			}
			
		});
		
		this.add(button1);
		this.add(button2);
		
		f1 = new JTextField();
		f2 = new JTextField();
		f3 = new JTextField();
		f4 = new JTextField();
		f5 = new JTextField();
		f6 = new JTextField();
		f7 = new JTextField();
		f8 = new JTextField();
		f9 = new JTextField();
		
		f1.setBounds(90, 400, 175, 50);
		f2.setBounds(90, 455, 175, 50);
		f3.setBounds(90, 510, 175, 50);
		f4.setBounds(90, 565, 175, 50);
		f5.setBounds(265, 400, 175, 50);
		f6.setBounds(265, 455, 175, 50);
		f7.setBounds(265, 510, 175, 50);
		f8.setBounds(265, 565, 175, 50);
		f9.setBounds(180, 620, 175, 50);
		
		this.add(f1);
		this.add(f2);
		this.add(f3);
		this.add(f4);
		this.add(f5);
		this.add(f6);
		this.add(f7);
		this.add(f8);
		this.add(f9);
		
		this.setVisible(true);
	}
		public void Results() {
		s1 = f1.getText();
		l1.setText(s1);
		s2 = f2.getText();
		l2.setText(s2);
		s3 = f3.getText();
		l3.setText(s3);
		s4 = f4.getText();
		l4.setText(s4);
		s5 = f5.getText();
		l5.setText(s5);
		s6 = f6.getText();
		l6.setText(s6);
		s7 = f7.getText();
		l7.setText(s7);
		s8 = f8.getText();
		l8.setText(s8);
		s9 = f9.getText();
		l9.setText(s9);
	}
	public void Clear() {
		s1 = f1.getText();
		l1.setText("");
		s2 = f2.getText();
		l2.setText("");
		s3 = f3.getText();
		l3.setText("");
		s4 = f4.getText();
		l4.setText("");
		s5 = f5.getText();
		l5.setText("");
		s6 = f6.getText();
		l6.setText("");
		s7 = f7.getText();
		l7.setText("");
		s8 = f8.getText();
		l8.setText("");
		s9 = f9.getText();
		l9.setText("");
	}
	public void Color() {
		
		//creation of a ArrayList to house our selection pool. 
		ArrayList <String> list = new ArrayList<>();
		
		//adding in the possible selections into our ArrrayList. 
		list.add("Red");
		list.add("Red");
		list.add("Green");
		list.add("Green");
		list.add("Blue");
		list.add("Orange");
		list.add("Orange");
		list.add("Orange");
		list.add("Orange");
		
		//instance of our Random class that will allow us to randomly select
		Random randN = new Random();

		/*if our Array List is not empty then we will pull a random Index ranging from 0 to 8 (the size of our Array) depending on the index
		 * that we pull if the color that will be assigned to each text box.*/
		if(!list.isEmpty()) { 
			x1=randN.nextInt(list.size());
			if(list.get(x1)=="Red") {
			l1.setForeground(Color.RED);
			}
			else if(list.get(x1)=="Green") {
			l1.setForeground(Color.GREEN);
			}
			else if(list.get(x1)=="Blue") {
			l1.setForeground(Color.BLUE);
			}
			else if(list.get(x1)=="Orange") {
			l1.setForeground(Color.ORANGE);
			}
		}
			list.remove(x1);
			System.out.println(list);

		if(!list.isEmpty()) {
			x2=randN.nextInt(list.size());
			if(list.get(x2)=="Red") {
			l2.setForeground(Color.RED);
			}
			else if(list.get(x2)=="Green") {
			l2.setForeground(Color.GREEN);
			}
			else if(list.get(x2)=="Blue") {
			l2.setForeground(Color.BLUE);
			}
			else if(list.get(x2)=="Orange") {
			l2.setForeground(Color.ORANGE);
			}
		}
			list.remove(x2);
			System.out.println(list);

		if(!list.isEmpty()) {
			x3=randN.nextInt(list.size());
			if(list.get(x3)=="Red") {
			l3.setForeground(Color.RED);
			}
			else if(list.get(x3)=="Green") {
			l3.setForeground(Color.GREEN);
			}
			else if(list.get(x3)=="Blue") {
			l3.setForeground(Color.BLUE);
			}
			else if(list.get(x3)=="Orange") {
			l3.setForeground(Color.ORANGE);
			}
		}
			list.remove(x3);
			System.out.println(list);
		
		if(!list.isEmpty()) {
			x4=randN.nextInt(list.size());
			if(list.get(x4)=="Red") {
			l4.setForeground(Color.RED);
			}
			else if(list.get(x4)=="Green") {
			l4.setForeground(Color.GREEN);
			}
			else if(list.get(x4)=="Blue") {
			l4.setForeground(Color.BLUE);
			}
			else if(list.get(x4)=="Orange") {
			l4.setForeground(Color.ORANGE);
			}
		}
			list.remove(x4);
			System.out.println(list);

		if(!list.isEmpty()) {
			x5=randN.nextInt(list.size());
			if(list.get(x5)=="Red") {
			l5.setForeground(Color.RED);
			}
			else if(list.get(x5)=="Green") {
			l5.setForeground(Color.GREEN);
			}
			else if(list.get(x5)=="Blue") {
			l5.setForeground(Color.BLUE);
			}
			else if(list.get(x5)=="Orange") {
			l5.setForeground(Color.ORANGE);
			}
		}
			list.remove(x5);
			System.out.println(list);

		if(!list.isEmpty()) {
			x6=randN.nextInt(list.size());
			if(list.get(x6)=="Red") {
			l6.setForeground(Color.RED);
			}
			else if(list.get(x6)=="Green") {
			l6.setForeground(Color.GREEN);
			}
			else if(list.get(x6)=="Blue") {
			l6.setForeground(Color.BLUE);
			}
			else if(list.get(x6)=="Orange") {
			l6.setForeground(Color.ORANGE);
			}
		}
			list.remove(x6);
			System.out.println(list);

		if(!list.isEmpty()) {
			x7=randN.nextInt(list.size());
			if(list.get(x7)=="Red") {
			l7.setForeground(Color.RED);
			}
			else if(list.get(x7)=="Green") {
			l7.setForeground(Color.GREEN);
			}
			else if(list.get(x7)=="Blue") {
			l7.setForeground(Color.BLUE);
			}
			else if(list.get(x7)=="Orange") {
			l7.setForeground(Color.ORANGE);
			}
		}
			list.remove(x7);
			System.out.println(list);

		if(!list.isEmpty()) {
			x8=randN.nextInt(list.size());
			if(list.get(x8)=="Red") {
			l8.setForeground(Color.RED);
			}
			else if(list.get(x8)=="Green") {
			l8.setForeground(Color.GREEN);
			}
			else if(list.get(x8)=="Blue") {
			l8.setForeground(Color.BLUE);
			}
			else if(list.get(x8)=="Orange") {
			l8.setForeground(Color.ORANGE);
			}
		}
			list.remove(x8);
			System.out.println(list);

		if(!list.isEmpty()) {
			x9=randN.nextInt(list.size());
			if(list.get(x9)=="Red") {
			l9.setForeground(Color.RED);
			}
			else if(list.get(x9)=="Green") {
			l9.setForeground(Color.GREEN);
			}
			else if(list.get(x9)=="Blue") {
			l9.setForeground(Color.BLUE);
			}
			else if(list.get(x9)=="Orange") {
			l9.setForeground(Color.ORANGE);
			}
		}
			list.remove(x9);
			System.out.println(list);

		/*x2=randN.nextInt(list.size());
		list.remove(x2);*/	
	}
}