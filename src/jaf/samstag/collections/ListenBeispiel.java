package jaf.samstag.collections;

import java.util.Arrays;

class WunschlisteKlassisch {
    private Object[] items = new Object[0];

    void hinzufuegen(Object item) {
        items = Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = item;
    }

    Object get(int index) {
        return items[index];
    }

    int size() {
        return items.length;
    }
}

interface Wichtigkeit {
    // 1 = wichtigstes, 5 = unwichtigstes
    int priority();
}

class WunschlisteGeneric<T extends Wichtigkeit> {
    private T[] items;

    void hinzufuegen(T item) {
        items = Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = item;
    }

    T get(int index) {
        return items[index];
    }

    public T mostWanted() {
        T mostWanted = null;
        for (T item : items) {
            if (mostWanted == null || item.priority() < mostWanted.priority()) {
                mostWanted = item;
            }
        }
        return mostWanted;
    }
}

class PriorityItems implements Wichtigkeit {
    private final int priority;
    private final String name;

    PriorityItems(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    @Override
    public int priority() {
        return priority;
    }
}

class Main {
    public static void main(String[] args) {
        WunschlisteGeneric<PriorityItems> wunschliste = new WunschlisteGeneric<>();
        wunschliste.hinzufuegen(new PriorityItems(1, "Pizza"));
        wunschliste.hinzufuegen(new PriorityItems(5, "Schokolade"));
        wunschliste.hinzufuegen(new PriorityItems(3, "Kaffee"));
        System.out.println(wunschliste.mostWanted());
    }
}
