import java.util.ArrayList;

class LibraryBooks{
    public String bAutor;
    public String bName;
    public String bLanguage;
}
public class Library extends Book {
    public String nameLibrary;
    public Library(String nameLibrary){
        this.nameLibrary = nameLibrary;
    }
    ArrayList<LibraryBooks> listBook = new ArrayList<>();
    public void addBook(String bookAutor, String bookName, String bookLanguage){
        LibraryBooks lb = new LibraryBooks();
        setBookAutor(bookAutor);
        setBookName(bookName);
        setBookLanguage(bookLanguage);
        lb.bAutor = getBookAutor();
        lb.bName = getBookName();
        lb.bLanguage = getBookLanguage();
        listBook.add(lb);
    }
    public ArrayList<LibraryBooks> getBookList(){
        return listBook;
    }
}