package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author math
 *
 */
public class EmailSubscriber implements Observer {

	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		System.out.println(this.getClass().getName());
		System.out.println(o.getClass().getName());
		System.out.println(arg);
	}

}
