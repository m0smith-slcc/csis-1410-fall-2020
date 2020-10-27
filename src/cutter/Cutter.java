/**
 * 
 */
package cutter;

/**
 * @author matt
 *
 */
public abstract class Cutter {
	
	private int size;

	/**
	 * @param size the size of the cutter in millimeters
	 */
	public Cutter(int size) {
		this.size = size;
	}

	/**
	 * @return the size in millimeters
	 */
	public int getSize() {
		return size;
	}

	@Override 
	public String toString() {
		return "Cutter [size=" + size + "]";
	}
	
	public abstract String cut();

}
