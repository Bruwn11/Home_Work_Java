package Less_51_52_ImmutableClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ImmutableClass {
    private final String name;
    private final List<Integer> numbers;
    private final CustomMutableClass mutableClass;

    public ImmutableClass(String name, List<Integer> numbers, CustomMutableClass mutableClass) {
        this.name = name;
        this.numbers = List.copyOf(numbers);
        this.mutableClass = new CustomMutableClass(mutableClass);
    }

    public String getName() {
        return name;
    }

    public List<Integer> getNumbers() {
        return new ArrayList<>(numbers);
    }

    public CustomMutableClass getMutableClass() {
        return new CustomMutableClass(mutableClass.getValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableClass that = (ImmutableClass) o;
        return Objects.equals(name, that.name) && Objects.equals(numbers, that.numbers) && Objects.equals(mutableClass, that.mutableClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, numbers, mutableClass);
    }
}
