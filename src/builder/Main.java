package builder;

public class Main {

	public static void main(String[] args) {
		
		Pizza pizza = new PizzaBuilder()
			.withCheese(Cheese.AMERICAN)
			.withCrust(Crust.THIN)
			.withSize(Size.LARGE)
			.build();
		
		
		System.out.println(pizza.getTotalPrice());

	}

}
