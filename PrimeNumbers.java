package problemsolving;
import java.util.*;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auo-generated method stub
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=1;i<num;i++)
		{
			if(num%2==0)
			{
				flag++;
			}
		}
		if(flag==0)
		{
			System.out.println("Its  a prime number");
		}
		else if(flag>0)
		System.out.println("The number is not a prime number"+num);

	}

}
