
public class close10 {
	/*
	 * Given 2 int values, return whichever value is nearest to the value 10,
	 *  or return 0 in the event of a tie. Note that Math.abs(n) returns the
	 *   absolute value of a number.

close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
	 */
	public static void main(String[] args) {
		close10(8, 13);// → 8
		close10(13, 8);// → 8
		close10(13, 7);// → 0

	}
	
	public static  int close10(int a, int b) {
		  int n1 = 0;
		  int n2 = 0;
		  
		  if(a > 10) {
		   n1 = a - 10;
		  }
		  else n1 = 10-a;
		  
		  if(b > 10) {
		   n2 = b - 10;
		  }
		  else n2 = 10-b;
		  
		  if(n1 > n2) return b;
		  else if (n2 > n1) return a;
		  else return 0;
		}

}
