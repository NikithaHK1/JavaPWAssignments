package stringAssgn;

public class Assgn1Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s1 = "PWskills";
//		
//		System.out.println(s1.toUpperCase());
//		System.out.println(s1.toLowerCase());
		
		String s1 = "PWskillS";
		String s2 = "";
		
		for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)>='a' && s1.charAt(i)<='z') {
			s2 = s2 + (char)(s1.charAt(i)-32);
		}
		else if(s1.charAt(i)>='A' && s1.charAt(i)<='Z') {
			s2 = s2 + (char)(s1.charAt(i)+32);
		}
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}
