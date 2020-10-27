package balloon;

public class Balloon {
	private BalloonType type;
	private BalloonSize size;
	/**
	 * @param type
	 * @param size
	 */
	public Balloon(BalloonType type, BalloonSize size) {
		this.type = type;
		this.size = size;
	}
	/**
	 * @return the type
	 */
	public BalloonType getType() {
		return type;
	}
	/**
	 * @return the size
	 */
	public BalloonSize getSize() {
		return size;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "Balloon [type=" + type + ", size=" + size + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Balloon other = (Balloon) obj;
		if (size != other.size)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	

}
