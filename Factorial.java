package operator;
import java.util.Scanner;
public class Factorial {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter a number to calculate its factorial: ");
	        int number = scanner.nextInt();

	        
	        long iterativeResult = factorialIterative(number);
	        System.out.println("Factorial (Iterative) of " + number + " is: " + iterativeResult);

	        
	        long recursiveResult = factorialRecursive(number);
	        System.out.println("Factorial (Recursive) of " + number + " is: " + recursiveResult);

	        scanner.close();
	    }

	    
	    public static long factorialIterative(int n) {
	        long result = 1;
	        for (int i = 1; i <= n; i++) {
	            result *= i;
	        }
	        return result;
	    }

	    
	    public static long factorialRecursive(int n) {
	        if (n == 0) {
	            return 1;
	        }
	        return n * factorialRecursive(n - 1);
	    }
	}



