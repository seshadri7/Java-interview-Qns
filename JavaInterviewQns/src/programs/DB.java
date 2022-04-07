package programs;

public class DB {

	public static void main(String[] args) {
		// DB: 02-24-2022 08:37 yy-mm-dd

		String UI = "08:37 02/24/2022";

		String[] v2 = UI.split(" ");

		String[] vDate = v2[1].split("/");

		String date = vDate[2].concat("-").concat(vDate[0]).concat("-").concat(vDate[1]);

		System.out.println(date);

		//String dateTime = vDate[2].concat("-").concat(vDate[0]).concat("-").concat(vDate[1]) + " " + v2[0];

		String dateTime = vDate[2]+"-"+vDate[0]+"-"+vDate[1]+" "+v2[0];

		System.out.println(dateTime);

	}

}
