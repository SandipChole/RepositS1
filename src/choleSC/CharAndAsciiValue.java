package choleSC;

public class CharAndAsciiValue {

	public static void main(String[] args) {
		
		String str="Sandipchole1394@gmail.com",str1="ma'am";
		String a="",b="",p="",q="";
		char []hi=str.toCharArray();
		for(int i =0;i<str.length();i++) {
			char ch=str.charAt(i);
			System.out.println(ch+" "+(int)ch);
		}
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				a+=ch;
			}else {
				b+=ch;
			}
		}
		System.out.println(a+b);
		/*for(int i=0;i<str.length();i++) {
			char k=hi[i];
			for(int j=i+1;j<hi.length;j++)
			{
				char temp=k;
				if(hi[i]>hi[j]) {
					hi[i]=hi[j];
					hi[j]=k;
				}
			}
			System.out.print();
		}*/
		
		for(int i=str.length()-1;i>=0;i--) {
			p+=str.charAt(i);
			q+=hi[i];
		}
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
		System.out.println(p);
		System.out.println(q);
		if(str.equalsIgnoreCase(p)) {
			System.out.println("It is a Palindrome String");
		}else {
			System.out.println("It is not a palindrome String");
		}
	}
}
