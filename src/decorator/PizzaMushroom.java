package decorator;

public class PizzaMushroom extends PizzaDecorator{

	public PizzaMushroom(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String bakePizza() {
		return super.bakePizza() + " avec des champignons";
	}

	@Override
	public float getCost() {
		return super.getCost() + 20;
	}
	

}
