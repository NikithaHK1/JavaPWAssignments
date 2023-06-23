package stringAssgn;

public class Assgn4Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "refrigerator";
				
			System.out.println(a.length());
		
		int count=0;
		char ch[] = a.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			count++;
		}
		System.out.println("Length of String : " + count);
		
		int i = 0;
	      for(char c: a.toCharArray()) {
	         i++;
	      }
	      System.out.println("Length of the given string ::"+i);
		
	}

}
