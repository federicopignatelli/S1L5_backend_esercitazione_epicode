package Entities;

import Interfaces.Play;

public class Video extends ElementoMultimediale implements Play{
    private String titolo;
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String title, int durata, int volume, int luminosita) {
        super(title);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public String getTitle() {
        return titolo;
    }

    @Override
    public int getDurata() {
        return durata;
    }

    public void aumentaLuminosita() {
        // Implementazione aumentaLuminosita()
    }

    public void diminuisciLuminosita() {
        // Implementazione diminuisciLuminosita()
    }
}
