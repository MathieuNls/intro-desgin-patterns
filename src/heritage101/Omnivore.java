package heritage101;

/**
 * @author math
 *
 */
public class Omnivore extends Animal{
	
	/**
	 * 
	 */
	public void mangeDeTout(){
		System.out.println("Je mange de tout");
	}
	
	/* (non-Javadoc)
	 * @see heritage101.Animal#manger()
	 */
	@Override
	public void manger(){
		super.manger();
		this.mangeDeTout();
	}

	/* (non-Javadoc)
	 * @see heritage101.Animal#mourir()
	 */
	@Override
	public void mourir() {
		System.out.println("Je meurs comme un Omnivor");
	}

	/* (non-Javadoc)
	 * @see heritage101.EtreVivant#seReproduire()
	 */
	@Override
	public void seReproduire() {
		System.out.println("Comme un omnivor");
	}

}
