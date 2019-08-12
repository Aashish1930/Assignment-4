/*
8)count the number of times the second word in second string occurs in first string-case sensitive
*/

public class program8 {

	public void check(String s1, String s2) {

		String[] ch1 = s1.split(" ");
		String[] ch2 = s2.split(" ");
		int count = 0;
		for (String str : ch1) {

			for (String str1 : ch2)

				if (str.equals(str1)) {
					count++;

				}
			

		}
		System.out.println("count is : " + count);

	}

	public static void main(String[] args) {

		String s1 = "hai hello hai where hai Hai";
		String s2 = "what hai";
		program8 p = new program8();
		p.check(s1, s2);

	}

}
