package Less_57_58;

import java.util.Arrays;
import java.util.List;

public class Task_4_StreamAPI {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "fig", "date", "kiwi", "grape");


       List<String> newList = words.stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.length() > 4)
                .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                .toList();

        System.out.println(words);
        System.out.println(newList);
    }
}
