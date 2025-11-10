package jaf.theorie.inheritance.collections.introduction;

class WishlistClassic {
    private Object[] items = new Object[0];

    public void add(Object item) {
        items = java.util.Arrays.copyOf(items, items.length + 1);
        items[items.length - 1] = item;
    }

    public Object get(int index) {
        return items[index];
    }
}

class MainClassic {
    public static void main(String[] args) {
        WishlistClassic wishlist = new WishlistClassic();
        wishlist.add("Pizza");
        wishlist.add(12); // Integer
        wishlist.add(true); // Boolean
        Object item = wishlist.get(1);
        if (item instanceof String) {
            String s = (String) item;
        }
    }
}
