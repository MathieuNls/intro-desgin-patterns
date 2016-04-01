package factory;

public class LookAndFeel {
	
	/**
	 * 
	 */
	private static LookAndFeel instance = new LookAndFeel();
	
	/**
	 * 
	 */
	private LookAndFeel(){};
	
	/**
	 * @return
	 */
	public static LookAndFeel getInstance(){
		return instance;
	}
	
	/**
	 * @author math
	 *
	 */
	public enum Types{
		WINDOWS, MOTIF;
	}
	
	/**
	 * @param t
	 * @return
	 */
	public Button createButton(Types t){
		
		if(t.equals(Types.WINDOWS)){
			return WindowdLookAndFeel.createButton();
		}else{
			return MotifLookAndFeel.createButton();
		}
	}
	
	/**
	 * @param t
	 * @return
	 */
	public Editbox createEditBox(Types t){
		if(t.equals(Types.WINDOWS)){
			return WindowdLookAndFeel.createEditBox();
		}else{
			return MotifLookAndFeel.createEditBox();
		}
	}
}
