package jaf.theorie.inheritance.banking;

class Bank {
    private Konto[] konten;
    public Konto kontoAnlegen() {
        return new Konto();
    }
}

class Konto {
    public Konto() {}
}

class BankingSample {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Konto konto = bank.kontoAnlegen();
    }
}