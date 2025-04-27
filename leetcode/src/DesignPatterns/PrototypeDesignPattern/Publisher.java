public class Publisher {
    private String name;

    public Publisher(String name) {
        this.name = name;
    }

    public String getPublisherName() {
        return name;
    }
    public void setPublisherName(String name) {
        this.name = name;
    }
    public Publisher clone(){
        return new Publisher(this.name);
    }
}