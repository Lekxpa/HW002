public abstract class Book {
    private String BookAutor;
    private String BookName;
    private String BookLanguage;

    public void setBookAutor(String BookAutor){
        this.BookAutor = BookAutor;
    }
    public void setBookName(String BookName){
        this.BookName = BookName;
    }
    public void setBookLanguage(String BookLanguage){
        this.BookLanguage = BookLanguage;
    }
    public String getBookAutor(){
        return BookAutor;
    }
    public String getBookName(){
        return BookName;
    }
    public String getBookLanguage(){
        return BookLanguage;
    }
}
