package Less_51_52_Generic;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();

        System.out.println("Проверка, пуст ли контейнер: " + stringBox.isEmpty());

        stringBox.set("Привет, мир!");
        System.out.println("Установка значения: " + stringBox.get());

        System.out.println("Проверка, пуст ли контейнер при установленном значении: " + stringBox.isEmpty());

        stringBox.clear();
        System.out.println("Очистка контейнера: " + stringBox.isEmpty());

        Box<Integer> integerBox = new Box<>();

        integerBox.set(42);
        System.out.println("Установка значения: " + integerBox.get());

        integerBox.clear();
        System.out.println("Очистка контейнера: " + integerBox.isEmpty());
    }
}
