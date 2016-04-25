package decorator;

public class PizzaPepperoni extends PizzaDecorator{

		public PizzaPepperoni(Pizza pizza) {
			super(pizza);
		}
		
		@Override
		public String bakePizza() {
			return super.bakePizza() + " avec des pepperonis";
		}

		@Override
		public float getCost() {
			return super.getCost() + 30;
		}
		

}

