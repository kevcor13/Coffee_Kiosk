/**
 * a class that implements our buyable interface
 * stores the Mug being sold 
 * 
 * @author kevincordero
 */
public class Mug implements Buyable {
	/**
	 * a method that will get the cost of the mug
	 * 
	 * @return the cost of the mug as a Money Object 
	 */
	public Money getCost() {
		return new Money(1000);
	}
	/**
	 * a method that overrides the toString method 
	 * that will print out a string describing the mug 
	 * 
	 * @return a string, name of the mug 
	 */
	public String toString() {
		return "Classy Mug" ;
	}
}
