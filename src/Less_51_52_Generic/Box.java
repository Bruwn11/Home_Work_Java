package Less_51_52_Generic;

public class Box<T> {
    private T object;

    public T get() {
        return object;
    }

    public void set(T object) {
        this.object = object;
    }

    public boolean isEmpty() {
        return this.object == null;
    }

    public void clear() {
        object = null;
    }
}
