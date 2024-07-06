package problemsolving;

import java.util.Scanner;

public class perfectNumber {
		 public static void main(String[] args) {
		        int res = 0;
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the number:");
		        int num = sc.nextInt();
		        
		        // Check for perfect number
		        for (int i = 1; i <= num / 2; i++) {
		            if (num % i == 0) {
		                res += i;
		        
		            }
		        }
		        
		        if (num == res) {
		        	System.out.println("The number " + num + " is a perfect number.");
		        } else {
		        	System.out.println("The number " + num + " is not a perfect number.");
		        }
		        
	}

}
