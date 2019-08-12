import java.util.Scanner;

/*14)for the given string display the middle 2 value, 
 * case satisfies only if string is of even length
ip - jamqva
op - av
*/
public class program14 {

	public static void main(String[] args) {

		System.out.println("Enter here ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if (str.length() % 2 == 0) {
			System.out.println(str.substring(1, str.length() - 1));
		}
		
		
		

	}

}
