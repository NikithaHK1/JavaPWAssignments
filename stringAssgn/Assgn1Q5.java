package stringAssgn;

public class Assgn1Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello world";
		String x = "world";

	//	System.out.println(s.indexOf(" "));
		
		for(int i=0;i<x.length();i++) {     
			for(int j=0;j<s.length();j++) {   
			if(s.charAt(j)==x.charAt(i)) {  
				System.out.print(j);
				break;
			}
			else
				continue;
		}
			break;
		}
	}

}
