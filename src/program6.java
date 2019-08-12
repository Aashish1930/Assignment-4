import java.util.Scanner;

/*6)input={"1","2","3","4"}
    output=10
ie,if string elements are nos,add it.
    input={"a","b"}
    output=-1;*/
public class program6 {
	

		public static void main(String[] args) {

			String input[]={"1","2","3","4","a"};
			int sum=0;
			for(String element:input){
				if(element.matches("[a-z]"))
				{
					System.out.println("-1");
				}
				else{
				int num=Integer.parseInt(element);
				sum+=num;
			}
			}
			System.out.println("Sum of all the elements of the string array is: "+sum);
		
		
		
		}

	}



