package observer;

/**
 * @author math
 *
 */
public class Main {
	
	/**
	 * @param arg
	 */
	public static void main(String[] arg){
		
		NewsPublisher newsPublisher = new NewsPublisher();
		EmailSubscriber emailSubscriber = new EmailSubscriber();
		SMSSuscriber smsSuscriber = new SMSSuscriber();
		
		newsPublisher.addObserver(emailSubscriber);
		newsPublisher.addObserver(smsSuscriber);
		
		newsPublisher.setLatestNews("Il fait beau");
		
		newsPublisher.deleteObserver(smsSuscriber);
		
		newsPublisher.setLatestNews("Il neige");
		
	}

}
