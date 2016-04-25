package strategie;

/**
 * @author math
 *
 */
public class DefensiveBehaviour implements IStrategyMove{

	/* (non-Javadoc)
	 * @see strategie.IStrategyMove#moveCommand()
	 */
	@Override
	public void moveCommand() {
		System.out.println("Je m enfui");
	}

}
