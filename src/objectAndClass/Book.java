package objectAndClass;

public class Book {
    private String title;
    private int release;


    public Book(String title, int release) {
        this.title = title;
        this.release = release;
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

}
