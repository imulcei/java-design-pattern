package fr.afpa.factory;

public abstract class PizzaFactory {
    public abstract Pizza createPizza();

    public Pizza create() {
        Pizza pizza = createPizza();
        pizza.prepare();
        return pizza;
    }
    
}
