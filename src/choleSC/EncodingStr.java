package choleSC;

public class EncodingStr {

	public static void main(String[] args) {
		String str="SIMPLY";
		String enc="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='y'||ch=='Y'||ch=='z'||ch=='Z') {
				ch-=26;
			}
			int a=(int)ch+2;
			enc+=(char)a;
		}
		System.out.println(str);
		System.out.println(enc);
	}

}
