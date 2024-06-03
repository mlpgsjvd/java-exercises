package operator;
import java.util.Scanner;
public class PrimeNumber {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user for the number
	        System.out.print("Enter a number to check if it is prime: ");
	        int number = scanner.nextInt();

	        // Check if the number is prime
	        boolean isPrime = checkPrime(number);

	        // Display the result
	        if (isPrime) {
	            System.out.println("The number " + number + " is a prime number.");
	        } else {
	            System.out.println("The number " + number + " is not a prime number.");
	        }

	        scanner.close();
	    }

	    // Method to check if a number is prime
	    public static boolean checkPrime(int num) {
	        // Prime numbers are greater than 1
	        if (num <= 1) {
	            return false;
	        }
	        // Check for factors from 2 to the square root of num
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false; // Found a factor, not a prime number
	            }
	        }
	        return true; // No factors found, prime number
	    }
	}

