package cse360assign2;

public class AddingMachine {

	private int total;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
	}
	
	public void subtract (int value) {
		total -= value;
	}
		
	public String toString () {
		return "Hello Wolrd";
	}

	public void clear() {
	
	}
	
	public static void main(String[] args) {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		System.out.println(myCalculator.toString());
	}
}
