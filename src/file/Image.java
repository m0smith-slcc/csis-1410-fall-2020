package file;

public class Image extends File implements Encoded {
	
	final private int width;
	final private int height;
	final private String encoding_name;
	
	public Image(int size, String name, int x, int y , String encoding) {
		super(size, name);
		
		this.width = x;
		this.height = y;
		this.encoding_name = encoding;
		
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	

	@Override
	public String encoding() {
		
		return encoding_name;
	}

	@Override
	public int getSize() {
		
		return super.getSize();
	}
	
	
	public int getSize(int divisor) {
		return getSize() / divisor;
	}
	

}
