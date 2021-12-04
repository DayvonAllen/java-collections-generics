package generics;

// Bounded type parameters example
// if the type extends from Comparable then we can use the methods from comparable
public class ComparableStore<T extends Comparable<T>> {
    private T store1;
    private T store2;

    public T getStore1() {
        return store1;
    }

    public void setStore1(T store1) {
        this.store1 = store1;
    }

    public T getStore2() {
        return store2;
    }

    public void setStore2(T store2) {
        this.store2 = store2;
    }
}
