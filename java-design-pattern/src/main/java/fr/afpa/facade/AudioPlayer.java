package fr.afpa.facade;

public class AudioPlayer {
    /**
     * Méthode de chargement d'une piste
     */
    public void load(String track) {
        System.out.println("Loading track: " + track);
    }

    /**
     * Lance la lecture de d'une piste
     */
    public void play() {
        System.out.println("Playing audio...");
    }
}
