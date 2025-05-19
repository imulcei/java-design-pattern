package fr.afpa.factory;

public class Margarita implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Mozza, tomate, basilic.");
    }

    @Override
    public String toString() {
        return "Margarita";
    }
}
