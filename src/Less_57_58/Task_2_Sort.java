package Less_57_58;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Task_2_Sort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bob","Jane","Alex","Tim","Miles");

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        }); // Создаём компаратор методе sort() и сразу же переопределяем его метод compare
        // при помощи анонимного класса

        System.out.println("Имена отсортированы в обратном порядке при помощи анонимного класса: " + names);

        names.sort((a, b) -> a.compareTo(b));
        // Создаём компаратор методе sort() и сразу же переопределяем его метод compare
        // при помощи лямбда-выражения

        System.out.println("Имена отсортированы в обратном порядке при помощи лямбда-выражения: " + names);

    }
}
