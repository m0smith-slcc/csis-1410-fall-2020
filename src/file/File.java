package file;

public class File {
	
	final private int size;
	final private String name;
	/**
	 * @param size the number of bytes
	 * @param name  The display name of the object
	 */
	public File(int size, String name) {
		this.size = size;
		this.name = name;
	}
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	

	

}
