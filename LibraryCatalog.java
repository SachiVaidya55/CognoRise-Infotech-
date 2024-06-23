
import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {
    private List<Book> books;

    public LibraryCatalog(){
        books=new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public Book searchByTitle(String title){
        for(Book book: books){
            if(book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }

    public boolean checkOutBook(String title){
        Book book=searchByTitle(title);
        if (book !=null && !book.isCheckedOut()) {
            book.checkOut();
            return true;
        }
        return false;
    }
     
    public boolean returnBook(String title){
        Book book=searchByTitle(title);
        if (book != null && book.isCheckedOut()) {
            book.returnBook();
            return true;
        }
        return false;
    }
    public void displayBooks(){
        for(Book book: books){
            System.err.println(book);
        }
    }
}
