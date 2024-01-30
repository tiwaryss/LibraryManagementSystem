public class Main
{
    public static void main(String[] args)//EntryPoint to the code
    {
        //Book and User should both be registered to the library
        //Two Persons cannot borrow the book at same time
        //OnePerson can only borrow one book at a time

        Book bk1 = new Book("AD3433", "Lord of the rings", "Daniel Collins", null);
        Book bk2 = new Book("AD3433", "Hobbit", "Daniel Collins", null);
        User us1 = new User("Ashish", 1234, null);
        User us2 = new User("Sandeep", 5678, null);

        Library lib = new Library();

        lib.libName = "Congress";
        lib.addBook(bk1);
        lib.addBook(bk2);

        lib.addUser(us1);
        lib.addUser(us2);


        us1.borrow(bk1, lib);
        us1.borrow(bk2, lib);
        us2.borrow(bk2, lib);
    }


}

