package problemsolving;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem;
		int arm=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int num1=num;
		while(num>0) {
			rem=num%10;
			arm=arm+(rem*rem*rem);
			num=num/10;
		}
		if(arm==num1)
		{
			System.out.println("Its is an armstrong number");
			}
		else if(arm!=num)
			System.out.println("Its not an armstrong number");
	}

}
