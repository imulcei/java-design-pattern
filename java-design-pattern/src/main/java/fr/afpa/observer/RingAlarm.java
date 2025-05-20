package fr.afpa.observer;

public class RingAlarm implements EventObserver {

    @Override
    public void update(String message) {
        System.out.println("L'alarme sonne: " + message);
    }

}
