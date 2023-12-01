package Interfaces;

public interface Play {

    void play();

    void piuVolume();

    void menoVolume();

    default void interrompi(){
        System.out.println("Riproduzione interrotta");
    };

}
