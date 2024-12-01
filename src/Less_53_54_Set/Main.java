package Less_53_54_Set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 1, 4};
        System.out.println(getUniqueElements(numbers));

        String[] words = {"apple", "banana", "apple", "cherry", "banana"};
        Set<String> result = getOrderedUniqueElements(words);
        System.out.println(result);

        int[] numbers2 = {4, 7, 9, 10, 11};
        int target = 11;
        Integer[] resIntArr = findNearestElements(numbers2, target);
        System.out.println(Arrays.toString(resIntArr));
    }

    /**
     * Метод, который принимает массив целых чисел
     * и возвращает список уникальных чисел, порядок не важен
     * @param numbers массив целых чисел
     * @return возвращает список уникальных чисел, порядок не важен
     */
    public static Set<Integer> getUniqueElements(int[] numbers) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int number : numbers) {
            uniqueElements.add(number);
        }
        return uniqueElements;
    }

    /**
     *  Метод, который возвращает уникальные строки в порядке их появления
     * @param numbers строковый массив
     * @return Set<String>
     */
    public static Set<String> getOrderedUniqueElements(String[] numbers) {
        Set<String> getOrderedUniqueElements = new LinkedHashSet<>();
        Collections.addAll(getOrderedUniqueElements, numbers);
        return getOrderedUniqueElements;
    }

    /**
     * Метод, который принимает массив чисел и число-цель,
     * возвращает массив из двух чисел: ближайший меньший и больший.
     * @param arr int[] arr
     * @param target int target
     * @return Integer[]
     */
    public static Integer[] findNearestElements(int[] arr, int target) {
        TreeSet<Integer> set = new TreeSet<>();
        for (Integer el : arr) {
            set.add(el);
        }
        return new Integer[]{set.lower(target), set.higher(target)};
    }
}
