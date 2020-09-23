package observerPattern;

public class NewsChannel implements Channel {

    private String news;

    @Override
    public void update(Object o) {
        System.out.println("Notification received by the NewsChannel! There have been news!");
        setNews((String) o);
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
    
}
