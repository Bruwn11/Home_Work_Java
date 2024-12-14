package Less_59_60_StreamAPI;
/*Напишите класс библиотека (Library), в которой будет хранится список книг
в HashMap с их id (Map<Integer, Book> books)*/

import java.util.*;
import java.util.stream.Collectors;

public class Library {
    Map<Integer, Book> books = new HashMap<>();

    public Library(Map<Integer, Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Библиотека{" +
                "книги=" + books +
                '}';
    }

    /**
     * Метод добавления книги в мапу библиотеки. Здесь id книги как ключ
     *
     * @param book - Объект Book.
     */
    public void addBook(Book book) {
        books.put(book.getId(), book);
    }


    /**
     * Метод получения книги по id из библиотеки.
     *
     * @param id - Integer.
     * @return - Book, книга. Если книги нет, то вернётся null.
     */
    public Book getBook(Integer id) {
        return books.getOrDefault(id, null);
    }

    /**
     * Метод получения списка всех книг с сортировкой по названию
     * @return - List<Book>, отсортированный по названию книг.
     */
    public List<Book> getBooks() {
        return books.values().stream()
                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
                .collect((Collectors.toList()));
    }

    /**
     * Метод выдаёт список книг, в зависимости от условия наличия
     * Книги отсортированы по названию
     * @param bool - Boolean bool. Есть(true) книга в библиотеке или её там нет(false).
     * @return - List<Book>.
     */
    public List<Book> getBooks(Boolean bool) {
        return books.values().stream()
                .filter(book -> book.getIsAvailable() == bool)
                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
                .collect((Collectors.toList()));
    }

    /**
     * Метод возвращает количество всех книг в библиотеке.
     * @return - Integer
     */
    public Integer getCountBooks(){
        return books.size();
    }

    /**
     * Метод возвращает количество книг в библиотеке, исходя из наличия.
     * @return - Integer
     */
    public Integer getCountBooks(Boolean bool){
        return (int) books.values().stream()
                .filter(s -> s.getIsAvailable() == bool).count();
    }

    /**
     * Метод для получения списка авторов, без дубликатов
     * @return - List<String>
     */
    public List<String> getAuthors(){
        return books.values().stream()
                .map(book ->book.getAuthor())
                .distinct()
                .sorted((author1, author2) -> author1.compareTo(author2))
                .collect((Collectors.toList()));
    }

    /**
     * Метод получения списка всех книг с сортировкой по компаратору
     * @param comparator - Comparator<Book> comparator
     * @return List<Book>, отсортированный по переданному компаратору.
     */
    public List<Book> getBooks(Comparator<Book> comparator) {
        return books.values().stream()
                .sorted(comparator)
                .collect((Collectors.toList()));
    }

    /**
     * Метод выдаёт список книг, в зависимости от условия наличия
     * Книги отсортированы по компаратору
     * @param comparator - Comparator<Book> comparator
     * @param bool - Boolean bool. Есть(true) книга в библиотеке или её там нет(false).
     * @return List<Book>, отсортированный по переданному компаратору.
     */
    public List<Book> getBooks(Comparator<Book> comparator, Boolean bool) {
        return books.values().stream()
                .filter(book -> book.getIsAvailable() == bool)
                .sorted(comparator)
                .collect((Collectors.toList()));
    }
}
