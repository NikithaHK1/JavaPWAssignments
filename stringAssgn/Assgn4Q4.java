package stringAssgn;

public class Assgn4Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Compare 2 String in Java
		// Strings can be compared using equals() equalsIngnoreCase() operator
		// == will compare the reference values and not actual values in a String variable
		
		String a = "PWSKILLS";
		String b = "PWSKILLS";
		String c = "PWSkills";
		String d = "PW Skills";
		String e = "   PW Skills  ";
		StringBuffer f = new StringBuffer("PWSKILLS");
		StringBuffer g = new StringBuffer("PWSKILLS");
		
		System.out.println(a.equals(b)); // In case of string equals() compares value
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(d.equals(b));
		System.out.println(d.trim().equals(e));
		System.out.println(e.trim().equals(d));
		
		System.out.println(a==b);
		System.out.println(d==e);
		
		System.out.println(f==g);
		System.out.println(f.equals(g)); // In case of string buffer equals() compares reference and not value
		
		System.out.println(f.equals(b));
		
	}

}
