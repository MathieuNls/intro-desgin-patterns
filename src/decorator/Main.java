package decorator;

public class Main {

	public static void main(String[] args) {
		
		Pizza pizza = new PizzaMushroom(new BasePizza());
		System.out.println(pizza.bakePizza());
		System.out.println(pizza.getCost());
		
		Pizza pizza2 = new PizzaPepperoni(new PizzaMushroom(new BasePizza()));
		
		System.out.println(pizza2.bakePizza());
		System.out.println(pizza2.getCost());

	}

}
