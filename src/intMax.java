
public class intMax {
	/*
	 * Given three int values, a b c, return the largest.

intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
	 */
	public static void main(String[] args) {
		intMax(1, 2, 3);// → 3
		intMax(1, 3, 2);// → 3
		intMax(3, 2, 1);// → 3

	}
	public static  int intMax(int a, int b, int c) {
		  int b1 = 0;
		  int r = 0;
		  b1 = (a > b) ?a :b;
		  r = (b1 > c) ? b1 : c;
		  return r;
		}

}
