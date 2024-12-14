package Less_57_58;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task_3_sort {
    public static void main(String[] args) {
        List<Person> group = new ArrayList<>();
        group.add(new Person("Bob", 32, 76));
        group.add(new Person("Alex", 34, 82));
        group.add(new Person("Alex", 34, 78));
        group.add(new Person("Bob", 56, 71));
        group.add(new Person("Tim", 23, 65));

        group.sort(new Comparator<Person>(){
            @Override
            public int compare(Person a, Person b){
                if(a.getName().compareTo(b.getName())==0){
                    if (a.getAge() == b.getAge()){
                        return Integer.compare(a.getWeight(),b.getWeight());
                    }else{
                        return Integer.compare(a.getAge(), b.getAge());
                    }
                }else {
                    return a.getName().compareTo(b.getName());
                }
            }
        });

        System.out.println("Сортировка: имя - возраст - вес: " + group);

        group.sort((a,b) -> {
            if(a.getName().compareTo(b.getName())==0){
                if (a.getWeight() == b.getWeight()){
                    return Integer.compare(a.getAge(),b.getAge());
                }else{
                    return Integer.compare(a.getWeight(), b.getWeight());
                }
            }else {
                return a.getName().compareTo(b.getName());
            }
        });

        System.out.println("Сортировка: имя - вес - возраст: " + group);


    }
}
