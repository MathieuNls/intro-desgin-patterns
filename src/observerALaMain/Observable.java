package observerALaMain;

import java.util.ArrayList;
import java.util.List;


/**
 * @author math
 *
 */
/**
 * @author math
 *
 */
public class Observable {
	
	/**
	 * 
	 */
	private List<Observateur> observateurs = new ArrayList<>();
	/**
	 * 
	 */
	private int unStatut = 0;
	
	/**
	 * @param observateur
	 */
	public void attach(Observateur observateur){
		observateurs.add(observateur);
	}
	
	/**
	 * @param observateur
	 */
	public void detach(Observateur observateur){
		observateurs.remove(observateur);
	}
	
	/**
	 * 
	 */
	public void notifie(){
		for (Observateur observateur : observateurs) {
			observateur.update(unStatut);
		}
	}

	/**
	 * @return
	 */
	public int getUnStatut() {
		return unStatut;
	}

	/**
	 * @param unStatut
	 */
	public void setUnStatut(int unStatut) {
		this.unStatut = unStatut;
		this.notifie();
	}

}
