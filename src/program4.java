import java.util.Scanner;

/*4)int[] a={12,14,2,26,35}
find the difference b/w max and min values in array
output:35-2=33.
*/
public class program4 {
	public void check(int size) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element here ");
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		int max = array[0];
		for (int j = 0; j < array.length; j++) {
			if (max < array[j]) {
				max = array[j];
			}

		}
		int min = array[0];
		for (int k = 0; k < array.length; k++) {

			if (min > array[k]) {
				min = array[k];
			}
		}
		System.out.println("Max num is: " + max);
		System.out.println("Min num is: " + min);
		System.out.println("Difference between Min and Max is: " + (max - min));

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size = sc.nextInt();
		program4 p = new program4();
		p.check(size);

	}

}
