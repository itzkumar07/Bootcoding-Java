package librarymanagementsystem;

import java.util.*;

import static java.lang.System.*;

public class LibraryManagementSystem {
    public static void main(String[] args) {

        // List initialization using ArrayList
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(101, "Java Programming", "James Bond"));
        books.add(new Book(102, "Science", "Vividh"));
        books.add(new Book(103, "Maths", "Kumar"));
        books.add(new Book(104, "English", "Sakshi"));
        books.add(new Book(105, "Marathi", "Shahrukh"));
        books.add(new Book(106, "Java Programming", "James Bond"));
        books.add(new Book(107, "Science", "Vividh"));
        books.add(new Book(108, "Maths", "Kumar"));
        books.add(new Book(109, "English", "Sakshi"));
        books.add(new Book(110, "Marathi", "Shahrukh"));
        out.println("Book List: " + books);

        // LinkedList to store issued books
        LinkedList<Book> issueBooks = new LinkedList<>();
        issueBooks.add(books.get(0));
        issueBooks.add(books.get(1));
        issueBooks.add(books.get(2));
        issueBooks.add(books.get(3));
        issueBooks.add(books.get(4));
        out.println("Issued Books: " + issueBooks);

        out.println();

        // Stack to handle returned books
        Stack<Book> returnBook = new Stack<>();
        returnBook.push(books.get(0));
        returnBook.push(books.get(1));
        returnBook.push(books.get(2));
        returnBook.push(books.get(3));
        out.println("Returned Books: " + returnBook);

        // PriorityQueue to manage book requests based on Book ID
        PriorityQueue<Book> bookRequest = new PriorityQueue<>(Comparator.comparing(b -> b.Bookid));
        out.println("Book Requests (Empty Initially): " + bookRequest);

        out.println();

        // ArrayDeque for student queue management
        Deque<Student> studentQueue = new ArrayDeque<>();
        studentQueue.add(new Student(1, "Kumar"));
        studentQueue.add(new Student(2, "Vividh"));
        studentQueue.add(new Student(3, "Dushant"));
        studentQueue.add(new Student(4, "Himanshu"));
        studentQueue.add(new Student(5, "Dhiraj"));
        out.println("First student in queue (poll): " + studentQueue.poll());
        out.println("Next student in queue (pop): " + studentQueue.pop());

        out.println();

        // HashSet to store unique book IDs
        Set<Integer> uniqueBooks = new HashSet<>();
        uniqueBooks.add(101);
        uniqueBooks.add(102);
        uniqueBooks.add(103);
        uniqueBooks.add(104);
        uniqueBooks.add(105);
        uniqueBooks.add(106);
        uniqueBooks.add(107);
        uniqueBooks.add(108);
        uniqueBooks.add(108);  // Duplicate ignored
        uniqueBooks.add(110);
        out.println("Unique Book IDs: " + uniqueBooks);

        out.println();

        // LinkedHashSet to maintain unique student names
        Set<String> studentNames = new LinkedHashSet<>();
        studentNames.add("Kumar");
        studentNames.add("Dushant");
        studentNames.add("Dushant"); // Duplicate ignored
        studentNames.add("Vividh");
        studentNames.add("Dhiraj");
        out.println("Unique Student Names: " + studentNames);

        out.println();

        // TreeSet to store sorted book IDs
        Set<Integer> sortedBookId = new TreeSet<>();
        sortedBookId.add(102);
        sortedBookId.add(104);
        sortedBookId.add(103);
        sortedBookId.add(107);
        sortedBookId.add(108);
        sortedBookId.add(109);
        sortedBookId.add(102); // Duplicate ignored
        sortedBookId.add(101);
        sortedBookId.add(110);
        out.println("Sorted Book IDs using TreeSet: " + sortedBookId);

        out.println();

        // HashMap to store book locations
        Map<Integer, String> booksLocation = new HashMap<>();
        booksLocation.put(101, "Section-1");
        booksLocation.put(102, "Section-2");
        booksLocation.put(103, "Section-3");
        booksLocation.put(104, "Section-4");
        booksLocation.put(105, "Section-5");
        out.println("Book Location (Book ID 102): " + booksLocation.get(102));

        out.println();

        // LinkedHashMap to store student fines (Maintains insertion order)
        LinkedHashMap<String, Double> studentFine = new LinkedHashMap<>();
        studentFine.put("Vividh", 100.00);
        studentFine.put("Himanshu", 490.50);
        studentFine.put("Dushant", 5060.30);
        studentFine.put("Kumar", 1900.60);
        out.println("Fine for Kumar: " + studentFine.get("Kumar"));

        out.println();

        // TreeMap to store book availability in sorted order
        TreeMap<Integer, String> bookAvailability = new TreeMap<>();
        bookAvailability.put(101, "Available");
        bookAvailability.put(102, "Issued");
        bookAvailability.put(103, "Available");
        bookAvailability.put(104, "Issued");
        bookAvailability.put(105, "Available");

        // Displaying sorted book availability
        out.println("Sorted Book Availability using TreeMap: " + bookAvailability);
    }
}
