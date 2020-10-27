/**
 * 
 */
package cutter;

/**
 * @author matt
 *
 */
public class Pliers extends Cutter {
	
	private PliersType type;
	
	public Pliers(int size, PliersType type) {
		super(size);
		this.type = type;
		
	}

	@Override
	public String cut() {
		return "cut by " + type;
	}

}
