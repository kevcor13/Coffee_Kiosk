/**
 * this class is an extension of Addition. it is one of the 
 * addOns we can add to our beverage. it will be creating an object for 
 * sugar syrup
 * 
 * @author kevincordero
 */
public class SugarSyrup extends Addition  {
	/**
	 * this method will give us the cost of the sugar syrup 
	 * in money object 
	 * 
	 * @return the amount it cost is sugar Syrup 
	 */
	
	public Money getCost() {
		
		return new Money(50);
	}
	/**
	 * this method will give us the number of calories 
	 * there are in the addition of sugar Syrup
	 * 
	 * @return the number of calories in each shot of sugar Syrup 
	 */
	public int getCalories() {
		
		return 60;
	}
	/**
	 * this method overrides toString, and return "Sugar Syrup" 
	 * 
	 * @return will return a string 
	 */
	public String toString() {
		return "Sugar Syrup";
	}
}
