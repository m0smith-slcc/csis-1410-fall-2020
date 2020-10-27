/**
 * 
 */
package junit;

import java.math.BigDecimal;

/**
 * @author matt
 *
 */
public class TreasureChest {
	
	/**
	 * The number of coins in our chest.  Cannot be negative.
	 */
	private int coins;
	
	/**
	 * The current value of gold per ounce (bid).
	 */
	
	public static BigDecimal price = new BigDecimal(1957.80);
	
	/** 
	 * Percent gold in each coin.
	 */
	
	public static final BigDecimal GOLD_PER_COIN = new BigDecimal(.9243);

	/**
	 * @param coins
	 */
	public TreasureChest(int coins) {
		this.coins = coins;
		
	}
	/**
	 * Add coins to the chest
	 * @param coins the number of coins to add (cannot to negative)
	 * @return the new total number of coins in the chest
	 * @throws IllegalArgumentException when coins is negative
	 */
	public int addCoins(int coins) {
		if(coins < 0) throw new IllegalArgumentException("coins cannot be negative");
		this.coins += coins;
		return this.coins;
	}
	
	/**
	 * Remove coins from the chest
	 * @param coins the number of coins to remove (cannot to negative)
	 * @return the new total number of coins in the chest
	 * @throws IllegalArgumentException when coins is negative or greater than this.coins.
	 */
	public int removeCoins(int coins) {
		return -1;
	}
	
	public String toString() {
		return "[ " + coins + " coins ]";
	}
	
	public BigDecimal dollarValue() {
		return null;
	}
	/**
	 * @return the coins
	 */
	public int getCoins() {
		return coins;
	}
	
	

}
