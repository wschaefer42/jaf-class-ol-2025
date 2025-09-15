package jaf.sample.oop;

public class Bank {
    private Bankkunde[] kunden;

    public Bank() {
        this.kunden = new Bankkunde[100];
    }

    public Konto kontoAnlegen(Bankkunde kontoInhaber, Kontenart kontenart) {
        var konto = new Konto(kontoInhaber);
        konto.setKontenart(kontenart);
        return konto;
    }

    public Bankkunde kundeAnlegen(String name) {
        var kunde = new Bankkunde(name);
        for (int i = 0; i < kunden.length; i++) {
            if (kunden[i] == null) {
                kunden[i] = kunde;
                return kunde;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        var kunde1 = bank.kundeAnlegen("Werner");
        var konto1 = bank.kontoAnlegen(kunde1, Kontenart.PRIVATKONTO);
        var konto2 = bank.kontoAnlegen(kunde1, Kontenart.SPARKONTO);
        konto1.einzahlen(1000);
        konto1.kontoUebertrag(konto2, 100);
        System.out.println(konto1);
        System.out.println(konto2);
    }
}
