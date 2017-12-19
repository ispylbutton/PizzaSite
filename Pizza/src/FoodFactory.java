
public class FoodFactory {
	
	public static Food getItem(String name) {
		if (name == "Cheese Pizza"){
			return new basePizza(2);
		}
		else if (name == "Pepperoni Pizza"){
			return new Pepperoni(new basePizza(2));
		}
		else if (name == "Meatlover's"){
			return new Beef(new Chicken(new Sausage(new Pepperoni(new basePizza(2)))));
		}
		else if (name == "BBQ Chicken Pizza"){
			return new Chicken(new basePizza(2));
		}
		else if (name == "Supreme Pizza"){
			return new greenPepper(new Mushroom(new Beef(new Chicken(new Sausage(new Pepperoni(new basePizza(2)))))));
		}
		else if (name == "Veggie Pizza"){
			return new Mushroom(new greenPepper(new Tomato(new basePizza(2))));
		}
		else if (name == "Apple Pie"){
			return new Dessert(name,name);
		}
		else if (name == "Brownie"){
			return new Dessert(name,name);
		}
		else if (name == "Cin. Sticks"){
			return new Dessert(name,name);
		}
		else if (name == "Cupcake"){
			return new Dessert(name,name);
		}
		else if (name == "Ice Cream"){
			return new Dessert(name,name);
		}
		else if (name == "Ch.Chip Cookie"){
			return new Dessert(name,name);
		}
		else if (name == "Caesar Salad"){
			return new SoupSalad(name,name);
		}
		else if (name == "Southwest Salad"){
			return new SoupSalad(name,name);
		}
		else if (name == "Chop Salad"){
			return new SoupSalad(name,name);
		}
		else if (name == "Broccoli Cheddar Soup"){
			return new SoupSalad(name,name);
		}
		else if (name == "Tomato Soup"){
			return new SoupSalad(name,name);
		}
		else if (name == "Tortilla Soup"){
			return new SoupSalad(name,name);
		}
		else if (name == "Boneless Wings"){
			return new Appetizer(name,name);
		}
		else if (name == "Hot Wings"){
			return new Appetizer(name,name);
		}
		else if (name == "French Fries"){
			return new Appetizer(name,name);
		}
		else if (name == "Garlic Knots"){
			return new Appetizer(name,name);
		}
		else if (name == "Breadsticks"){
			return new Appetizer(name,name);
		}
		else if (name == "Cheesesticks"){
			return new Appetizer(name,name);
		}
		else if (name == "Sprite - 20oz"){
			return new Beverage(name,name);
		}
		else if (name == "Sprite - 2L"){
			return new Beverage(name,name);
		}
		else if (name == "Cola - 20oz"){
			return new Beverage(name,name);
		}
		else if (name == "Cola - 2L"){
			return new Beverage(name,name);
		}
		else if (name == "Mtn Dew - 20oz"){
			return new Beverage(name,name);
		}
		else if (name == "Mtn Dew - 2L"){
			return new Beverage(name,name);
		}
		return new basePizza(2);
	}
	
}
