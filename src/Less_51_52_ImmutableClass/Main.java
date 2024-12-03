package Less_51_52_ImmutableClass;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        CustomMutableClass mutableObject = new CustomMutableClass(10);

        ImmutableClass immutableObject = new ImmutableClass("Jane", numbers, mutableObject);

        System.out.println("Имя до попытки изменения: " + immutableObject.getName());
        System.out.println("Список до попытки изменения: " + immutableObject.getNumbers());
        System.out.println("Значение поля изменяемого класса до попытки изменения: "
                + immutableObject.getMutableClass().getValue());

        immutableObject.getNumbers().add(4);
        mutableObject.setValue(20);

        System.out.println("Имя после попытки изменения: " + immutableObject.getName());
        System.out.println("Список после попытки изменения: " + immutableObject.getNumbers());
        System.out.println("Значение поля изменяемого класса после попытки изменения: "
                + immutableObject.getMutableClass().getValue());

        Map<ImmutableClass, String> map = new HashMap<>();
        map.put(immutableObject, "Строка");

        System.out.println("Значение элемента в Map-е: " + map.get(immutableObject));
    }
}
