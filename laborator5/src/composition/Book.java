package composition;

public class Book {

    private String name;
    private String author;

    private Chapter[] chapters;

    public Book(String name, String author, Chapter[] chapters) {
        this.name = name;
        this.author = author;
        this.chapters = chapters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Chapter[] getChapters() {
        return chapters;
    }

    public void setChapters(Chapter[] chapters) {
        this.chapters = chapters;
    }
}
