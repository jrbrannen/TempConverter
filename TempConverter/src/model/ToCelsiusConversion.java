/**
 * 
 */
package model;

import java.text.DecimalFormat;

/**
 * @author Jeremy Brannen - jrbrannen
 *CIS175
 * Feb 18, 2021
 */
public class ToCelsiusConversion {
	
	private double degreesCel;
	private double degreesFah;

	public ToCelsiusConversion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ToCelsiusConversion(double degreesFah) {
		super();
		this.degreesFah = degreesFah;
		setDegreesCel(degreesFah);
		
		
	}

	public double getDegreesFah() {
		return degreesFah;
	}

	public void setDegreesFah(double degreesFah) {
		this.degreesFah = degreesFah;
	}

	public double getDegreesCel() {
		return degreesCel;
	}
	/**
	 * @param 
	 */
	public void setDegreesCel(double degreesFah) {
		// temp is for storing the calculation until the formating is done
		// the constants are for correct conversion calculations
		double temp;
		final double NUMERATOR = 5;
		final double DENOMINTOR = 9;
		final int DEGREE_SUB = 32;
		
		
		temp = (degreesFah - DEGREE_SUB) * (NUMERATOR / DENOMINTOR);
		
		DecimalFormat format = new DecimalFormat("#0.0");
	
		degreesCel = Double.parseDouble(format.format(temp));
	}

	@Override
	public String toString() {
		return "ToCelsiusConversion [degreesCel=" + degreesCel + ", degreesFah=" + degreesFah + "]";
	}

	
}
