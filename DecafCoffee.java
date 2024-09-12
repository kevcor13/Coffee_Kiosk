/**
 * a decaf class extending Coffee class to work with decaf coffee
 * 
 * @author kevincordero
 */
public class DecafCoffee extends Coffee {
	/**
	 * class that will get the cost of the decaf coffee
	 * 
	 * @return the cost as Money object 
	 */
	public Money getCost() {
		
		Money total = new Money(0);
		if (size == 0) {
			total = total.add(new Money(150));
		}
		else {
			total = total.add(new Money(250));
		}
		
		for(int i = 0; i < addOns.size(); i++) {
			total = total.add(addOns.get(i).getCost());
		}
		
		return total; 
		
	}

	/**
	 * class that will get the calories of the decaf coffee 
	 * 
	 * @return the calories of the decaf coffee
	 */
	public int getCalories() {

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
	 * overrides the toString method to print out whether it is 
	 * Large, Small and if it has addOns 
	 * 
	 * @return a string describing the decaf coffee
	 */
	@Override
	public String toString() {
		
		String coffee = " Decaf Coffee";
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
