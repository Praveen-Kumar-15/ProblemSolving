 package problemsolving;
import java.util.*;
public class lastDigitInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num%10;
		System.out.println(temp);
	}

}
