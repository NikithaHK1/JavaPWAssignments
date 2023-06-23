package stringAssgn;

public class Assgn4Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello,have a good day";
		
		char a[]= s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			if(a[i]=='a' || a[i]=='i' || a[i]=='e' || a[i]=='o' || a[i]=='u' ||
					a[i]=='A' || a[i]=='I' || a[i]=='E' || a[i]=='O' || a[i]=='U') {
				System.out.println(a[i]);
			}
			else {
				continue;
			}
		}
//		int j=0;
//		char ch[] = new char[20]; 
//		for(int i=0;i<s.length();i++) {
//		if(s.charAt(i)=='a' || s.charAt(i)=='i' || s.charAt(i)=='e' || s.charAt(i)=='o' || s.charAt(i)=='u' ||
//				s.charAt(i)=='A' || s.charAt(i)=='I' || s.charAt(i)=='E' || s.charAt(i)=='O' || s.charAt(i)=='U'){
//				ch[j++] = s.charAt(i);	
//			}
//		else
//			continue;
//		}
//		
//		for(int i=0;i<j;i++) {
//			System.out.println(ch[i]);
//		}
//		
		
	//	System.out.println();
	}

}
