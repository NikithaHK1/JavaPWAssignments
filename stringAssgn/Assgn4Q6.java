package stringAssgn;

public class Assgn4Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Umbrella";
		
		char[] ch = s.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]== 'e' || ch[i]=='E') {
				System.out.println("e or E is present in String");
	  			break;
			}
			else 
				if(i==ch.length-1)
				System.out.println("e or E is NOT present in String");
		}
		
	}

}
