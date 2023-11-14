import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;

public class RandColor2 {
	
	int x1;
	int x2;
	int x3;
	int x4;
	int x5;
	int x6;
	int x7;
	int x8;
	int x9;

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
		
		x1=randN.nextInt(list.size());
		list.remove(x1);	
		
		x2=randN.nextInt(list.size());
		list.remove(x2);	
		
		//System.out.println(list);
		
		/*for(int i = 0; i <9;i++) {
			x1 = randN.nextInt(list.size());
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
			//System.out.println(list);
		}
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);*/
	}
}
