package programs;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		int count = 0;
		
		System.out.println("Enter a number to check prime or not");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		for(int i=2; i<value;i++) {
			
			if(value%i == 0) {
				
				count++;
				break;
				
			}
		}
		
		if(count == 0) {
			System.out.println("prime number");
		}else {
			System.out.println("Not prime number");
		}

	}
}
