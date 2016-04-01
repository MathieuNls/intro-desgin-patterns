package heritage101;

/**
 * @author math
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		faireMangerUnAnimal(new Carnivor());
		
		faireMangerUnAnimal(new Herbivore());
		
		faireMangerUnAnimal(new Carnivor());
		
		faireMangerUnAnimal(new Omnivore());
	}
	
	/**
	 * @param a
	 */
	public static void faireMangerUnAnimal(Animal a){
		a.manger();
		
		if(a instanceof Carnivor){
			((Carnivor)a).mangerAvecDuSang();
		}
		a.seReproduire();
		a.mourir();
	}

}
