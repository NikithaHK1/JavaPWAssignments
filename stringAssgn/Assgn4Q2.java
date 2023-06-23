package stringAssgn;

public class Assgn4Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//We can concat String using + and concat() method for Immutable String
		//We can concat String using + and append() method for Immutable String
		
		// String class / Immutable Class
		String a ="PW";
		String b ="Skills";
		a = a.concat(b); 
		System.out.println(a);
		
		System.out.println(a + b + 100);
		
		// StringBuffer or StringBuilder class / Mutable Class
		StringBuffer a1 = new StringBuffer("PW");
		StringBuilder a2 = new StringBuilder("SKILLS");
		a1.append(a2); 
		System.out.println(a1);
		
		System.out.println(a1 + " buffer " + 200);
		
		//StringBuilder class / Mutable Class
		StringBuilder b1 = new StringBuilder("PW");
		System.out.println(b1.append("Skills"));
		
		System.out.println(b1 + " builder " + 300 );
		
		//The operator + is undefined for the argument type(s) StringBuffer, StringBuilder
		//The operator + is undefined for the argument type(s) java.lang.StringBuilder, java.lang.StringBuilder
		//System.out.println(a1 + a2);
	}

}
