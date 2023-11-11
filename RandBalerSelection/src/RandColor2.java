import java.util.ArrayList;
import java.util.Random;

public class RandColor2 {

	
	public void Color() {
		
		String x;
		
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
		
		x = list.get(randN.nextInt(list.size()));
		
		/*int x;
		int max = 8;
		int min = 0;
		
		System.out.println("The following number are the min of " + min + " and the max of "+max+":");
		x=randN.nextInt(max-min+1)+min;
		System.out.println(x);
		
		System.out.println(randN.nextInt());
		
		for(int i = randNumber.length-1;i>0;i--) {
			
		}*/
	}
}
