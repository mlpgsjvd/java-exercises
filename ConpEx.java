package operator;
import java.util.*;
public class ConpEx {
	        ConpEx(String PAN)
	        {
	        	System.out.println(PAN);
	        }
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your PAN number:");
			String pan=sc.next();
			ConpEx on= new ConpEx(pan);
		}

	}

