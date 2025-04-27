public class PrototypeDemo {
    public static void main(String args[]){
        //Create original instance
        Document original = new Document("Original Document");
        original.addContent("This is the original document content.");
        original.addContent("This is the second line of the original document.");
        //Clone the original instance
        Document cloned = (Document) original.clone();
        //Modify the cloned instance
        cloned.addContent("This is the modified content of the cloned document.");
        //Display the contents of both instances
        System.out.println("Original Document:");
        original.show();
        System.out.println("\nCloned Document:");
        cloned.show();

        Publisher originalPublisher = new Publisher("Original Publisher");
        Book originalBook = new Book("Original Book","Original Author",400,originalPublisher);

        //Clone the original instance
        Book clonedBook = (Book) originalBook.clone();
        //Modify the cloned instance
        clonedBook.setPublisherName("Cloned Publisher");

        //Display the contents of both instances
        System.out.println("\nOriginal Book:");
        originalBook.showDetails();
        System.out.println("\nCloned Book:");
        clonedBook.showDetails();
    }
}