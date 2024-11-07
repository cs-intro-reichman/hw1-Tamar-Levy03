// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		String currentValue = args[0];
		String rate = args[1];
		String n = args[2];
		double ratedouble = (Double.parseDouble(rate));
		double ndouble = Double.parseDouble(n);
		double futureValue = Double.parseDouble(currentValue)*(Math.pow((ratedouble/100) + 1, ndouble)); 
		System.out.println("after " + n + " years, a $"  + currentValue + " saved at " + ratedouble + "% will yield $" + ((int) futureValue));
		
		
	}
}