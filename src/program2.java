import java.util.Scanner;

/*2)Given array of intergers,print the sum of elements
 *  sqaring/cubing as per the power of their indices.         
//answer=  sum=sum+a[i]^i;
     eg:input:{2,3,5}
	Output:29
*/

public class program2 {

	public void check(int size) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element here ");
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		for (int j = 0; j < array.length; j++) {
		
			sum=(int) (sum+(Math.pow(array[j], j)));
		
		}
		System.out.println(sum);
		sc.close();
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size = sc.nextInt(); 
		program2 p = new program2();
		p.check(size);
		sc.close();
	}

}
