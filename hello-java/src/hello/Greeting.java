package hello;

public class Greeting {
    private final String lang;

    public Greeting(String lang) {
        this.lang = lang;
    }
    public String sayHello() {
        return switch(lang) {
            case "de" -> "Hallo";
            case "ch" -> "Grüzi";
            case "at" -> "Servus";
            case "en" -> "Hello";
            default -> "Hi";
        };
    }
}