import java.util.Scanner;

/*15) Given an array int a[]. Add the sum at even indexes.
 * do the same with odd indexes.
 if both the sum is equal return 1 or return -1.

*/
public class program15 {

	public static void main(String[] args) {
		
		int evensum = 0;
		int oddsum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		System.out.println("enter the element ");
		int array[]=new int [size];
		for(int i=0;i<=array.length-1;i++)
		{
			array[i]=sc.nextInt();
		}
		for(int j=1;j<array.length;j++)
		{
			
			if(j%2==0)
			{
				evensum=evensum+array[j];
			}
			else
			{
				oddsum=oddsum+array[j];
			}
			
		}
				
		System.out.println("enven sum is:- "+evensum+ " odd sum is :- "+oddsum);
		
		if(evensum==oddsum)
		{
			System.out.println("1");
	
		}
		else
		{
			System.out.println("-1");
		}
		
	}

}














