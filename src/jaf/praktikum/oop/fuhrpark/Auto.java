package jaf.praktikum.oop.fuhrpark;

import java.time.Duration;

/// ### Auto
/// Auto Klasse
/// ```
/// ,-----------------------------------------.
/// |Auto                                     |
/// |-----------------------------------------|
/// |-Marke: String                           |
/// |-Jahrgang: short                         |
/// |-Höchstgeschwindigkeit: short            |
/// |-KilometerStand: double                  |
/// |+berechneFahrzeit(distanz: int): Period  |
/// |+berechneFahrkosten(distanz: int): double|
/// |+addiereGefahreKilometer(distanz: int)   |
/// |-getPreisProKm(): double                 |
/// `-----------------------------------------'
/// ```
/// Höchstgeschwindigkeit in km/h
/// berechneFahrzeit: Zeit bei durchschnittlicher Geschwindigkeit von Höchstgeschwindigkeit/2
public class Auto {
    String marke;
    AutoTyp autoTyp;
    int jahrgang;
    int hoechstgeschwindigkeit;
    double kilometerStand;

    public record AutoData(String marke, AutoTyp autoTyp, int jahrgang, int hoechstgeschwindigkeit) {
        AutoData(String marke, AutoTyp autoTyp, int jahrgang) {
            this(marke, autoTyp, jahrgang, 150);
        }
    }

    public Auto(AutoData autoData) {
        this.marke = autoData.marke;
        this.autoTyp = autoData.autoTyp;
        this.jahrgang = autoData.jahrgang;
        this.hoechstgeschwindigkeit = autoData.hoechstgeschwindigkeit;
        this.kilometerStand = 0;
    }

    /**
     * Berechnet die Fahrzeit mit einer durchschnittlichen Geschwindigkeit der halben Höchstgeschwindigkeit.
     * @param distanz Distanz in km
     * @return Fahrzeit
     */
    public Duration berechneFahrzeit(double distanz) {
        return Duration.ofSeconds(Math.round(distanz / (hoechstgeschwindigkeit / 2.0) * 3600));
    }

    /**
     * Berechnet die Fahrkosten einer gefahrenen Distanz anhand der Kosten pro KM.
     * @param distanz Distanz in KM
     * @return Preis in Franken
     */
    public double berechneFahrkosten(double distanz) {
        return distanz * getPreisProKm();
    }

    /**
     * Addiert die Distanz in Km zu den gefahrenen Kilometern.
     * @param distanz Distanz in km
     */
    public void addiereGefahreneKm(double distanz) {
        this.kilometerStand += distanz;
    }

    /**
     * Kombination aus dem Berechnen der Fahrkosten und dem Addieren der gefahrenen Strecke.
     * @param distanz Distanz in km
     * @return Preis in Franken
     */
    public double rechneFahrtAb(double distanz) {
        addiereGefahreneKm(distanz);
        return berechneFahrkosten(distanz);
    }

    public double getKilometerStand() {
        return kilometerStand;
    }

    public AutoTyp getAutoTyp() {
        return autoTyp;
    }

    private double getPreisProKm() {
        return switch (autoTyp) {
            case SUV ->  2.50;
            case ELEKTRO -> 0.80;
            case TRANSPORTER -> 1.50;
            case KOMPAKT -> 0.65;
        };
    }
}
