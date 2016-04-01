package heritage101;

/**
 * @author math
 *
 */
public abstract class Animal implements EtreVivant{
	
	/**
	 * 
	 */
	public void manger(){
		System.out.println("Je suis un Animal");
	}
	
	/**
	 * 
	 */
	public abstract void mourir();

}
