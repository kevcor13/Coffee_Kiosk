import java.util.ArrayList;
/**
 * a shopping cart class that will store all items user will be 
 * purchasing 
 * 
 * @author kevincordero
 */
public class ShoppingCart {
	/**
	 * instance variable that stores the items as an ArrayList 
	 */
	private ArrayList<Buyable> items;
	/**
	 * a constructor that set the arraylist as "items"
	 * 
	 */
	public ShoppingCart() {
		items = new ArrayList<Buyable>();
	}
	/**
	 * a method that adds a buyable item into the
	 * arraylist 
	 * 
	 * @param buyable item from the list 
	 */
	public void addItem(Buyable item) {
		items.add(item);
	}
	/**
	 * a method that will get the total of all
	 * items in the cart. 
	 * 
	 * @return the total amount 
	 */
	public Money getTotal() {
		Money total = new Money(0);
		for(int i = 0; i < items.size(); i++ ) {		
			total = total.add(items.get(i).getCost());
		}
		total = total.add(Money.computeMNSalesTax(total));
		
		return total;
		
		
	}
	/**
	 * method overrides the toString method 
	 * @return a string that will show all items in the list/cart
	 */
	@Override
	public String toString() {
		if(items.size() == 0) {
			return "Cart is Empty" ;
		}
		String cart = "";
		for(int i = 0; i < items.size(); i++) {
			cart = cart + (i + 1) + ".)" + items.get(i) + items.get(i).getCost() + "\n";
		}
		cart = cart + "total: " + getTotal();
		return cart;
	}
}
