package stringAssgn;

import java.util.Scanner;

public class Assgn1Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input String : ");
		String s = sc.nextLine();
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		
		if(s.equalsIgnoreCase(rev))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome ");
	}

}
