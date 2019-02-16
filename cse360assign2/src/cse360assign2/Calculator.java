package cse360assign2;

/**
 * @author 	Ryan Matusik
 * ClassID:	481
 * ASUID: 	1210751136
 * Course: 	CSE 360 
 * Date: 	15 February 2019
 * 
 * Description:  The Calculator class describes an object
 * with the functionality of a basic calculator. The Calculator
 * provides integer arithmetic functions and maintains a running
 * total and a log of all actions performed by the user.
 */
public class Calculator {

	private int total;
	
	/**
	 * Sole class constructor. Creates a calculator object.
	 */
	public Calculator () {
		total = 0;  
	}
	
	/**
	 * Provides the user with access to this Calculator's
	 * running total.
	 * 
	 * @return	the integer total of this Calculator 
	 */
	public int getTotal () {
		return 0;
	}
	
	/**
	 * Adds the parameter to this Calculator's total.
	 * 
	 * @param value 	the integer to be added.
	 */
	public void add (int value) {
		
	}
	
	/**
	 * Subtracts the parameter from the Calculator's total
	 * 
	 * @param value		the integer to be subtracted
	 */
	public void subtract (int value) {
		
	}
	
	/**
	 * Multiplies the total by the parameter
	 * 
	 * @param value		the integer multiplier
	 */
	public void multiply (int value) {
		
	}
	
	/**
	 * Divides the total by the parameter using integer
	 * division.  If the parameter is zero, the total 
	 * becomes zero.
	 * 
	 * @param value		the integer divisor
	 */
	public void divide (int value) {
		
	}
	
	/**
	 * Provides user with a log of operations this
	 * Calculator has performed
	 * 
	 * @return	a string containing the history of all
	 * 			calculator actions
	 */
	public String getHistory () {
		return "";
	}
}
