package choleSC;
import java.util.Scanner;
public class SpyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check for Spy number");
		int num=sc.nextInt();
		int sp=num;
		int sum=0,product=1;
		while(sp>0) {
			int rem=sp%10;
			 sum+=rem;
			 product*=rem;
			 sp/=10;
		}
		if(sum==product) {
			System.out.println(num+" is a Spy number");
		}
		else
			System.out.println(num+" is not a Spy number");
	}
}
