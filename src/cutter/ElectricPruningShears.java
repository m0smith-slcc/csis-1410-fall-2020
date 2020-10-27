package cutter;

public class ElectricPruningShears extends PruningShears {
	
	private boolean power;

	public ElectricPruningShears(int size) {
		super(size);
	}
	
	public boolean isOn() {
		return power;
	}
	
	public void onOff() {
		power = ! power;
	}

	@Override
	public String toString() {
		return "ElectricPruningShears [power=" + power + "]";
	}

	@Override
	public String cut() {
		if (power) {
			return super.cut() + " with power";
		} else {
			return "";
		}
	}
	
	

}
