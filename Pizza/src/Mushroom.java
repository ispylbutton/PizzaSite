public class Mushroom extends Topping {
	public Mushroom(Pizza pizza){
		super(pizza);
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 0.25;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + "\n         Mushroom";
	}
	
	
}