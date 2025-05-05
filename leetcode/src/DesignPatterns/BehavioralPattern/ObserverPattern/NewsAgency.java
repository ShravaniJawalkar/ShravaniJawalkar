import java.util.*;
public class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();

    private String newsAgencyName;

    public NewsAgency(String newsAgencyName) {
        this.newsAgencyName = newsAgencyName;
    }

    @Override
    public void suscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsuscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String news) {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    public void publishNews(String news) {
        System.out.println("Publishing news: " + news);
        notifyObservers(news);
    }

    public String getNewsAgencyName() {
        return this.newsAgencyName;
    }
}