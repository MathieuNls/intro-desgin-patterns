package singleton;

public class Main {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		
		/*
		 * 
		 * 
		 * 
		 * 
		 */
		
		Singleton singleton2 = Singleton.getInstance();
		
		if(singleton.equals(singleton2)){
			System.out.println("C est la mm instance");
		}
	}

}
