package problemsolving;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem=0;
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int num1=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		System.out.println(rev);
		if(num1==rev)
		{
			System.out.println("The number is a palindrome   :"+num1+"=="+rev);
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
		
	}

}
