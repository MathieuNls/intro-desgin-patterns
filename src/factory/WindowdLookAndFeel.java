package factory;

/**
 * @author math
 *
 */
public class WindowdLookAndFeel {
	
	
	
	/**
	 * @return
	 */
	public static Button createButton(){
		
		return new WindowsButton();
	}
	
	/**
	 * @return
	 */
	public static Editbox createEditBox(){
		return new WindowsEditBox();
	}

}
