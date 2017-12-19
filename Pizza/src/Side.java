
public abstract class Side extends Food {
	
	public Side(String name, String description) {
		this.setName(name);
		this.setDescription(description);
	}
	
	@Override
	public abstract double getCost();
	
}
