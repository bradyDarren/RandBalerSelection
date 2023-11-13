import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class RandColor2 {
	
	int x;
	
	String c1; 
	String c2; 
	String c3; 
	String c4;
	
	Frame frame = new Frame();
	
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
		
		for(int i = 0; i <9;i++) {
			x = randN.nextInt(list.size());
			System.out.println(list.get(x));
			if(list.get(x) == "Red") {
				c1 = list.get(x);
			}
			else if(list.get(x) == "Green") {
				c2 = list.get(x);
			}
			else if(list.get(x) == "Blue") {
				c3 = list.get(x);
			}
			else if (list.get(x) == "Orange") {
				c4 = list.get(x);
			}
			list.remove(x);
			System.out.println(list);
		}
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	}
}
