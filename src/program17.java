import java.security.DigestInputStream;

/*17)Find the sum of the numbers in the given input string array
   Input{“2AA”,”12”,”ABC”,”c1a”)
   Output:6 (2+1+2+1)
   Note in the above array 12 must not considered as such
   i.e,it must be considered as 1,2

*/

public class program17 {

	public static void main(String[] args) {
		String digit = "";
		int sum = 0;
		String[] str = { "2AA", "12", "ABC", "C1A" };

		for (int i = 0; i <= str.length - 1; i++) {
			String s = str[i];

			for (int j = 0; j < s.length(); j++) {

				if (Character.isDigit(s.charAt(j))) {

					digit = digit + s.charAt(j);// charchter value provide only
												// ascii value

				}
				if (!digit.equals("")) {
					sum = sum + Integer.parseInt(digit);
					digit = "";
				}
			}

		}
		System.out.println("sum is " + sum);

	}
}
