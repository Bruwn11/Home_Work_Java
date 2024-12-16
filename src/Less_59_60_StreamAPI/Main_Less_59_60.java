package Less_59_60_StreamAPI;

import java.util.*;

public class Main_Less_59_60 {
    public static void main(String[] args) {
        Book book1 = new Book(324, "Service", "Tom", true);
        Book book2 = new Book(2213, "King", "Jane", false);
        Book book3 = new Book(104, "Money", "Adrian", true);
        Book book4 = new Book(9185, "Math", "Anderson", true);
        Book book5 = new Book(61, "Economist", "Veronica", false);
        Book book6 = new Book(998, "Times", "Jane", true);

        Library library = new Library(new HashMap<>());
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        System.out.println(library.getBook(76));
        System.out.println(library.getBook(998));

        System.out.println(library.getBooks());
        System.out.println(library.getBooks(false));

        System.out.println(library.getCountBooks());
        System.out.println(library.getCountBooks(true));

        System.out.println(library.getAuthors());

        System.out.println(library.getBooks((o1, o2) -> {
            if (o1.getAuthor().compareTo(o2.getAuthor()) == 0) {
                return o1.getTitle().compareTo(o2.getTitle());
            } else {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        }));

        System.out.println(library.getBooks((o1, o2) -> {
            if (o1.getTitle().compareTo(o2.getTitle()) == 0) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            } else {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        }, true));

        System.out.println("Собираем в карту по доступности книг: " + '\n' +
                library.partitioningByBook().get(false));

        System.out.println("Собираем в карту по автору: " + '\n' + library.groupingByAuthors());

    }
}
