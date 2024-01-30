class User
{
    String name;
    int userId;
    Book borrowedBook;

    public User(String name, int userId, Book borrowedBook){
        this.name = name;
        this.userId = userId;
        this.borrowedBook = borrowedBook;
    }
    public void borrow(Book bk, Library lb)
    {
        if (lb.users.contains(this)){
            System.out.println("User is there");
            if (lb.books.contains(bk)){
                System.out.println("Book is there");
                if(bk.borrower == null){
                    this.borrowedBook = bk;
                    System.out.println("Book borrowed successfully");
                    bk.borrower = this;
                }
                else{
                    System.out.println("This book is currently issued to another borrower");
                }

            }
            else{
                System.out.println("Book is not present in the Library");
            }

        }
        else{
            System.out.println("User is not Registered");
        }
    }
}