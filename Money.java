/**
 * this class creates a Money object used as currency in our whole Lab. 
 * 
 * @author kevincordero
 */
public class Money {
	/**
	 * instance variable ZERO, constant 0 
	 */
	public static Money ZERO = new Money(0);
	/**
	 * instance variable for ONE Dollar
	 */
	public static Money ONEDOLLAR = new Money(100);
	/**
	 * instance variable for TWO Dollar 
	 */
	public static Money TWODOLLAR = new Money(200);
	/**
	 * instance variable that holds the amount in cents
	 */
	private int amountinCents; 
	/**
	 * a constructor that turns the amount in cents into 
	 * Money object
	 * @param amountinCents an ammount in cents 
	 */
	public Money(int amountinCents) {
		this.amountinCents = amountinCents;
	}
	/**
	 * this method takes a string a get a Money object out of it 
	 * 
	 * @param String input "$2.50"
	 * @return the input but as a Money object 
	 */
	public Money fromMoneyString(String input) { 
		String newString = input.replace("$","");
		double money = Double.parseDouble(newString);
		
		int newMoney = (int) (money * 100);
		return new Money(newMoney);
	}
	/**
	 * this method will take a money object and perform a sales tax 
	 * according to minnesota tax 
	 * 
	 * @param input, input is object in the cart 
	 * @return the total amount with the MN sales tax 
	 */
	public static Money computeMNSalesTax(Money input) {
		
		String cost1 = input.toString();
		
		//take off the "$" from the string 
		String modifiedCost = cost1.replace("$", "");
		
		//
		double cost = Double.parseDouble(modifiedCost);
		 
		int finalCost = (int) Math.round(0.06875 * cost * 100);
		
		return new Money(finalCost);
	}
	/**
	 * this method is used throughout all files, 
	 * it is used to add a specific amount to the object 
	 * 
	 * @param an input, amount in cents 
	 * @return the total amount 
	 */
	public Money add(Money input) {
		
		int total = this.amountinCents + input.amountinCents;
		
		return new Money(total);
	}
	/**
	 * method takes the money and subtracts form the amount in cents
	 * 
	 * @param Money object input 
	 * @return the new subtracted total 
	 */
	public Money subtract(Money input) {
		
		int total = this.amountinCents - input.amountinCents;
		
		return new Money(total);
	}
	
	/**
	 * this overrides the toString method to print out the 
	 * amount in dollars, as a string. 
	 * 
	 * @return this method returns a string with the total amount  
	 */
	@Override
	public String toString() {
		int dollars; 
		int cents; 
		
		dollars = amountinCents / 100;
		cents = amountinCents % 100;
		
		if(cents == 0) {
			String money = " $" + dollars + "." + cents + "0";
			return money;
		}
		else {
			String money = " $" + dollars + "." + cents;
			return money;
		}
		
		
	}
}
