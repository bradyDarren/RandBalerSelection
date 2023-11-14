import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

public class Frame extends JFrame{
	
	JTextField f1;//declaration of all of our text Fields.
	JTextField f2; 
	JTextField f3; 
	JTextField f4; 
	JTextField f5; 
	JTextField f6; 
	JTextField f7; 
	JTextField f8; 
	JTextField f9; 
	
	ImageIcon HEB;//declaration of our ImageIcon displayed within our GUI window. 
	
	JLabel label;//declaration of our labels within our GUI window.
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
	
	String s1;
	String s2; 
	String s3; 
	String s4; 
	String s5; 
	String s6; 
	String s7; 
	String s8;
	String s9; 
	
	JButton button1;//declaration of our button within our window.
	JButton button2; 
	
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
				
		HEB = new ImageIcon("HEB.jpeg");
		
		label = new JLabel();
		label.setIcon(HEB);
		label.setBounds(52,0,1400,345);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("RGC DAILY ASSIGNMENTS");
		this.setSize(1500, 1050);
		this.getContentPane().setBackground(Color.BLACK);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.add(label);
		
		instr = new JLabel("Please input the name of the partners within the boxes below:");
		instr.setBounds(25,350,510,75);
		instr.setFont(new Font ("MV Boli",Font.BOLD,16));
		this.add(instr);
		
		l1 = new JLabel();		
		l2 = new JLabel();
		l3 = new JLabel();
		l4 = new JLabel();
		l5 = new JLabel();
		l6 = new JLabel();
		l7 = new JLabel();
		l8 = new JLabel();
		l9 = new JLabel();

		l1.setBounds(950,400,175,50);
		l2.setBounds(950,455,175,50);
		l3.setBounds(950,510,175,50);
		l4.setBounds(950,565,175,50);
		l5.setBounds(1125,400,175,50);
		l6.setBounds(1125,455,175,50);
		l7.setBounds(1125,510,175,50);
		l8.setBounds(1125,565,175,50);
		l9.setBounds(1040,620,175,50);
		
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
		
		ArrayList <String> list = new ArrayList<>();
		
		list.add("Red");
		list.add("Red");
		list.add("Green");
		list.add("Green");
		list.add("Blue");
		list.add("Orange");
		list.add("Orange");
		list.add("Orange");
		list.add("Orange");
		
		Random randN = new Random();
		System.out.println(list);
		if(!list.isEmpty()) {
			x1=randN.nextInt(list.size());
			if(x1 == 0 || x1 == 1) {
			l1.setForeground(Color.RED);
			}
			else if(x1 >= 2 && x1 <= 3) {
			l1.setForeground(Color.GREEN);
			}
			else if(x1 == 4) {
			l1.setForeground(Color.BLUE);
			}
			else if(x1 >= 5 && x1 <= 8) {
			l1.setForeground(Color.ORANGE);
			}
		}
			list.remove(x1);
			System.out.println(list);

		if(!list.isEmpty()) {
			x2=randN.nextInt(list.size());
			if(x2 == 0 || x2 == 1) {
			l2.setForeground(Color.RED);
			}
			else if(x2 >= 2 && x2 <= 3) {
			l2.setForeground(Color.GREEN);
			}
			else if(x2 == 4) {
			l2.setForeground(Color.BLUE);
			}
			else if(x2 >= 5 && x2 <= 8) {
			l2.setForeground(Color.ORANGE);
			}
		}
			list.remove(x2);
			System.out.println(list);

		if(!list.isEmpty()) {
			x3=randN.nextInt(list.size());
			if(x3 == 0 || x3 == 1) {
			l3.setForeground(Color.RED);
			}
			else if(x3 >= 2 && x3 <= 3) {
			l3.setForeground(Color.GREEN);
			}
			else if(x3 == 4) {
			l3.setForeground(Color.BLUE);
			}
			else if(x3 >= 5 && x3 <= 8) {
			l3.setForeground(Color.ORANGE);
			}
		}
			list.remove(x3);
			System.out.println(list);
		
		if(!list.isEmpty()) {
			x4=randN.nextInt(list.size());
			if(x4 == 0 || x4 == 1) {
			l4.setForeground(Color.RED);
			}
			else if(x4 >= 2 && x4 <= 3) {
			l4.setForeground(Color.GREEN);
			}
			else if(x4 == 4) {
			l4.setForeground(Color.BLUE);
			}
			else if(x4 >= 5 && x4 <= 8) {
			l4.setForeground(Color.ORANGE);
			}
		}
			list.remove(x4);
			System.out.println(list);

		if(!list.isEmpty()) {
			x5=randN.nextInt(list.size());
			if(x5 == 0 || x5 == 1) {
			l5.setForeground(Color.RED);
			}
			else if(x5 >= 2 && x5 <= 3) {
			l5.setForeground(Color.GREEN);
			}
			else if(x5 == 4) {
			l5.setForeground(Color.BLUE);
			}
			else if(x5 >= 5 && x5 <= 8) {
			l5.setForeground(Color.ORANGE);
			}
		}
			list.remove(x5);
			System.out.println(list);

		if(!list.isEmpty()) {
			x6=randN.nextInt(list.size());
			if(x6 == 0 || x6 == 1) {
			l6.setForeground(Color.RED);
			}
			else if(x6 >= 2 && x6 <= 3) {
			l6.setForeground(Color.GREEN);
			}
			else if(x6 == 4) {
			l6.setForeground(Color.BLUE);
			}
			else if(x6 >= 5 && x6 <= 8) {
			l6.setForeground(Color.ORANGE);
			}
		}
			list.remove(x6);
			System.out.println(list);

		if(!list.isEmpty()) {
			x7=randN.nextInt(list.size());
			if(x7 == 0 || x7 == 1) {
			l7.setForeground(Color.RED);
			}
			else if(x7 >= 2 && x7 <= 3) {
			l7.setForeground(Color.GREEN);
			}
			else if(x7 == 4) {
			l7.setForeground(Color.BLUE);
			}
			else if(x7 >= 5 && x7 <= 8) {
			l7.setForeground(Color.ORANGE);
			}
		}
			list.remove(x7);
			System.out.println(list);

		if(!list.isEmpty()) {
			x8=randN.nextInt(list.size());
			if(x8 == 0 || x8 == 1) {
			l8.setForeground(Color.RED);
			}
			else if(x8 >= 2 && x8 <= 3) {
			l8.setForeground(Color.GREEN);
			}
			else if(x8 == 4) {
			l8.setForeground(Color.BLUE);
			}
			else if(x8 >= 5 && x8 <= 8) {
			l8.setForeground(Color.ORANGE);
			}
		}
			list.remove(x8);
			System.out.println(list);

		if(!list.isEmpty()) {
			x9=randN.nextInt(list.size());
			if(x9 == 0 || x9 == 1) {
			l9.setForeground(Color.RED);
			}
			else if(x9 >= 2 && x9 <= 3) {
			l9.setForeground(Color.GREEN);
			}
			else if(x9 == 4) {
			l9.setForeground(Color.BLUE);
			}
			else if(x9 >= 5 && x9 <= 8) {
			l9.setForeground(Color.ORANGE);
			}
		}
			list.remove(x9);
			System.out.println(list);

		/*x2=randN.nextInt(list.size());
		list.remove(x2);*/	
	}
}