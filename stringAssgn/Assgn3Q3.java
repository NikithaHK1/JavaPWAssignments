package stringAssgn;

public class Assgn3Q3 {
	public static void main(String[] args) {

		String original = "Think Twice";
		
		String[] arrStr = original.split(" ");
	
		for(String a : arrStr) {
			char ch[] = a.toCharArray();
			for(int i=ch.length-1;i>=0;i--) {
				System.out.print(ch[i]);
			}
			System.out.print(" ");
		}
		
//		String rev = "";
//		for(String a : arrStr) {
//			
//			for(int i=a.length()-1;i>=0;i--) {
//				rev = rev + a.charAt(i);
//			}
//			rev = rev + " ";
//		}
//		System.out.print(rev);
//		

	}
}
