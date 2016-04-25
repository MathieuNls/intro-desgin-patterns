package builder;

public class PizzaBuilder {
	
	private Pizza pizza = new Pizza();
	
	public PizzaBuilder withSize(Size size){
		pizza.setSize(size);
		pizza.addToTotalPrice(size.getCost());
		return this;
	}
	
	public PizzaBuilder withCrust(Crust crust){
		pizza.setCrust(crust);
		pizza.addToTotalPrice(crust.getCost());
		return this;
	}
	
	public PizzaBuilder withCheese(Cheese cheese){
		pizza.setCheese(cheese);
		pizza.addToTotalPrice(cheese.getCost());
		return this;
	}
	
	public Pizza build(){
		return pizza;
	}

}
