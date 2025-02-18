package miniproject.collection.librarymanagementsystem;

public class Book {
    int Bookid;
    String Title;
    String Author;
    public Book(int Bookid, String Title, String Author) {
        this.Bookid = Bookid;
        this.Title = Title;
        this.Author = Author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Bookid=" + Bookid +
                ", Title='" + Title + '\'' +
                ", auhaur='" + Author + '\'' +
                '}';
    }
}
