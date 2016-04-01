package singleton;

/**
 * @author math
 *
 */
public class Singleton {

	/**
	 * 
	 */
	private static Singleton instance;
	
	/**
	 * 
	 */
	private Singleton(){};
	
	/**
	 * @return
	 */
	public static Singleton getInstance(){
		if(instance == null){
			
			synchronized (Singleton.class) {
				if(instance == null){
					instance = new Singleton();
				}
			}
			
		}
		return instance;
	}
	
}
