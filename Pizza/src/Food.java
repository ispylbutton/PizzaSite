
public abstract class Food {
	private String description;
	private String name;
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract double getCost();

	public String toString() {
		return (String.format(
	            "%s: $%.2f\n",this.description,this.getCost()));
	}
}
