import java.util.Scanner;

/*
 * 1)input1="abc2012345"
	input2="abc2112660"
	input 3=4
here "abc**" refers to customer id.
12345 refers to last month eb reading and 12660 refers to this month eb reading
find the difference between two readings and multiply it by input3

ie., output=(12660-12345)*4
 */

public class program41 {

	public void check(String s1, String s2, int n) {
		String sub1 = s1.substring(5, s1.length());
		String sub2 = s2.substring(5, s2.length());
		int num = Integer.parseInt(sub1);
		int num1 = Integer.parseInt(sub2);
		int out = num-num1;
		int ans = out*n;
		System.out.println(ans);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String here ");
		String s1 = sc.nextLine();
		System.out.println("Enter the Second String here ");
		String s2 = sc.nextLine();
		System.out.println("Enter the value here ");
		int n = sc.nextInt();
		program41 p = new program41();
		p.check(s1, s2, n);

	}

}
