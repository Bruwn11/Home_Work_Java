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

    public static Set<Integer> getUniqueElements(int[] numbers) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int number : numbers) {
            uniqueElements.add(number);
        }
        return uniqueElements;
    }

    public static Set<String> getOrderedUniqueElements(String[] numbers) {
        Set<String> getOrderedUniqueElements = new LinkedHashSet<>();
        Collections.addAll(getOrderedUniqueElements, numbers);
        return getOrderedUniqueElements;
    }

    public static Integer[] findNearestElements(int[] arr, int target) {
        TreeSet<Integer> set = new TreeSet<>();
        for (Integer el : arr) {
            set.add(el);
        }
        return new Integer[]{set.lower(target), set.higher(target)};
    }
}
