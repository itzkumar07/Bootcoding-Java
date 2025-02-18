package collection.librarymanagementsystem;

import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        //List initialization Tow Classes Using

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(101, "Java Progamming","jannes bond"));
        books.add(new Book(102, "Science","Vividh"));
        books.add(new Book(103, "Maths","Kumar"));
        books.add(new Book(104, "English","Sakshi"));
        books.add(new Book(105, "Marathi","Shahrukh"));
        books.add(new Book(106, "Java Progamming","jannes bond"));
        books.add(new Book(107, "Science","Vividh"));
        books.add(new Book(108, "Maths","Kumar"));
        books.add(new Book(109, "English","Sakshi"));
        books.add(new Book(1010, "Marathi","Shahrukh"));
        out.println(books);

        //issuebook in labrary
        LinkedList<Book> issueBooks = new LinkedList<>();
        issueBooks.add(books.get(0));
        issueBooks.add(books.get(1));
        issueBooks.add(books.get(2));
        issueBooks.add(books.get(3));
        issueBooks.add(books.get(4));
        out.println(issueBooks);

        //
        Deque<Book> returnBook = new ArrayDeque<>();
        returnBook.push(books.get(0));
        returnBook.push(books.get(1));
        returnBook.push(books.get(2));
        returnBook.push(books.get(3));
        out.println(returnBook);

        PriorityQueue<Book> bookrequest = new PriorityQueue<>(Comparator.comparing(b-> b.Bookid));
        out.println(bookrequest+"1");
    }
}
