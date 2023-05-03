package choleSC;

import java.util.Scanner;

public class Question2 {
	
	public static void main(String[] args) {
		String a[]= {"ml","ai","technology"};
		String output =specializeString(a);
		System.out.println(output);
	}
	 public static String specializeString(String [] a) {
	        /* a is the input array, write your logic here and return the output. */
		 String s1="";
			for(int i=0;i<a.length;i++) {
				int t=a[i].toCharArray().length;
				Integer k=Integer.valueOf(t);
				s1+=k+a[i]+"=";	
			}
			
			return s1;
	    }

}
