package strategie;

import java.util.Scanner;

/**
 * @author math
 *
 */
public class Main {
	

	/**
	 * @param arg
	 */
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		
		Robot r = new Robot(new AggresiveBehaviour());
		r.move();
		
		r.setMoveStrategie(new DefensiveBehaviour());
		r.move();
		
		String move = sc.nextLine();
		
		r.setMoveStrategie(new IStrategyMove() { 
			
			@Override
			public void moveCommand() {
				
				System.out.println(move);
			}
		});
		
		r.move();
		sc.close();
		
	}
}
