package programs;

public class Findmaxinarray {
	
public static 	int a[] = {5,6,3,7,9,8};
 public static  int b= a.length; // 6
	
public static int max = a[0];

	public static void main(String[] args) {
		//System.out.println("Sample ==== >"+max);
		for(int i=0;i<b;i++) { 
			
			//System.out.println("samp 2 "+ max);
			if(max<a[i]) {
			max = a[i];
			}
			
		}
		System.out.println(max);

	}

}
