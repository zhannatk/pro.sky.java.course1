package objectAndClass;

public class Book {
    private Author author;
    private String title;
    private int release;


    public Book(String title, int release, Author author) {
        this.author = author;
        this.title = title;
        this.release = release;
    }


    public Author getAuthor() {
        return this.author;

    }

    public String getTitle() {
        return this.title;

    }

    public int getRelease() {
        return this.release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public String toString() {
        return "Автор: " + this.author + " Название книги: " + this.title + " Дата релиза: " + this.release;
    }

}
