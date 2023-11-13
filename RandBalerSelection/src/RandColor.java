import java.util.HashMap;
import java.util.Random;

public class RandColor {

	
	Random rand = new Random(); 
	int rand1;
	int rand2; // Test
	int x;
	int y;

	public void Color() { 
			
		HashMap<Integer,String> randC = new HashMap<>();
		
		randC.put(0, "Red");
		randC.put(1, "Red");
		randC.put(2, "Green");
		randC.put(3, "Green");
		randC.put(4, "Blue");
		randC.put(5, "Orange");
		randC.put(6, "Orange");
		randC.put(7, "Orange");
		randC.put(8, "Orange");
		
		//System.out.println(randC.size());
		//System.out.println(randC);
		
		x = rand.nextInt(randC.size());
		
		System.out.println(x);
		randC.remove(x);
		System.out.println(randC);
	
		/*for(int i=0; i<10;i++) { // Test
			rand2 = rand.nextInt(9);
			if(rand2==0) { 
				System.out.println(randC.get(0));
				randC.remove(0);
			}
			else if(rand2==1) { 
				System.out.println(randC.get(1));
				randC.remove(1);
			}
			else if(rand2==2) { 
				System.out.println(randC.get(2));
				randC.remove(2);
			}
			else if(rand2==3) { 
				System.out.println(randC.get(3));
				randC.remove(3);
			}
			else if(rand2==4) { 
				System.out.println(randC.get(4));
				randC.remove(4);
			}
			else if(rand2==5) { 
				System.out.println(randC.get(5));
				randC.remove(5);
			}
			else if(rand2==6) { 
				System.out.println(randC.get(6));
				randC.remove(6);
			}
			else if(rand2==7) { 
				System.out.println(randC.get(7));
				randC.remove(7);
			}
			else if(rand2==8) { 
				System.out.println(randC.get(8));
				randC.remove(8);
			}
		}*/
	}
	
}
