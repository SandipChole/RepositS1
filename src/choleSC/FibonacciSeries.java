package choleSC;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		int count,a=0,b=1,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter count of fibonacci numbers you want to print");
		count=sc.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		
	}

}
