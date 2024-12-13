package Less_59_60_StreamAPI;
/*Напишите соответственно класс Book с полями
private final int id (обратите внимание, что поле финальное);
private String title;
private String author;
private boolean isAvailable (доступна ли книга для получения)*/

import java.util.Objects;

public class Book {
    private final int id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int id, String title, String author, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    public Book(Book book){
        this.id = book.id;
        this.title = book.title;
        this.author = book.author;
        this.isAvailable = book.isAvailable;
    }

    @Override
    public String toString() {
        return "Книга{" +
                "Название='" + title + '\'' +
                ", Автор='" + author + '\'' +
                ", Наличие=" + isAvailable +
                '}';
    }

    public Integer getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }

    public Boolean getIsAvailable(){
        return isAvailable;
    }

    public String getAuthor(){
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && isAvailable == book.isAvailable && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, isAvailable);
    }
}
