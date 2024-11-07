// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		String lim = args[0];
		int limint = Integer.parseInt(lim);
		double a = Math.random()*limint;
		double b = Math.random()*limint;
		double c = Math.random()*limint;
		int inta= (int) a;
		int intb = (int) b;
		int intc = (int) c;
		System.out.println(inta + " " + intb + " " + intc);
		int min = Math.min(inta, intb); 
		int min2 = Math.min(min, intc);
		int max = Math.max(inta, intb);
		int max2 = Math.max(max,intc);
		int mid = Math.min(max, Math.max(intb, intc));
		int mid2 = Math.min(mid, Math.max(inta, intc));
		System.out.println(min2 + " " + mid2+ " " + max2);


	}
}
