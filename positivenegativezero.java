
package methodsJava;

/*
Write a method called checkNumber with an int parameter number.
The method should not return any value, and it needs to print out:
"positive" if the parameter number is > 0
"negative" if the parameter number is < 0
"zero" if the parameter number is equal to 0.

NOTE: The checkNumber method needs to be defined as public static
 like we have been doing so far in the course.
NOTE: Do not add a main method to your solution code!
*/
// i will be adding the main method so everyone can understand.
import java.util.*;

public class positivenegativezero {
	public static void checkNumber(int number) {
		if (number>0) {
			System.out.println("positive");
			
		}
		else if (number<0) {
			System.out.println("negative");
			
		}else {
			System.out.println("zero");
		}
		
			
		
		
	}
	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		checkNumber(number);
		scanner.close();
		
	}

}
