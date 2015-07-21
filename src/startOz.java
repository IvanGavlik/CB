
public class startOz {
		/*
		 * Given a string, return a string made of the first 2 chars
		 *  (if present), however include first char only if it is 'o' 
		 *  and include the second only if it is 'z', so "ozymandias" yields
		 *   "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
		 */
	public static void main(String[] args) {
		startOz("ozymandias");// → "oz"
		startOz("bzoo");// → "z"
		startOz("oxx");// → "o"
	}

	public static  String startOz(String str) {
		  String r = "";
		  if(str.length()>=2) {
		   String s = str.substring(0,2);
		     if(s.charAt(0) == 'o' ) {
		        r = "o";
		      }
		      if(s.charAt(1)=='z') {
		        r = r+"z";
		      }
		  } 
		  if(str.length()== 1) {
		     if(str.charAt(0) == 'o' ) {
		        r = "o";
		      }
		  }
		  return r;
		}
}
