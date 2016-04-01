package observer;

import java.util.Observable;

/**
 * @author math
 *
 */
public class NewsPublisher extends Observable{

	/**
	 * 
	 */
	private String latestNews;

	/**
	 * @return
	 */
	public String getLatestNews() {
		return latestNews;
	}

	/**
	 * @param latestNews
	 */
	public void setLatestNews(String latestNews) {
		this.latestNews = latestNews;
		this.setChanged();
		this.notifyObservers(latestNews);
	}	
}
