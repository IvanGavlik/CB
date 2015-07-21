
public class lastDigit {
	/*
	 * Given two non-negative int values, return true if they have the same 
	 * last digit, such as with 27 and 57. Note that the % "mod" operator 
	 * computes remainders, so 17 % 10 is 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
	 */
	public static void main(String[] args) {
		lastDigit(7, 17); // → true
		lastDigit(6, 17); // → false
		lastDigit(3, 113); // → true

	}
	
	public static boolean lastDigit(int a, int b) {
		 String s1  = Integer.toString(a);
		 char c1 = s1.charAt(s1.length()-1);
		 
		 String s2  = Integer.toString(b);
		 char c2 = s2.charAt(s2.length()-1);
		 
		 return(c2==c1) ? true:false;
		}

}
