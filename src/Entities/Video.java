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
    public void play() {
        { System.out.println("Play canzone "+ getTitle());
        }
    }

    @Override
    public void piuVolume() {
        if (volume < 10) {
            volume++;
            System.out.println("piu volume " + volume);
        } else {
            System.out.println("max volume");
        }
    }

    @Override
    public void menoVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume abbassato " + volume);
        } else {
            System.out.println("min volume");
        }
    }
}
