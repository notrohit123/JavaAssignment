import java.util.Scanner;
public class Book
{
String book_name;
double isbn_no;
String author_name;
String publisher_name;

public Book(String book_name, double isbn_no, String author_name, String publisher_name)
{
this.book_name=book_name;
this.isbn_no=isbn_no;
this.author_name=author_name;
this.publisher_name=publisher_name;
}
public void setBookName(String book_name)
{
this.book_name=book_name;
}
public String getBookName()
{
return book_name;
}
public void setIsbnNumber(double isbn_no)
{
this.isbn_no=isbn_no;
}
public double getIsbnNumber()
{
return isbn_no;
}
public void setAuthorName(String author_name)
{
this.author_name=author_name;
}
public String getAuthorName()
{
return author_name;
}
public void setPublisherName(String publisher_name)
{
this.publisher_name=publisher_name;
}
public String getPublisherName()
{
return publisher_name;
}
public void getBookInfo()
{

System.out.println("Book Name :"+book_name);
System.out.println("ISBN Number :"+isbn_no);
System.out.println("Author Name :"+author_name);
System.out.println("Publisher Name :"+publisher_name);
}
public static void main(String args[])
{
Book[] books=new Book[5];
books[0]=new Book("The Alchemist", 748750, "Paulo Coelho", "HarperCollins");
books[1]=new Book("Evil Eye",728383,"Etaf Rum","HarperCollins");
books[2]=new Book("Java Programming", 784922, "John Doe", "Willey");
books[3]=new Book("Big Magic", 5789433, "Elizabeth", "Bloomsbury");
books[4]=new Book("SQL", 5896022, "Fredrick", "Orient");


String[] bookdetails=new String[books.length];
System.out.println("Book Details");
        for (int i = 0; i<books.length; i++) {
            System.out.println("Book :"+i);
            books[i].getBookInfo();
}
}
}



 