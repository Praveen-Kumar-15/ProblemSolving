package problemsolving;

import java.util.Scanner;

public class minArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int a=0;
		a=sc.nextInt();
		int ar[]=new int[a];
		System.out.println("Enter the values in the array:");
		for(int i=0;i<a;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(int s=0;s<a;s++)
		{
			for(int j=s+1;j<a;j++)
		{
			if(ar[s]<ar[j]){
				System.out.println("The Minimum numbe r in the array is:"+ar[s]);
				break;
			}
		}
		}
	}

}
