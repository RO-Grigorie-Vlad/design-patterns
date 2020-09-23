package observerPattern;

import java.util.Observable;
import java.util.Observer;

public class ONewsChannel implements Observer {

    //Observer and Observable are depracated since Java 9
    //Nevertheless, we are using them here for demonstration purposes

    private String news;

    @Override
    public void update(Observable o, Object news) {
        this.setNews((String) news);
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getNews() {
        return news;
    }

    
}
