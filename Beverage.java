import java.util.ArrayList;

public abstract class Beverage implements Buyable{
	/**
	 * instance variable that will set SMALL to zero 
	 */
	public static int SMALL = 0;
	/**
	 * instance variable that will set LARGE to two 
	 */
	public static int LARGE = 2;
	/**
	 * protected instance variable that will hold all of the addOns 
	 * as an Array list which we will be able to go into and out.
	 */
	protected ArrayList<Addition> addOns;
	/**
	 * protected variable that sets the size of the ArrayList
	 */
	protected int size;
	
	
	/**
	 * constructor that sets the Arraylist
	 */
	public Beverage() {
		addOns = new ArrayList<Addition>();
	}
	/**
	 * abstract method that will get the cost of the beverage 
	 * 
	 * @return the price of the beverage 
	 */
	public abstract Money getCost();
	/**
	 * abstract method that will get the calories of beverage 
	 * 
	 * @return the amount of calories in beverage 
	 */
	public abstract int getCalories();
	
	/**
	 * will set the size of the of the beverage using 0 or 2 
	 * 
	 * @param the size of the beverage 
	 */
	public void setSize(int size) {
		this.size = size;
	}
	/**
	 * this method will be used to add special things to the drink 
	 * add ons such as syrup or oat milk 
	 * 
	 * @param addOns (syrup or milk) 
	 */
	public void addToDrink(Addition addOn) {
		addOns.add(addOn);
	}


}
