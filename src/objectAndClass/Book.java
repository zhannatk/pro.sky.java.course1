package objectAndClass;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Автор: " + author + " Название книги: " + this.title + " Дата релиза: " + this.release;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return release == book.release && author.equals(book.author) && title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, release);
    }
}
