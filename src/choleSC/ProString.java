package choleSC;
public class ProString {

	public static void main(String[] args) {
		String s= new String("Mahendra!! is one, of ; ///My Best Friend..?");
		int count=0,count1=0;
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ') {
			count++;
		}
		if(s.charAt(i)=='!'||s.charAt(i)=='.'||s.charAt(i)=='?'||s.charAt(i)=='-'||s.charAt(i)=='\''||
				s.charAt(i)=='/'||s.charAt(i)==','||s.charAt(i)==';'||s.charAt(i)==':') {
			count1++;
		}
		}
		System.out.println(count +" charactors are present in given String.");
		System.out.println(count1+" punctuation marks are present in the given String literal");
	}

}
