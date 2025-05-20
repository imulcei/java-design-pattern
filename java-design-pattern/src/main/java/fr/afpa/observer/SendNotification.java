package fr.afpa.observer;

public class SendNotification implements EventObserver {

    @Override
    public void update(String message) {
        System.out.println("Notification push: " + message);
    }

}
