package heritage101;

public class Herbivore extends Animal{
	
	public void mangerAvecDesPlantes(){
		System.out.println("Il y a de l herbe partout");
	}
	
	public void manger(){
		super.manger();
		this.mangerAvecDesPlantes();
	}

	@Override
	public void mourir() {
		System.out.println("Je meurs comme un Herbivor");
	}

	@Override
	public void seReproduire() {
		System.out.println("Comme un herbivor");
	}

}
