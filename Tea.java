/**
 * a class that extends the beverage class that will be taking care of tea 
 * 
 * @author kevincordero
 */
public class Tea extends Beverage{
	
	/**
	 * this method will get the cost of the tea and all its addOns
	 * 
	 */
	public Money getCost() {
		Money total = new Money(150);
		
		for(int i = 0; i < addOns.size(); i++) {
			total = total.add(addOns.get(i).getCost());
		}
		return total;
	}
	/**
	 * this method will get the amount of calories
	 * tea and its addOns contain
	 */
	public int getCalories() {
		int calories = 5;
		
		for (int i = 0; i < addOns.size(); i++) {
			calories = calories + addOns.get(i).getCalories();
		}
		return calories;
	}
	/**
	 * overrides the toString method to print out 
	 * the tea as a string 
	 */
	public String toString() {
		String tea = "Tea ";
		for(int i = 0; i < addOns.size(); i++) {
			tea = tea + " + " + addOns.get(i).toString();
		}
		if(size == 0) {
			tea = tea + " (S) - " + getCalories() + " Calories";
		}
		else {
			tea = tea + " (L) - " + getCalories() + " Calories";
		}
		return tea;
	}

}
