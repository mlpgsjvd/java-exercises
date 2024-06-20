package array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputEx {
	
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            
	            System.out.print("Please enter an integer: ");
	            int userInput = scanner.nextInt();
	            System.out.println("You entered: " + userInput);
	        } catch (InputMismatchException e) {
	            
	            System.out.println("InputMismatchException caught: Please enter a valid integer.");
	        } finally {
	            scanner.close();
	        }
	        
	        
	        System.out.println("Program continues after the exception handling.");
	    }
	}
