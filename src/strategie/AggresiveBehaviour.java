package strategie;

public class AggresiveBehaviour implements IStrategyMove{

	@Override
	public void moveCommand() {
		System.out.println("J attaque");
	}

}
