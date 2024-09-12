/**
 * this class extends the beverage class adding a coffee class 
 * it will have methods that will determine the price of the coffee 
 * and the calories as well 
 * 
 * @author kevincordero
 */
public class Coffee extends Beverage {
	/**
	 * this class will calculate the cost of the coffee including 
	 * the addOns like Syrup or milk 
	 * 
	 * @return the total cost of the coffee in Money Object 
	 */
	public Money getCost() {
		
		if (size == 0) {
			Money total = new Money(150);
			
			for(int i = 0; i < addOns.size(); i++) {
				total = total.add(addOns.get(i).getCost());
			}
			
			return total; 
			
		}
		else {
			Money total = new Money(250);
			
			for(int i = 0; i < addOns.size(); i++) {
				total = total.add(addOns.get(i).getCost());
			}
			
			return total; 
			
		}
		
	}
	/**
	 * this method will calculate the number of calories the drink has 
	 * including all the addOns like syrup or milk 
	 * 
	 * @return the number of calories the coffee has 
	 */
	public int getCalories() {
		// get "base" calories 
		// loop through additions, add in the calories of each
		
		int calories = 0; 
		if(size == 0) {
			calories = calories + 5;
		}
		else {
			calories = calories + 15;
		}
		
		for(int i = 0; i < addOns.size(); i++) {
			calories = calories + addOns.get(i).getCalories();
		}
		return calories;
	}
	/**
	 * this class will override the toString method to print out
	 * coffee, its addOns and the number of calories. 
	 * 
	 * @return a string displaying the information of the coffee
	 */
	@Override
	public String toString() {
		
		// "Coffee (s) + OatMilk + SugarSyrup (XX calories)"
		// get "base" String 
		// loop through additions, concatenate on each 
		// call getCalories()
		
		String coffee = "Coffee";
		for(int i = 0; i < addOns.size(); i++) {
			coffee = coffee + " + " + addOns.get(i).toString();
		}
		if(size ==0) {
			coffee = coffee + " (S) - " + getCalories() + " calories";
		}
		else {
			coffee = coffee + "(L) - " + getCalories() + " calories";
		}
		
		return coffee;
	}
	

}
