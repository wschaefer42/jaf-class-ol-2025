package jaf.praktikum.oop.samples;

public class LoopSample {
    private int[] values;

    public LoopSample() {
        this.values = new int[100];
    }

    public void doSomething() {
        for (int j = 0; j < 10; j++) {
            int[] result = calculate(j);
            for (int i = 0; i < result.length; i++) {
                values[i+(j*10)] = result[i];
            }
        }
    }

    private int[] calculate(int start) {
        var result = new int[10];
        for (int i = 0; i < result.length; i++) {
            result[i] = start + (i * 2);
        }
        return result;
    }
}

