/*12)String a="a very fine day"
output:A Very Fine Day
*/
import java.util.Scanner;

public class program12 {
	public static void main(String[] args) {
		System.out.println("enter the String ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] s = str.split(" ");

		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i].substring(0, 1).toUpperCase() + s[i].substring(1, s[i].length()) + " ");

		}

	}

}
