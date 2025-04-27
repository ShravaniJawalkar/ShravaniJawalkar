public class Book implements BookPrototype {
    private String title;
    private String author;
    private int pages;
    private Publisher publisher;

    public Book(String title, String author, int pages, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.publisher = publisher;
    }

    @Override
    public BookPrototype clone() {
        Publisher clonePublisher = this.publisher.clone();
        // Create a new Book object with the same properties
        Book cloneBook = new Book(this.title, this.author, this.pages, clonePublisher);
        // Return the cloned object
        return cloneBook;
    }

    public  void setPublisherName(String publisherName) {
        this.publisher.setPublisherName(publisherName);
    }

    public void showDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Publisher: " + publisher.getPublisherName());
    }
}