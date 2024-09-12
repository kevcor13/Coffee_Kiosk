/**
 * an OatMilk class that extends our abstract addition class
 * will store one of our addOns which is oatMilk 
 * 
 * @author kevincordero
 */
public class OatMilk extends Addition{
	/**
	 * this method will get the cost of adding oatMilk
	 * @return the cost of Oat Milk
	 */
	public Money getCost() {
		return new Money(100);
	}
	/**
	 * a method that gets the calories of Oat Milk
	 * @return the number of calories
	 */
	public int getCalories() {
		return 30;
	}
	/**
	 * method overrides toString 
	 * @return a string of "Oat Milk"
	 */
	@Override
	public String toString() {
		return "Oat Milk";
	}
}
