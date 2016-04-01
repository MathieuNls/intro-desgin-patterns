package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author math
 *
 */
public class SMSSuscriber implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(this.getClass().getName());
		System.out.println(o.getClass().getName());
		System.out.println(arg);
	}

	
}
