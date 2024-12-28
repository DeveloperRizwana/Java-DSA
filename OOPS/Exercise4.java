class Library{
    String[] Books;
    int no_of_Books;
    
   Library(){
    this.Books = new String[100];
    this.no_of_Books = 0;
   }

   void addBooks(String Book){
    this.Books[no_of_Books] = Book;
    no_of_Books++;
    System.out.println(Book + " has been added!");
   }

   void showAvailableBooks(){
    System.out.println("Available books are : ");
    for (String Book : this.Books) {
        if(Book == null){
            continue;
        }
        System.out.println("* " + Book);
    }
   }
   void issueBooks(String book){
    for(int i = 0; i < this.Books.length; i++){
        if(this.Books[i] != null && this.Books[i].equals(book)){
            System.out.println("* " + book + " book has been issused!");
            this.Books[i] = null;
            return;
        }

    }
    System.out.println("This book doesn't exist");
   }
   void returnBook(String book){
    addBooks(book);
   }

}

public class Exercise4 {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBooks("Peer-e-kaamil");
        library.addBooks("Aab-e-Hayat");
        library.addBooks("Think and Rich Grow");
        library.showAvailableBooks();
        library.issueBooks("C++");

        library.issueBooks("Aab-e-Hayat");
        library.showAvailableBooks();

        library.returnBook("Aab-e-hayat");
        library.showAvailableBooks();
    }
}
