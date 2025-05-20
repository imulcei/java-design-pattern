package fr.afpa;

import fr.afpa.observer.EmailAlert;
import fr.afpa.observer.EventObserver;
import fr.afpa.observer.RingAlarm;
import fr.afpa.observer.SendNotification;
import fr.afpa.observer.Sensor;
import fr.afpa.observer.SmokeSensor;
import fr.afpa.observer.TemperatureSensor;

public class AppObserver {
    public static void main(String[] args) {
        Sensor smokeSensor = new SmokeSensor();
        Sensor temperatureSensor = new TemperatureSensor();
        EventObserver notification = new SendNotification();
        EventObserver email = new EmailAlert();
        EventObserver alarm = new RingAlarm();
        smokeSensor.addEvent(notification);
        smokeSensor.addEvent(alarm);
        temperatureSensor.addEvent(email);
        temperatureSensor.addEvent(notification);
        smokeSensor.detection();
        temperatureSensor.detection();
    }
}
