package programs;

public class N_nofprimenumbers {

	public static void main(String[] args) {
// Method 1		
		int n = 10;
	
		String primenumbers = "";
		//int primen =0;
		
		
		for(int i=1;i<=n;i++) { 
			int count = 0;
			for(int j=i;j>=1;j--) {  
				
				if(i%j == 0) { 
					
					count++;
				}
			}
			if(count == 2) {
				
				primenumbers = primenumbers+i+" ";
			}
			
		}
		System.out.println(primenumbers);
		
		
// Method 2
		
		int val1=15;
		
		for(int i=2;i<=val1;i++) {
			boolean flag = true;
			for(int j=2;j<=i-1;j++) {
				//System.out.println("the value of i is====>> "+ i);
				if(i%j==0) {
					flag = false;
					break;
				}
			}
			if(flag == true) {
				System.out.print(i);
				System.out.print("\t");
			}
			
			
		}
		

	}

}
