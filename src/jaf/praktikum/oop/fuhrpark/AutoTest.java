package jaf.praktikum.oop.fuhrpark;

import java.time.Duration;

public class AutoTest {
    public static void main(String[] args) {
        Auto auto = new Auto(new Auto.AutoData("BMW", AutoTyp.SUV, 2022));
        Duration fahrzeit = auto.berechneFahrzeit(200);
        double fahrpreis = auto.berechneFahrkosten(200);
        auto.addiereGefahreneKm(200);
        double kilometerStand = auto.getKilometerStand();
        System.out.println("Fahrzeit: " + fahrzeit.toMinutes() + " Fahrpreis: " + fahrpreis + " KilometerStand: " + kilometerStand);
    }
}
