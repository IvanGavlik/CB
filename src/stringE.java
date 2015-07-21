
public class stringE {
	/*
	 * Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
	 */
	public static void main(String[] args) {
		stringE("Hello"); // → true
		stringE("Heelle"); // → true
		stringE("Heelele"); // → false

	}
	
	public static boolean stringE(String str) {
		   int con = 0;
		   
		   for(int i = 0; i < str.length();i++) {
		     if(str.charAt(i)=='e') con ++;
		   }
		   
		   return (con >=1 && con <=3)? true:false ;
		}
}
