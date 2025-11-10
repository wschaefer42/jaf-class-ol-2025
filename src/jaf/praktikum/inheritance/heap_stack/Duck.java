package jaf.praktikum.inheritance.heap_stack;

class Duck {
    private int size;
    public Duck(int size) {
        this.size = size;
    }
    public Duck() {
        this(27);
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}

class DuckMain {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Duck duck2 = duck;
        duck2.setSize(100);
        duck.setSize(10);
        new DuckMain().changeSize(duck);
        // Size = 100
        System.out.println(duck.getSize());
        new DuckMain().addValue(10);
    }
    private void changeSize(Duck duck) {
        duck.setSize(100);
    }
    private void addValue(int value) {
        value += 10;
        System.out.println(value);
    }
}
