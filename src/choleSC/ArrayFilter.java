package choleSC;

public class ArrayFilter {

	public static void main(String[] args) {
		int a[] = {1,3,5};
		int T=4;
		String s=findSpecialPair(a,T);
		System.out.println(s);
	}
	
	public static String findSpecialPair(int []a,int T) {
		 /*Given array a of integers and an integer T
        returns yes or no */
		int t=T;
		String b ="";
		int i=0,j;
		int count=0;
		for( i=0;i<a.length;i++) {
			int l=a[i];
			for( j=i+1;j<a.length;j++) {
			if(a[j]-l==t) {
				b="Yes";
				count++;
				
				break;
				}
			}
		}
		if(count==0) {
			b="no";
			
		}
		
		return b;
	
	}
}

	
