package problemsolving;
import java.util.Scanner;
public class PoweOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int res=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Enter the exponent value");
		int expo=sc.nextInt();
		while(expo>0)
		{
			res=res*num;
			expo--;
			
		}
		System.out.println(res);
		
	}

}
