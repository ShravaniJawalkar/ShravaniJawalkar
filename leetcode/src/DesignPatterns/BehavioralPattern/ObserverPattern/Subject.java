public interface Subject {

    public void suscribe(Observer observer);
    public void unsuscribe(Observer observer);
    public void notifyObservers(String news);
}