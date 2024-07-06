package problemsolving;
import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0, rev=0,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		while(num!=0) {
			r=num%10;//(1)if 123 then 123%10=3
			rev=rev*10+r;// 0*10+3=3
			num=num/10;//123/10=12
		}
		System.out.println(rev);
	}


	}


