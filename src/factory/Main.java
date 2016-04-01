package factory;

public class Main {

	public static void main(String[] args){
		
		Button button = LookAndFeel.getInstance().
				createButton(LookAndFeel.Types.MOTIF);
		
		System.out.println(button.getClass().getName());
	}
}
