public class greenPepper extends Topping {
	public greenPepper(Pizza pizza){
		super(pizza);
	}

	@Override
	public double getCost() {
		return pizza.getCost() + 0.25;
	}

	@Override
	public String getDescription() {
		return pizza.getDescription() + "\n         Green Pepper";
	}
	
	
}