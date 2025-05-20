package fr.afpa.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Sensor {
    protected List<EventObserver> events = new ArrayList<EventObserver>();

    public void addEvent(EventObserver event) {
        events.add(event);
    }

    public void deleteEvent(EventObserver event) {
        events.remove(event);
    }

    public void notifyEvent(String message) {
        for (EventObserver eventObserver : events) {
            eventObserver.update(message);
        }
    }

    public abstract void detection();
}
