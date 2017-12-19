public class Tomato extends Topping {
	public Tomato(Pizza pizza){
		super(pizza);
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 0.25;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + "\n         Tomato";
	}
	
	
}