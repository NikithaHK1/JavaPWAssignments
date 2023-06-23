package stringAssgn;

import java.util.Arrays;

public class Assgn3Q4 {
	public static void main(String[] args) {
		
		String s = "1PWSKIL@LSJAVA6()*$#~";
		char ch[] = s.toCharArray();
		
		Arrays.sort(ch);
		System.out.println(new String(ch));
		System.out.println(ch);
		
		char temp;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]>ch[j]) {
					temp  = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		
		System.out.println(new String(ch));
		
		   }
}
