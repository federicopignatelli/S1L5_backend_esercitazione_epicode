package Entities;

import Interfaces.Luminosita;

public class Immagine extends ElementoMultimediale implements Luminosita {
    public int luminosita;
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita= luminosita;
    }

    @Override
    public void piuLuminosita() {
        if (luminosita < 10) {
            luminosita++;
            System.out.println("luminosità aumentata" + luminosita);
        } else {
            System.out.println("luminosità max");
        }
    }
    @Override
    public void menoLuminosita() {
        if (luminosita > 0) {
            luminosita--;
            System.out.println("luminosità diminuita" + luminosita);
        } else {
            System.out.println("luminosità min");
        }
    }
    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Luminosità: " + luminosita;
    }
}
