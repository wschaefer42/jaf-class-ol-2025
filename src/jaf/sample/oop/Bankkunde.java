package jaf.sample.oop;

public class Bankkunde {
    private String name;
    private Konto[] konten;

    public Bankkunde(String name) {
        this.name = name;
        // konten[0] -> new Konto(123);
        // konten[1] -> new Konto(456);
        // konten[2] -> null
        this.konten = new Konto[10];
    }

    public void addKonto(Konto konto) {
        for (int i = 0; i < konten.length; i++) {
            if (konten[i] == null) {
                konten[i] = konto;
                return;
            }
        }
    }
}
