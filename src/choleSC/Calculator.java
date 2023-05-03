package choleSC;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int n1, n2, ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		n1=sc.nextInt();
		System.out.println("enter second number");
		n2=sc.nextInt();
		System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Remainder");
		System.out.println("Enter the number of operation you want to perform");
		ch=sc.nextInt();
		if(ch==1) {
			System.out.println("Addition of two number = "+(n1+n2));
		}
		else if(ch==2) {
			System.out.println("Subtraction of two number = "+(n1-n2));
		}
		else if(ch==3) {
			System.out.println("Multiplication of two number = "+(n1*n2));
		}
		else if(ch==4) {
			System.out.println("Division of two number = "+(n1/n2));
		}
		else {
			System.out.println("Remainder of two number is = "+(n1%n2));
		}
	}

}
