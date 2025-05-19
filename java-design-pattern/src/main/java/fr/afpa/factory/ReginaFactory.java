package fr.afpa.factory;

public class ReginaFactory extends PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new Regina();
    }

}
