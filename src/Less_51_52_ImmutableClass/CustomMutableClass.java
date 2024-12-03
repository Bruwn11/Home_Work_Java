package Less_51_52_ImmutableClass;

public class CustomMutableClass {
    private int value;

    public CustomMutableClass(int value) {
        this.value = value;
    }

    public CustomMutableClass(CustomMutableClass other) {
        this.value = other.value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
