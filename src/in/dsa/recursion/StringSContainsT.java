package in.dsa.recursion;


public class StringSContainsT {

	
	public static String checkSequence(String a, String b, String res) {
		
		if(a.length() == 0 || b.length() == 0) return res;
		
		if(a.charAt(0) == b.charAt(0)) {
			res = res + a.charAt(0);
			return checkSequence(a.substring(1), b.substring(1), res);
		}
		else {
			return checkSequence(a.substring(1), b, res);			
		}
		
	}
	
	
	public static boolean checkSequence(String a, String b) {

		String output = checkSequence(a, b, "");
		if(output.equals(b)) return true;
		return false;
		
	}


	public static void main(String[] args) {
		
	}

}
