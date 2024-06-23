
import java.util.Scanner;

public class Book {

    
     private String title;
     private String author;
     private boolean isCheckedOut;

     

     public Book(String title,String author){
        this.title=title;
        this.author=author;
        this.isCheckedOut=false;
     }

     public String getTitle(){
        return title;
     }
     
     public String getAuthor(){
        return author;
     }

     public boolean isCheckedOut(){
        return isCheckedOut;
     }

     public void checkOut(){
        isCheckedOut=true;
     }

     public void returnBook(){
        isCheckedOut =false;
     }

     public String toString(){
        return "Title: "+title+ ", Author: "+author+", Status: "+(isCheckedOut ? "Checked Out " : "Available");
     }
}
     