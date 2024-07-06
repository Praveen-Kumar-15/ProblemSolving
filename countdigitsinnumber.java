package problemsolving;
import java.util.Scanner;
public class countdigitsinnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0, mo=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}