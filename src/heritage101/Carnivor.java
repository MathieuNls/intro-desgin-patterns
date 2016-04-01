package heritage101;

/**
 * @author math
 *
 */
public class Carnivor extends Animal{

	/**
	 * 
	 */
	public void mangerAvecDuSang(){
		System.out.println("Il y a du sang partout");
	}
	
	/* (non-Javadoc)
	 * @see heritage101.Animal#manger()
	 */
	@Override
	public void manger(){
		super.manger();
		this.mangerAvecDuSang();
	}

	/* (non-Javadoc)
	 * @see heritage101.Animal#mourir()
	 */
	@Override
	public void mourir() {
		System.out.println("Je meurs comme un carnivor");
	}

	/* (non-Javadoc)
	 * @see heritage101.EtreVivant#seReproduire()
	 */
	@Override
	public void seReproduire() {
		System.out.println("Comme un carnivor");	
	}
}
