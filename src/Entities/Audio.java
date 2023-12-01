package Entities;

import Interfaces.Play;

public class Audio extends ElementoMultimediale implements Play {
    protected int durata;
    protected int volume;

    public Audio(String title, int durata, int volume) {
        super(title);
        this.durata = durata;
        this.volume = volume;
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

    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Durata: " + durata + ", Volume: " + volume;
    }
}
