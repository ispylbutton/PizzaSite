
public class Dessert extends Side {
	public Dessert(String name, String description) {
		super(name,description);
	}

	@Override
	public double getCost() {
		return 3.99;
	}
}
