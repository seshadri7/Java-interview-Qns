package programs;

public class GetTheDuplicateValuesString {

	public static void main(String[] args) {

		String a = "seshsha";
		int b = a.length();
		char[] ch = a.toCharArray();

		for (int i = 0; i < b; i++) {
			for (int j = i + 1; j < b; j++) {

				if (ch[i] == ch[j]) {

					System.out.println("Duplicate Values in string: " + ch[i] +" "+ "index: " + j);
					break;

				}

			}

		}

	}

}
