package problemsolving;
import java.util.*;
public class divisorOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
			
				System.out.println(i);
			}
		}
	}

}
