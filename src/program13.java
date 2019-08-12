import java.util.Scanner;

/*13)Take the word with a max length in the given sentance
 in that check for vowels if so count the no.of occurances !
  Input 1="Bhavane is a good girl"
  Output =3
  Input 1="Bhavanee is a good girl"
  Output =4
*/

public class program13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("enter here ");
		String str=sc.nextLine();
	
		String s[]= str.split(" ");
		String max=s[0];
		for (int i=0;i<s.length;i++)
		{
			//System.out.println(s[i]);
		
			if(max.length()<s[i].length())
			{
				max=s[i];
			}
		}
		int count=0;
		for(int j=0;j<=max.length()-1;j++)
		{
			char ch =max.charAt(j);
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
		
			}
			}
		
		System.out.println(count);
	}

}
