
/*7) arraylist1={ 1,2,3,4,5}
    arraylist2={ 6,7,8,9,10}
size of both list should be same 

output={6,2,8,4,10}
*/

// use even odd logic here 
import java.util.ArrayList;

public class program7 {

	public static void main(String[] args) {
		int A1[] = { 1, 2, 3, 4, 5 };
		int A2[] = { 6, 7, 8, 9, 10 };

		for (int i = 0; i < A2.length; i = (i + 2)) {
			System.out.print(A2[i] + " ");

			for (int j = i + 1; j < A1.length; j++) {
				System.out.print(A1[j] + " ");
				break;
			}
		}
	}
}