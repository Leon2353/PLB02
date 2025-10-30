package h3;

public class H3_main {

	public static void main(String[] args) {

		int i = -3000;
		int j = 300;
		int k = -10;

		if (i > j) {

			k = 1;

			if (i > 200) {

				k = 2;

				if (j > 100) {

					k = 3;

				}
			}
		}

		else if (i <= j && i <= 200 && j <= 100) {

			k = 4;

		}
		
		//System.out.println("k lautet: " + k);

	}

}
