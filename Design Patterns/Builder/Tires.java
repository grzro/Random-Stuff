public class Tires {

	private String tireType;
	private int durability;
	
	public void setDurability(int durability) {
		this.durability = durability;
	}
	
	public void setTireType(String tireType) {
		this.tireType = tireType;
	}
	
	public int getDurability() {
		return durability;
	}
	
	public String getTireType() {
		return tireType;
	}
	
	@Override
	public String toString() {
		return "Tires [type=" + tireType + ", durability=" + durability + "]";
	}
}
