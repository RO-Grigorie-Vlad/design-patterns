package observerPattern;

@SuppressWarnings( "deprecation")
public class ObserverPatternDemo {
    
    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency(); //observable
        NewsChannel newsChannel = new NewsChannel(); //observer
        System.out.println("\nNo news: " + (newsChannel.getNews()==null));

        newsAgency.addObserver(newsChannel);
        newsAgency.setNews("Trump won the 2020 elections!");
        System.out.println("News: " + newsChannel.getNews());

        ONewsAgency observable = new ONewsAgency(); //observable
        ONewsChannel observer = new ONewsChannel(); //observer
        
        observable.addObserver(observer);
        observable.setNews("California is burning again. What a surprise...");
        
        System.out.println("\nNews: " + observer.getNews());


    }


}
