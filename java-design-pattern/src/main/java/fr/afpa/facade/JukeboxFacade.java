package fr.afpa.facade;

public class JukeboxFacade {
    private AudioPlayer audioPlayer = new AudioPlayer();
    private Amplifier amplifier = new Amplifier();
    private Speaker speaker = new Speaker();

    public JukeboxFacade() {
        this.audioPlayer = audioPlayer;
        this.amplifier = amplifier;
        this.speaker = speaker;
    }

    public void playMusic(String track) {
        amplifier.turnOn();
        amplifier.setVolume(5);
        speaker.connect();
        audioPlayer.load(track);
        audioPlayer.play();
        speaker.outputSound();
    }
}
