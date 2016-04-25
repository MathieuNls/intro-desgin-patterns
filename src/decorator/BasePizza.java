package decorator;

public class BasePizza implements Pizza{

	@Override
	public String bakePizza() {
		return "Pizza de Base hors de prix";
	}

	@Override
	public float getCost() {
		return 100;
	}


}
