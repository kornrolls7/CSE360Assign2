/**
 * Adding Machine is a class which allows you to create a custom
 * calculator - type program. 
 * @author      Noah Korner
 * @version     %I%, %G%
 * @since       1.1
 */
package cse360assign2;

public class AddingMachine {

	private int total;
	private String history;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	/**
	 * This default constructor method initializes an <code>AddingMachine</code> object.
	 * <p>
	 * This method constructs an <code>AddingMachine</code> and initializes its' member
	 * variables as 'dummy' values.
	 */

	public int getTotal () {
		return total;
	}
	/**
	 * Returns the total for this instance of <code>AddingMachine</code>
	 * <p>
	 * @return      the current <code>total</code> value
	 */
	public void add (int value) {
		total += value;
		history += " + ";
		history += Integer.toString(value);
	}
	/**
	 * <p>
	 * This method adds the parameter <code>value</code> to this instance
	 * of <code>AddingMachine</code>'s <code>total<code> variable. This method
	 * also adds itself as a string to the current history of operations, stored in
	 * the private <code>history</code> variable;
	 *
	 * @param  value  any integer value 
	 */
	public void subtract (int value) {
		total -= value;
		history += " - ";
		history += Integer.toString(value);
	}
	/**
	 * <p>
	 * This method subtracts the parameter <code>value</code> from this instance
	 * of <code>AddingMachine</code>'s <code>total<code> variable. This method
	 * also adds itself as a string to the current history of operations, stored in
	 * the private <code>history</code> variable;
	 *
	 * @param  value  any integer value 
	 */
	public String toString () {
		return history;
	}
	 /**
	  * This method returns this instance of <code>AddingMachine</code>'s current
	 * history of transactions 
	  * <p>
	  * This method always returns this instances' currently recorded history of transactions
	  */
	public void clear() {
		history = "";
	}
	/**
	 * Calling this method will clear all currently recorded operations from the 
	 * <code>Adding Machine</code> class
	 * <p>
	 * This method clears the history of operations of <code>AddingMachine</code>
	 * by setting this instances' <code>history</code> String variable to the empty string "".
	 */
	public static void main(String[] args) {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		System.out.println(myCalculator.toString());
	}
}

