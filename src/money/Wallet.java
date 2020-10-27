package money;

import java.util.ArrayList;

public class Wallet extends ArrayList<Spendable> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5130325446319604484L;

	public int getValue() {
		int rtnval = 0;
		for(Spendable b: this) {
			rtnval += b.getValue();
		}
		return rtnval;
	}

	

	

}
