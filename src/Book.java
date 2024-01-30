class Book
{
    String ISBN;
    String name;
    String author;
    User borrower;
    public Book(String ISBN, String name, String author, User borrower)
    {
        this.ISBN = ISBN;
        this.name=name;
        this.author=author;
        this.borrower=null;
    }
}