package choleSC;

import java.util.*;

// wajp to decide whether two strings are anagram or not 
public class spce {
	public static void main(String[] args) {
		String s="Rama";
		String t="Kali";
		s=s.toLowerCase();
		t=t.toLowerCase();
		if(s.length()!=t.length()) {
			System.out.println("Both the Strings are not Anagram");
		}
		else {
			char ch[]=s.toCharArray();
			char dh[]=t.toCharArray();
		
		}
	}

}
