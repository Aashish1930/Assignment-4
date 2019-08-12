
/*3)Given array of string check whether all the elements contains only digits not any alaphabets.
if condition satisfied print 1 else -1.
Input:{"123","23.14","522"}
output:1

*/

import java.util.Scanner;

public class program3 {
	public void check(int size) {
		String str = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element ");
		String array[] = new String[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextLine();
		}
		for (int j = 0; j < array.length; j++) {
			str = str + array[j];
		}
		System.out.println(str);
		if (str.matches("[0-9]+")) {
			System.out.println("1");
		} else {
			System.out.println("-1");
		}
		sc.close();

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the size of array ");
		int size = sc.nextInt();
		program3 p = new program3();
		p.check(size);
		sc.close();
	}
}
