public class FacadDemo {
    public static void main(String args[]){
        Movie m = new Movie(new DVDPlayer(),  new Lights(), new Projector());
        System.out.println("Start MOVIE:");
        m.watchMovie("Inception");
        System.out.println("MOVIE Completed");
        m.endMovie();
    }
}