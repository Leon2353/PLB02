package h2;

public class H2_main {
	
	public static void main (String[] args) {
		
		int i = -100;
		int j = 2;
		int k = 7;
		int min = 0;
		int max = 0;
		
		if (i>j && i>k) {
			max=i;
			System.out.println("Das Maximum liegt bei: " + max);
		}
		
		else if (j>i && j>k) {
			max=j;
			System.out.println("Das Maximum liegt bei: " + max);
		}
		
		else if (k>i && k>j) {
			max=k;
			System.out.println("Das Maximum liegt bei: " + max);
		}
		/*
		//Nur falls i,j,k nicht paarweise verschieden.
		else {
			System.out.println("Kein eindeutiges Maximum.");
		}
		*/
		
	
		if (i<j && i<k) {
			min=i;
			System.out.println("Das Minimum liegt bei: " + min);
		}
		else if (j<i && j<k) {
			min=j;
			System.out.println("Das Minimum liegt bei: " + min);
		}
		else if (k<i && k<j) {
			min=k;
			System.out.println("Das Minimum liegt bei: " + min);
		}
		/*
		//Nur falls i,j,k nicht paarweise verschieden.
		 else {
			System.out.println("Kein eindeutiges Minimum.");
		}
		*/
	}
	
}
