package strategie;

/**
 * @author math
 *
 */
public class Robot {
	
	/**
	 * 
	 */
	private IStrategyMove moveStrategie;
	
	/**
	 * @param moveStrategie
	 */
	public Robot(IStrategyMove moveStrategie){
		this.moveStrategie = moveStrategie;
	}
	
	/**
	 * 
	 */
	public void move(){
		moveStrategie.moveCommand();
	}
	
	/**
	 * @param moveStrategie
	 */
	public void setMoveStrategie(IStrategyMove moveStrategie){
		this.moveStrategie = moveStrategie;
	}

}
