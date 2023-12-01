package Entities;

public abstract class ElementoMultimediale {
    protected String title;

    public ElementoMultimediale(String title){
    this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void play(){
        System.out.println("file inizio riproduzione" + getTitle());
    }
}
