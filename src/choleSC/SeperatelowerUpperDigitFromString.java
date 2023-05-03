package choleSC;

public class SeperatelowerUpperDigitFromString {

	public static void main(String[] args) {
		String str="RameSHware1395";
		String a="",b="",digit="",upLower="";
	
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(Character.isUpperCase(c)) {
			//	System.out.println(c+" UpperCase");
				a+=c;
				upLower+=Character.toLowerCase(c);
			}
			else if(Character.isLowerCase(c)) {
				//System.out.print(c+" LowerCase");
				b+=c;
				upLower+=Character.toUpperCase(c);
			}
			else if(Character.isDigit(c)) {
				//System.out.println(c+" Digit");
				digit+=c;
			}
		}
		System.out.println(a+" are uppercase char");
		System.out.println(b+" are lowercare char");
		System.out.println(digit+" are digits");
		System.out.println(upLower);
	}

}
