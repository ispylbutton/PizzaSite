
public abstract class Topping extends Pizza {
	protected Pizza pizza;
	
	public Topping(Pizza pizza) {
		this.pizza = pizza;
		this.setDescription(getDescription());
	}

	public abstract double getCost();
	
	public abstract String getDescription();
}
