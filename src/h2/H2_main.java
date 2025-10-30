package h2;

public class H2_main {

	public static void main(String[] args) {

		int i = -100;
		int j = 2;
		int k = 7;
		int min = 0;
		int max = 0;

		if (i > j && i > k) {
			
			max = i;
			
		}

		else if (j > i && j > k) {
			
			max = j;
			
		}

		else if (k > i && k > j) {
			
			max = k;
			
		}

		if (i < j && i < k) {
			
			min = i;
			
		} else if (j < i && j < k) {
			
			min = j;
			
		} else if (k < i && k < j) {
			
			min = k;

		}

		System.out.println("Das Maximum liegt bei: " + max);
		System.out.println("Das Minimum liegt bei: " + min);
	}

}
