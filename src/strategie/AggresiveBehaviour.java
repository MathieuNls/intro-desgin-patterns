package strategie;

/**
 * @author math
 *
 */
public class AggresiveBehaviour implements IStrategyMove{

	/* (non-Javadoc)
	 * @see strategie.IStrategyMove#moveCommand()
	 */
	@Override
	public void moveCommand() {
		System.out.println("J attaque");
	}

}
