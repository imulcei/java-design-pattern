package fr.afpa.factory;

public class MargaritaFactory extends PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new Margarita();
    }

}
