/**
 * 
 */
package model;

import java.text.DecimalFormat;

/**
 * @author Jeremy Brannen - jrbrannen CIS175 Feb 18, 2021
 */
public class ToFahrenheitConversion {

	private double degreesCel;
	private double degreesFah;

	public ToFahrenheitConversion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ToFahrenheitConversion(double degreesCel) {
		super();
		this.degreesCel = degreesCel;
		setDegreesFah(degreesCel);
	}

	public double getDegreesCel() {
		return degreesCel;
	}

	public void setDegreesCel(double degreesCel) {
		this.degreesCel = degreesCel;
	}

	public double getDegreesFah() {
		return degreesFah;
	}

	/**
	 * @param degreesCel2
	 */
	public void setDegreesFah(double degreesCel) {
		// temp is for storing the calculation until the formating is done
		// the constants are for correct conversion calculations
		double temp;
		final double MULTIPLIER = 1.8;
		final int DEGREE_ADD = 32;
		
		temp = degreesCel * MULTIPLIER + DEGREE_ADD;
		
		DecimalFormat format = new DecimalFormat("#0.0");
		
		degreesFah = Double.parseDouble(format.format(temp));

	}

	@Override
	public String toString() {
		return "ToFahrenheitConversion [degreesCel=" + degreesCel + ", degreesFah=" + degreesFah + "]";
	}
	
	

}
