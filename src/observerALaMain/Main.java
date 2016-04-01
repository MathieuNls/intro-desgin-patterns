package observerALaMain;

/**
 * @author math
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Observable observable = new Observable();
		Observateur observateur = new Observateur();
		Observateur observateur2 = new Observateur();
		
		observable.attach(observateur);
		observable.attach(observateur2);
		observable.setUnStatut(5);
		observable.detach(observateur2);
		observable.setUnStatut(3);

	}

}
