package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import observerPattern.NewsAgency;
import observerPattern.NewsChannel;

public class ObserverPatternTest {

    @Test
    public void testNewsReceived(){
       
        NewsAgency observable = new NewsAgency();
        NewsChannel newsChannel = new NewsChannel();
        assertNull(newsChannel.getNews());

        observable.addObserver(newsChannel);
        observable.setNews("Trump won the 2020 elections!");
        assertEquals("Trump won the 2020 elections!", newsChannel.getNews());
    }
}
