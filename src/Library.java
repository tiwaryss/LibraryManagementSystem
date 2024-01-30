import java.util.*;

class Library
{
    String libName;
    List<User> users;
    List<Book> books;


    Library()
    {
        users = new ArrayList<User>();
        books = new ArrayList<Book>();
        //issuedBooks = new ArrayList<Book>();
    }

    public void addBook(Book bk)
    {
        books.add(bk);
    }

    public void addUser(User us)
    {
        users.add(us);
    }

}