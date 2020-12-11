package ser;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Shape implements Serializable { 
	
	

	@Override
	public String toString() {
		return "Shape [sides=" + sides + ", names=" + names + "]";
	}

	/**
	 * Version 1.0
	 */
	private static final long serialVersionUID = -919720467319732446L;
	
	int sides;
	List<String> names;
	
	/**
	 * @return the sides
	 */
	public long getSides() {
		return sides;
	}

	/**
	 * @param sides the sides to set
	 */
	public void setSides(int sides) {
		this.sides = sides;
	}

	public Shape(int sides) {
		
		this.sides = sides;
		this.names = Arrays.asList("able","baker","charlie");
		
		
	}

}
