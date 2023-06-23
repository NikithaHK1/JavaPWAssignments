package stringAssgn;

import java.util.Scanner;

public class Assgn1Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String : ");
		String s= sc.nextLine();

		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			char ch = s.charAt(i);
			reverse = reverse + ch ;
		}
		
		System.out.println(reverse);
	
//		System.out.println();
//		
//		char c[] = s.toCharArray();
//		for(int i=c.length-1;i>=0;i--) {
//			System.out.print(c[i]) ;
//		}

	}

}
