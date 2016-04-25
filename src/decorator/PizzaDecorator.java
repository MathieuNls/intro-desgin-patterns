package decorator;

public class PizzaDecorator implements Pizza{

	private Pizza pizza;
	
	public PizzaDecorator(Pizza pizza){
		this.pizza = pizza;
	}
	
	@Override
	public String bakePizza() {
		return this.pizza.bakePizza();
	}

	@Override
	public float getCost() {
		return this.pizza.getCost();
	}
	
	

}
