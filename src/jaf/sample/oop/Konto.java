package jaf.sample.oop;

public class Konto {
    private double saldo;
    private Bankkunde kontoInhaber;
    private float zinsSatz;
    private Kontenart kontenart = Kontenart.PRIVATKONTO;

    public Konto() {
        this(null);
    }

    public Konto(Bankkunde kontoInhaber) {
        this(kontoInhaber, 0.00f);
    }

    public Konto(Bankkunde kontoInhaber, float zinsSatz) {
        this.kontoInhaber = kontoInhaber;
        this.zinsSatz = zinsSatz;
        this.saldo = 0;
        if (kontoInhaber != null) {
            kontoInhaber.addKonto(this);
        }
    }

    public boolean auszahlen(double betrag) {
        if (saldo < betrag) {
            return false;
        }
        if (kontenart == Kontenart.SPARKONTO && betrag > 1000) {
            return false;
        }
        saldo -= betrag;
        return true;
    }

    public void einzahlen(double betrag) {
        saldo += betrag;
    }

    public boolean kontoUebertrag(Konto konto, double betrag) {
        konto.einzahlen(betrag);
        this.auszahlen(betrag);
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public float getZinsSatz() {
        return zinsSatz;
    }

    public void setZinsSatz(float zinsSatz) {
        if (zinsSatz >= 0 && zinsSatz <= 10) {
            this.zinsSatz = zinsSatz;
        }
    }

    public Kontenart getKontenart() {
        return kontenart;
    }

    public void setKontenart(Kontenart kontenart) {
        this.kontenart = kontenart;
    }

    @Override
    public String toString() {
        return String.format("Inhaber: %s, Saldo %f", kontoInhaber, saldo);
    }
}
