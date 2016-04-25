package strategie;

/**
 * @author math
 *
 */
public class NormalBehaviour implements IStrategyMove{

	/* (non-Javadoc)
	 * @see strategie.IStrategyMove#moveCommand()
	 */
	@Override
	public void moveCommand() {
		System.out.println("Je temporise");
	}

}
