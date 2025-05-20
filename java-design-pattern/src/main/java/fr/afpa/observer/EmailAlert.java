package fr.afpa.observer;

public class EmailAlert implements EventObserver {

    @Override
    public void update(String message) {
        System.out.println("Envoi du mail: " + message);
    }

}
