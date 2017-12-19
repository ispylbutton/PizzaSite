
public class Appetizer extends Side {
	public Appetizer(String name, String description) {
		super(name,description);
	}

	@Override
	public double getCost() {
		return 5.99;
	}
}
