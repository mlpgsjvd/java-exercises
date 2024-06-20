package array;
import java.util.Scanner;
public class DivisionExample {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            
	            System.out.print("Please enter the numerator: ");
	            int numerator = scanner.nextInt();
	            
	           
	            System.out.print("Please enter the denominator: ");
	            int denominator = scanner.nextInt();
	            
	            
	            int result = numerator / denominator;
	            System.out.println("The result is: " + result);
	        } catch (ArithmeticException e) {
	            // Handle the exception
	            System.out.println("ArithmeticException caught: Division by zero is not allowed.");
	        } finally {
	            scanner.close();
	        }
	        
	        // Continue with the rest of the program
	        System.out.println("Program continues after the exception handling.");
	    }
	}
