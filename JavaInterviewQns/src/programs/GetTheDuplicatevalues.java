package programs;

public class GetTheDuplicatevalues {

	public static void main(String[] args) {
		
		String a = "sesh";
		int b= a.length();
		char[] ch = a.toCharArray();
		
		int count =0;
		for(int i=0;i<b;i++) {
			for(int j=i+1;j<b;j++) {
				
				if(ch[i]== ch[j]) {
					
					System.out.println(ch[j]);
					count++;
					break;
				}
				
			}
		
		}

	}

}
