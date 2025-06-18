class Book {
    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean is_borrowed;

    static{
        totalNoOfBooks = 0;
    }
    //object init
    {
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    Book(String isbn){
        this(isbn, "Unknown", "Unknown");
        
    }
    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

    void borrowBook(){
        if(is_borrowed){
            System.out.println("Book is already borrowed");
        }else{
            this.is_borrowed = true;
            System.out.println("Enjoy "+this.title);
        }
        
    }

    void returnBook(){
        if(is_borrowed){
            this.is_borrowed = false;
            System.out.println("Hope you enjoyed the book, Please leave a review");
        }else{
            System.out.println("This book is already in the library");
        }
    }
    public static void main(String[] args) {
        Book GOT = new Book("1", "Song of Ice and Fire", "George R.R. Martin");
        System.out.println(Book.getTotalNoOfBooks());
        GOT.borrowBook();
        GOT.borrowBook();
        GOT.returnBook();
        GOT.returnBook();

        String str = "Internshala";
    System.out.println(str.equals("Intern"));

    }
}
