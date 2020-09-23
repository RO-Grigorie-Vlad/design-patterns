package observerPattern;

import java.util.Observable;
@SuppressWarnings( "deprecation")
public class ONewsAgency extends Observable{

    @SuppressWarnings("unused")
    private String news;
 
    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}
