package sample.crawler;

public class SouGouCrawler implements ICrawler {

    @Override
    public String run() {
        return this.getClass().getName() + " running.";
    }

}
