package acown09_assign1;

/**
 * Created by: Admir Cosic, 2017-08-26
 * Last changed by: Admir Cosic, 2017-09-10
 *
 * Exercise 11: Fraction
 */

public class Fraction {

	private int numerator;
	private int denominator;

	public Fraction(int fractionNumerator, int fractionDenominator) {
		numerator = fractionNumerator;
		denominator = fractionDenominator;

		if(denominator == 0) {
			throw new IllegalArgumentException("Error: Fractional number has a zero denominator!");
		}
	}

	public boolean isNegative() {	
		return (double)getNumerator()/getDenominator() < 0;
	}

	public boolean isEqualTo(Fraction fraction) {
		return (double)getNumerator()/getDenominator() == (double)(fraction.getNumerator()/(double)fraction.getDenominator());
	}

	public Fraction add(Fraction fraction) {
		if(getDenominator() != fraction.getDenominator()) {
			int newNumerator = getNumerator()*fraction.getDenominator() + fraction.getNumerator()*getDenominator();
			int newDenominator = getDenominator() * fraction.getDenominator();
			return new Fraction(newNumerator, newDenominator);
		}
		int newNumerator = getNumerator() + fraction.getNumerator();
		return new Fraction (newNumerator, getDenominator());
	}

	public Fraction subtract(Fraction fraction) {
		if(getDenominator() != fraction.getDenominator()) {
			int newNumerator = getNumerator()*fraction.getDenominator() - fraction.getNumerator()*getDenominator();
			int newDenominator = getDenominator() * fraction.getDenominator();
			return new Fraction(newNumerator, newDenominator);
		}
		int newNumerator = getNumerator() - fraction.getNumerator();
		return new Fraction (newNumerator, getDenominator());
	}

	public Fraction multiply(Fraction fraction) {
		int newNumerator = getNumerator() * fraction.getNumerator();
		int newDenominator = getDenominator() * fraction.getDenominator();

		return new Fraction(newNumerator, newDenominator);
	}

	public Fraction divide(Fraction fraction) {
		int newNumerator = getNumerator() * fraction.getDenominator();
		int newDenominator = getDenominator() * fraction.getNumerator();

		return new Fraction(newNumerator, newDenominator);
	}

	public String toString() {
		return getNumerator() + "/" + getDenominator();
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}
	public Fraction simplify() {
		int gcd = findGcd(this);
		int newNumerator = getNumerator();
		int newDenominator = getDenominator();

		newNumerator /= gcd;
		newDenominator /= gcd;
		return new Fraction(newNumerator, newDenominator);
	}

	public int findGcd(Fraction fraction) {
		int num1 = fraction.getNumerator();
		int num2 = fraction.getDenominator();

		while (num1 != num2) {
			if (num1 > num2) {
				num1 -= num2;
			} else {
				num2 -= num1;
			}
		}
		return num1;
	}
}