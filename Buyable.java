/**
 * an interface class that will hold the buyable options such as the mug, tea, or coffee 
 * 
 * @author kevincordero
 */
public abstract interface Buyable {
	/**
	 * abstract method to get the price of an item 
	 * 
	 * @return the price of the item  
	 */
	public abstract Money getCost();
}
