package programs;

public class Reverenumber {

	public static void main(String[] args) {
		
		int a = 123;
		
		while(a!=0) {
			
			int b= a%10;
			System.out.println(b);
			a=a/10;
			
		}		
		
	}

}
