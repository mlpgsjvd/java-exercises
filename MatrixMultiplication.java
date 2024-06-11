package array;
import java.util.Scanner;
public class MatrixMultiplication {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	       int size = 3; // 3x3 matrices
	        int[][] matrix1 = new int[size][size];
	        int[][] matrix2 = new int[size][size];
	        
	        //System.out.println("Enter elements of the first 3x3 matrix:");
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                matrix1[i][j] = scanner.nextInt();
	            }
	        }
	        
	       // System.out.println("Enter elements of the second 3x3 matrix:");
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                matrix2[i][j] = scanner.nextInt();
	            }
	        }
	        
	        int[][] result = new int[size][size];
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                for (int k = 0; k < size; k++) {
	                	int product = matrix1[i][k] * matrix2[k][j];
	                	result[i][j] += product;
	                }
	            }
	        }
	        
	        System.out.println("Resultant matrix:");
	        for (int i = 0; i < size; i++) {
	            for (int j = 0; j < size; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	        scanner.close();
	    }
	}


