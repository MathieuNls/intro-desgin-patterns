package strategie;

public class DefensiveBehaviour implements IStrategyMove{

	@Override
	public void moveCommand() {
		System.out.println("Je m enfui");
	}

}
