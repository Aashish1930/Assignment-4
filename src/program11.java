/*11)Get all the numbers alone from the string and return the sum.
*/

import java.util.Scanner;

public class program11 {

	public static void main(String[] args) {

		int sum = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter here ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum = sum + Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println(sum);

	}

}
