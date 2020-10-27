/**
 * 
 */
package clazz1;

/**
 * @author matt
 *
 */
public class Clazz1App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Address address = new Address("123 Main St.", "Yuma", State.ID, 87999);
		AddressLabel al1 = new AddressLabel("John", "Connor", address );
		System.out.println(al1);
		al1.printLabel();

	}

}
