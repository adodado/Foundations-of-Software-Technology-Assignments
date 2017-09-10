package acown09_assign1;

public class FractionMain {

	public static void main(String[] args) {
		Fraction fraction1 = new Fraction(2, 5);
		Fraction fraction2 = new Fraction(3, 4);

		String[] resultPrintout = { "Test: get numerator and denominator of fraction","\n","Numerator: " + fraction1.getNumerator()
		, "\n", "Denominator: " + fraction1.getDenominator(), "\n", "Test: is fractional number negative","\n","True/False: " + fraction1.isNegative()
		,"\n","Test: add 2 fractions","\n",fraction1 + " + " + fraction2 + " = "+fraction1.add(fraction2).simplify(),"\n","Test: subrtact 2 fractions","\n",
		fraction1 + " - " + fraction2 + " = " + fraction1.subtract(fraction2),"\n","Test: multiply 2 fractions","\n",fraction1 + " * " + fraction2 + " = " + fraction1.multiply(fraction2).simplify(),"\n",
		"Test: divide 2 fractions","\n",fraction1 + " / " + fraction2 + " = " + fraction1.divide(fraction2).simplify(),"\n", "Test: are 2 fractions equal","\n",
		"Fraction1: " + fraction1 + "Fraction2: " + fraction2 + " = " + "True/False: " + fraction1.isEqualTo(fraction2)};
		printStringArray(resultPrintout);
	}

	private static void printStringArray(String[] stringArray) {
		for (int i = 0; i < stringArray.length; i++) {
			System.out.print(stringArray[i]);
		}
	}
}