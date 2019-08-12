import java.util.Scanner;

/*18)String[] input1=["Vikas","Lokesh",Ashok]
   expected output String: "Vikas,Lokesh,Ashok"
*/
public class program18 {

	public static void main(String[] args) {
		String s = "";
		String str[] = { "Vikas", "Lokesh", "Ashok" };
		for (int i = 0; i <= str.length - 1; i++) {
			s = str[i];
			System.out.print(s);
			for (int j =i+ 1; j <=str.length-1; j++) {
				System.out.print(",");
				break;
			}
		}

	}

}
