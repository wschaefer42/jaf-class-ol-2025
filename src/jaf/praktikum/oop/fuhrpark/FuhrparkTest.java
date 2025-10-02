package jaf.praktikum.oop.fuhrpark;

public class FuhrparkTest {
    public static void main(String[] args) {
        Fuhrpark fuhrpark = new Fuhrpark("Fuhrpark");
        fuhrpark.hinzufuegenAuto(new Auto(new Auto.AutoData("BMW", AutoTyp.SUV, 2022)));
        fuhrpark.hinzufuegenAuto(new Auto(new Auto.AutoData("Audi", AutoTyp.ELEKTRO, 2020)));
        fuhrpark.hinzufuegenAuto(new Auto(new Auto.AutoData("Volkswagen", AutoTyp.KOMPAKT, 2018)));
        fuhrpark.hinzufuegenAuto(new Auto(new Auto.AutoData("Mercedes", AutoTyp.TRANSPORTER, 2016)));

        Auto auto = fuhrpark.reservierenAuto(AutoTyp.SUV);
        if (auto != null) {
            System.out.println(auto);
            double preis = auto.rechneFahrtAb(250);
            System.out.println("Preis: " + preis);
            if (fuhrpark.zurueckgebenAuto(auto)) {
                System.out.println("Auto zurückgegeben");
            }
        } else {
            System.out.println("Kein solcher Autotyp verfügbar");
        }
    }
}
