package factory;

/**
 * @author math
 *
 */
public class MotifLookAndFeel {
	/**
	 * @return
	 */
	public static Button createButton(){
		return new MotifButton();
	}
	
	/**
	 * @return
	 */
	public static Editbox createEditBox(){
		return new MotifEditBox();
	}
}
