package problemsolving;
import java.util.Scanner;
public class oddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		if(number%2==0)
		{
			System.out.println("Its an even");
		}
		else {
			System.out.println("Its an odd");
		}
		

	}

}
