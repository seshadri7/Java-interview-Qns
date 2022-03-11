package programs;

public class Findmaxinarray {

	public static int a[] = { 5, 6, 3, 7, 9, 8 };
	public static int b = a.length;

	//taking first index in array
	public static int max = a[0];

	public static void main(String[] args) {

		for (int i = 0; i < b; i++) {

			//Comparing to all values based on the first index value
			
			if (max < a[i]) {
				max = a[i];
			}

		}
		System.out.println("Maximum number is: "+ max);

	}

}
