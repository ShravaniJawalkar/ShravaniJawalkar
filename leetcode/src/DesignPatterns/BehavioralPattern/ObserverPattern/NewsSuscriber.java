public class NewsSuscriber implements Observer {
    private String name;

    public NewsSuscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }

    public String getName() {
        return this.name;
    }
}