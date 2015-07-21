
public class mixStart {
	/*
	 * Return true if the given string begins with "mix", except the 'm' 
	 * can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
	 */
	public static void main(String[] args) {
		mixStart("mix snacks");// → true
		mixStart("pix snacks");// → true
		mixStart("piz snacks");// → false

	}
	
	public static  boolean mixStart(String str) {
		if(str.length() > 1) {
		  String s = str.substring(1,str.length());
		  if(s.startsWith("ix")) 
		   return true;
		   else 
		   return false;
		   } else  return false;
		}

}
