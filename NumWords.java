// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {

		String num = args[0];
		int numint = Integer.parseInt(num);
		int hundreds = numint/100;
		int tens = (numint/10) % 10;
		int ones = (numint % 10);
		System.out.println("" + hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");
	}
}
