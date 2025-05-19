package fr.afpa;

import fr.afpa.factory.MargaritaFactory;
import fr.afpa.factory.Pizza;
import fr.afpa.factory.PizzaFactory;

public class AppFactory {
    public static void main(String[] args) {
        PizzaFactory margarita = new MargaritaFactory();
        Pizza pizzaMargarita = margarita.create();
        System.out.println("Pizza créée: " + pizzaMargarita);
    }
}
