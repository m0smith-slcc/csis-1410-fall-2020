/**
 * 
 */
package clazz1;

/**
 * Print a mailing label to standard out.
 * @author matt
 *
 */
public class AddressLabel {
	
	private String firstName;
	private String lastName;
	private Address address;
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param address
	 */
	public AddressLabel(String firstName, String lastName, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "AddressLabel [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	
	public void printLabel(){
		
		System.out.println(firstName + " " + lastName);
		System.out.println(address.getStreet());
		System.out.println(address.getCity() + ", " + address.getState() + " " + address.getZip());
		
	}
	
	

}
