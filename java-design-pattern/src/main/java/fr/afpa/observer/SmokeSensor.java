package fr.afpa.observer;

public class SmokeSensor extends Sensor {

    @Override
    public void detection() {
        System.out.println("Détecteur de fumée enclenché.");
        notifyEvent("Alerte : détection de fumée !");
    }

}
