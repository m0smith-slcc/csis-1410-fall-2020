package money;

public enum USCoins implements Spendable, Coin , USD {
	PENNY(1),
	NICKEL(5),
	DIME(10),
	QUARTER(25),
	HALF_DOLLAR(50);
	
	final private int value;
	
	USCoins(int v) {
		this.value = v;
	}
	
	public int getValue() { return value; }

}
