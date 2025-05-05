public class ObserverDemo {
    public static void main(String[] args) {
        Subject subject = new NewsAgency("Channel 1");
        Observer observer1 = new NewsSuscriber("BOB");
        Observer observer2 = new NewsSuscriber("ALICE");
        System.out.println("News Agency: " + ((NewsAgency)subject).getNewsAgencyName());
        subject.suscribe(observer1);
        subject.suscribe(observer2);
        System.out.println("And suscribers are " + ((NewsSuscriber)observer1).getName() + " and " + ((NewsSuscriber)observer2).getName());
        ((NewsAgency)subject).publishNews("Breaking News: Observer Pattern in Java");

        System.out.println("Unsubscribing " + ((NewsSuscriber)observer1).getName());
        subject.unsuscribe(observer1);
        ((NewsAgency)subject).publishNews("Breaking News: Default Pattern in Java");

    }
}