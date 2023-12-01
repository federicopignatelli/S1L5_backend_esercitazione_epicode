import Entities.Audio;
import Entities.Video;
import Entities.Immagine;
import Entities.ElementoMultimediale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannermultimediale = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Cosa vuoi creare: video, audio o immagine?");
            String tipo = scannermultimediale.nextLine();
            System.out.println("Inserisci il titolo di: " + tipo +" numero "+(i+1));
            String titolo = scannermultimediale.nextLine();

            if (tipo.equals("audio")){
                System.out.println("Inserisci la durata:");
                int durata = scannermultimediale.nextInt();
                System.out.println("Inserisci il volume:");
                int volume = scannermultimediale.nextInt();
                scannermultimediale.nextLine();
                elementi[i] = new Audio(titolo, durata, volume);
            }

            else if (tipo.equals("video")){
                System.out.println("Inserisci la durata:");
                int durata = scannermultimediale.nextInt();
                System.out.println("Inserisci il volume:");
                int volume = scannermultimediale.nextInt();
                System.out.println("Inserisci la luminosità:");
                int luminosita = scannermultimediale.nextInt();
                scannermultimediale.nextLine();
                elementi[i] = new Video(titolo, durata, volume, luminosita);
            }

            else if (tipo.equals("immagine")){
                System.out.println("Inserisci la luminosità:");
                int luminosita = scannermultimediale.nextInt();
                scannermultimediale.nextLine();
                elementi[i] = new Immagine(titolo, luminosita);
            }

            else {System.out.println("tipo inserito sbagliato");}

        }



    }
}
