import java.util.List;
import java.util.ArrayList;

public class Document implements DocumentPrototype {

    private String title;
    private List<String> content = new ArrayList<>();

    public Document(String title) {
        this.title = title;
    }

    public void addContent(String text) {
        content.add(text);
    }

    @Override
    public DocumentPrototype clone() {
        Document clonedDocument = new Document(this.title);
        clonedDocument.content = new ArrayList<>(this.content);
        return clonedDocument;
    }

    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Content: ");
        for (String text : content) {
            System.out.println(text);
        }
    }
}