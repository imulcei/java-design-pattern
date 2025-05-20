package fr.afpa.observer;

public class N02Sensor extends Sensor {

    @Override
    public void detection() {
        System.out.println("Détection de N02.");
        notifyEvent("Alerte : présence de N02 !");
    }

}