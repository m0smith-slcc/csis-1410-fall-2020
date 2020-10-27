/**
 * 
 */
package clazz1;

/**
 * @author matt
 *
 */
public class Address {
	
	private String street;
	private String city;
	private State state;
	private int zip;
	
	/**
	 * United States postal service address.
	 * 
	 * Create an address instance populating all the fields.
	 * 
	 * @param street the street and house number
	 * @param city the name of the city
	 * @param state a state within the US of A
	 * @param zip the 5 digit zipcode
	 */
	public Address(String street, String city, State state, int zip) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	/**
	 * street the street and house number
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * the name of the city
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * state a state within the US of A
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * the 5 digit zipcode
	 * @return the zip
	 */
	public int getZip() {
		return zip;
	}
	
	

	
}
