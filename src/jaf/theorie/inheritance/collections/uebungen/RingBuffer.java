package jaf.theorie.inheritance.collections.uebungen;

import java.util.Arrays;

public class RingBuffer<T extends Comparable<T>> {
    private final Object[] buffer;
    private int head = 0;
    private int tail = 0;

    public RingBuffer(int size) {
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

    public void sort() {
        if (head == tail) {
            return;
        }
        if (head < tail) {
            Arrays.sort(buffer, head, tail);
        } else {
            var tmpList = new Object[buffer.length];
            System.arraycopy(buffer, head, tmpList, 0, buffer.length - head);
            System.arraycopy(buffer, 0, tmpList, buffer.length - head, tail);
            Arrays.sort(tmpList);
            System.arraycopy(tmpList, buffer.length - head, buffer, 0, tail);
            System.arraycopy(tmpList, 0, buffer, head, buffer.length - head);
        }
    }

    public void print() {
        for (int i = tail - 1; i >= head; i--) {
            System.out.print(buffer[i] + " ");
        }
        System.out.println();
    }

    static void main() {
        RingBuffer<String> ringBuffer = new RingBuffer<>(10);
        ringBuffer.add("Pizza");
        ringBuffer.add("Burger");
        ringBuffer.add("Wurst");
        ringBuffer.add("Salami");
        ringBuffer.add("Pasta");
        ringBuffer.add("Salat");
        ringBuffer.print();
        ringBuffer.sort();
        ringBuffer.print();
    }
}
