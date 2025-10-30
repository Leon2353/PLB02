package h3;

public class H3_main {
	
	public static void main (String[] args) {
		
		int i = -3000;
		int j = 300;
		int k = -10;
		
		if (i>j && i<=200 && j<=100) {
			
			k=1;
			System.out.println("k lautet: " + k);
			
		}

		else if (i>j && i>200 && j<=100) {
			
			k=2;
			System.out.println("k lautet: " + k);
			
		}
		
		else if (i>j && i>200 && j>100) {
			
			k=3;
			System.out.println("k lautet: " + k);
			
		}
		
		else if (i<=j && i<=200 && j<=100) {
			
			k=4;
			System.out.println("k lautet: " + k);
			
		}
		
		else {
			
			System.out.println("k lautet: " + k);
			
		}
		
	}

}
