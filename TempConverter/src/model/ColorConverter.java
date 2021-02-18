/**
 * 
 */
package model;

/**
 * @author Jeremy Brannen - jrbrannen
 *CIS175
 * Feb 18, 2021
 */
public class ColorConverter {
	
	private String firstColor;
	private String secondColor;
	private String colorResults;
	
	public ColorConverter() {
		super();
	}

	public ColorConverter(String firstColor, String secondColor) {
		super();
		this.firstColor = firstColor;
		this.secondColor = secondColor;
		setcolorResults(firstColor, secondColor);
	}

	public String getFirstColor() {
		return firstColor;
	}

	public void setFirstColor(String firstColor) {
		this.firstColor = firstColor;
	}

	public String getSecondColor() {
		return secondColor;
	}

	public void setSecondColor(String secondColor) {
		this.secondColor = secondColor;
	}

	public String getColorResults() {
		return colorResults;
	}
	
	/**
	 * @param firstColor2
	 * @param secondColor2
	 */
	public void setcolorResults(String firstColor2, String secondColor2) {
		// TODO Auto-generated method stub
		if (firstColor.toLowerCase().equals("red")) {
			if (secondColor.toLowerCase().equals("red")) {
				colorResults = "red";
			}else if(secondColor.toLowerCase().equals("blue")) {
				colorResults = "purple";
			}else if(secondColor.toLowerCase().equals("yellow")) {
				colorResults = "orange";		
			}		
		}
		if (firstColor.toLowerCase().equals("blue")) {
			if (secondColor.toLowerCase().equals("red")) {
				colorResults = "purple";
			}else if(secondColor.toLowerCase().equals("blue")) {
				colorResults = "blue";
			}else if(secondColor.toLowerCase().equals("yellow")) {
				colorResults = "green";		
			}		
		}
		if (firstColor.toLowerCase().equals("yellow")) {
			if (secondColor.toLowerCase().equals("red")) {
				colorResults = "orange";
			}else if(secondColor.toLowerCase().equals("blue")) {
				colorResults = "green";
			}else if(secondColor.toLowerCase().equals("yellow")) {
				colorResults = "yellow";
			}		
		}
	}

	@Override
	public String toString() {
		return "ColorConverter [firstColor=" + firstColor + ", secondColor=" + secondColor + ", colorResults="
				+ colorResults + "]";
	}
	
	
	
}
