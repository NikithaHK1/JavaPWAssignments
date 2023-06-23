package stringAssgn;

public class Assgn1Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "PWSkills Java";
		char ch = 'a';
		String rev = "";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)== ch)
				continue;
			else
				rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
		
//		String str = "this is Java";
//		int pos=3;
//		System.out.println(str.substring(0, pos) + str.substring(pos + 5));
		
	}

}
