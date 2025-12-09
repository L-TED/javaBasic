package day04.theory.ex02;

public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    T getValue() {
        return this.value;
    }

    void setValue(T newValue) {
        this.value = newValue;
    }
}
