
public class Beverage extends Side {
	public Beverage(String name, String description) {
		super(name,description);
	}

	@Override
	public double getCost() {
		return 1.99;
	}
}
