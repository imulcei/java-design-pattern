package fr.afpa.observer;

public class TemperatureSensor extends Sensor {

    @Override
    public void detection() {
        System.out.println("Température anormale détectée.");
        notifyEvent("Alerte : température élevée !");
    }

}
