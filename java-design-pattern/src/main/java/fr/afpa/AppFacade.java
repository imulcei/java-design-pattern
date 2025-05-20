package fr.afpa;

import fr.afpa.facade.JukeboxFacade;

public class AppFacade {
    public static void main(String[] args) {
        JukeboxFacade jukebox = new JukeboxFacade();
        jukebox.playMusic("Skibidi");
    }
}
