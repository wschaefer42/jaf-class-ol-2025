package jaf.theorie.inheritance.collections.introduction;

class WishlistGeneric <T extends Importantness> {
    private T[] items;
    public void add(T item) {
        items = java.util.Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = item;
    }

    public T get(int index) {
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

class PrioritizedItem implements Importantness {
    private final int priority;
    public PrioritizedItem(int priority) {
        this.priority = priority;
    }
    @Override
    public int priority() {
        return priority;
    }
}

class MainGeneric {
    public static void main(String[] args) {
        // var wishlist = new WishlistGeneric<String>();
        WishlistGeneric<PrioritizedItem> wishlistGeneric = new WishlistGeneric<>();
        // wishlistGeneric.add("Pizza");
        // wishlistGeneric.add(12);
        // String s = wishlistGeneric.get(1);
    }
}
