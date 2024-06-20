package array;

public class ArrayExample {
	
	    public static void main(String[] args) {
	        
	        int[] numbers = {1, 2, 3, 4, 5};
	        
	        try {
	            
	            int outOfBoundsElement = numbers[10];
	            System.out.println("Element at index 10: " + outOfBoundsElement);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            
	            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
	        }
	        
	        
	        System.out.println("Program continues after the exception handling.");
	    }
	}



