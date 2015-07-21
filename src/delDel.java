
public class delDel {
	/*
	 * Given a string, if the string "del" appears starting at index 1, 
	 * return a string where that "del" has been deleted. Otherwise, return 
	 * the string unchanged.

delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"
	 */
	public static void main(String[] args) {
		delDel("adelbc");// → "abc"
		delDel("adelHello");// → "aHello"
		delDel("adedbc");// → "adedbc

	}

	public static String delDel(String str) {
		  if(str.length() > 3) {
		  if((str.charAt(1) == 'd') && ( str.charAt(2)== 'e') && (str.charAt(3)== 'l')) {
		   String one = str.substring(0,1);
		   String two = str.substring(4,(str.length()));
		   return one+two;
		  }
		  else return str;
		  }
		  else return str;
		}
}
