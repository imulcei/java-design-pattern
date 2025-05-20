package fr.afpa.observer;

public class CallAssistance implements EventObserver {

    @Override
    public void update(String message) {
        System.out.println("Appel: " + message);
    }

}
