/*9)find the no.of charcters,that has repeated 3 consecutive times
input1:"aaabbccc"
ouput1=2;
*/

// not completed 
import java.util.Scanner;

public class program9 {

	public static void main(String[] args) {

		System.out.println("enter here ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char[] ch = str.toCharArray();
		
		for (int i = 0; i < ch.length-1; i++) {
			for (int j = i + 1; j <= ch.length-1; j++) {
				
				
				if (ch[i] == ch[j] && ch[i] == ch[j + 1])
				{
					System.out.println(ch[i]);
				}
			}

		}

	}

}