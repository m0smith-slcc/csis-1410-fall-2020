package money;

public enum USBill implements Spendable, Bill, USD {
	
	GEORGE(1),
	LINCOLN(5),
	FRANKLIN(100);
	
	final private int value;
	
	USBill(int v) {value = v;}
	
	public int getValue() {return value * 100 ;}

}
