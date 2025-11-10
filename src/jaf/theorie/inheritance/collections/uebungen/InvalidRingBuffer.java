package jaf.theorie.inheritance.collections.uebungen;

public class InvalidRingBuffer<T extends Comparable<T>> {
    private final Object[] buffer;
    private int head = 0;
    private int tail = 0;

    public InvalidRingBuffer(int size) {
        buffer = new Object[size];
    }

    public void add(T item) {
        if (tail == buffer.length) {
            tail = 0;
        }
        buffer[tail++] = item;
    }

    @SuppressWarnings("unchecked")
    public T get() {
        if (head == tail) {
            return null;
        }
        return (T) buffer[head++];
    }

    static void main() {
        var rb = new InvalidRingBuffer<String>(10);
        rb.add("Pizza");
        rb.add("Burger");
        rb.add("Wurst");
    }
}
