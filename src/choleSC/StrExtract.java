package choleSC;
import java.util.Scanner;
public class StrExtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		//char ch[] = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			int count=1;
			char c= str.charAt(i);
			for(int j=i+1;j<str.length();j++) {
				char d=str.charAt(j);
				if(c==d) {
					System.out.println(c+" ");
					++count;
				}
			}
			//System.out.println(count+" times char "+c+" is repeated.");
		
		}
	}

}
