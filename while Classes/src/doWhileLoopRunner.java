import java.util.Scanner;

public class doWhileLoopRunner {

	public static void main(String[] args) {

		int i = 0;
		int number = -1;
		do {
			if (number >= 0) {
				System.out.println("Cube value is: " + number * number * number);
			}
			
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Number: ");
			number = scanner.nextInt();
			i++;
     		} while (number > 0);
	    	System.out.println("Thank You!Have Fun");
	        }

}
