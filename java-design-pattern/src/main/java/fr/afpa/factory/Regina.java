package fr.afpa.factory;

public class Regina implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Mozza, jambon, tomate, champignons.");
    }

    @Override
    public String toString() {
        return "Regina";
    }
}
