package file;
public class Video extends File implements Encoded {
	
	final private String encoding;

	public Video(int size, String name, String encoding) {
		super(size, name);
		this.encoding = encoding;
		
	}
	
	public void some_method() {}

	@Override
	public String encoding() {
		
		return encoding;
	}

}
