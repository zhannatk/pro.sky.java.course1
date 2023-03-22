import objectAndClass.Author;
import objectAndClass.Book;

public class Main {
    public static void main(String[] args) {

        Author stephenKing = new Author("Stephen", "King");
        Book it = new Book("it", 1986, stephenKing);


        Author daleCarnegie = new Author("Dale","Carnegie");
        Book lincolnUnknown = new Book("Lincoln Unknown", 1932, daleCarnegie);

        lincolnUnknown.setRelease(1933);

        System.out.println(stephenKing);
    }
}