package heritage101;

/**
 * @author math
 *
 */
public class Herbivore extends Animal{
	
	/**
	 * 
	 */
	public void mangerAvecDesPlantes(){
		System.out.println("Il y a de l herbe partout");
	}
	
	/* (non-Javadoc)
	 * @see heritage101.Animal#manger()
	 */
	public void manger(){
		super.manger();
		this.mangerAvecDesPlantes();
	}

	/* (non-Javadoc)
	 * @see heritage101.Animal#mourir()
	 */
	@Override
	public void mourir() {
		System.out.println("Je meurs comme un Herbivor");
	}

	/* (non-Javadoc)
	 * @see heritage101.EtreVivant#seReproduire()
	 */
	@Override
	public void seReproduire() {
		System.out.println("Comme un herbivor");
	}

}
