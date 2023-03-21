import objectAndClass.Author;
import objectAndClass.Book;

public class Main {
    public static void main(String[] args) {

        Author stephenKing = new Author("Stephen King");
        Book it = new Book("it", 1986);


        Author daleCarnegie = new Author("Dale Carnegie");
        Book lincolnUnknown = new Book("Lincoln Unknown", 1932);

        lincolnUnknown.setRelease(1933);

        System.out.println("stephenKing.getAuthorName() = " + stephenKing.getAuthorName());
        System.out.println("it.getTitle() = " + it.getTitle());
        System.out.println("it.getRelease() = " + it.getRelease());

        System.out.println("daleCarnegie.getAuthorName() = " + daleCarnegie.getAuthorName());
        System.out.println("lincolnUnknown.getTitle() = " + lincolnUnknown.getTitle());
        System.out.println("lincolnUnknown.getRelease() = " + lincolnUnknown.getRelease());
    }
}