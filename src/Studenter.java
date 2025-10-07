import java.util.ArrayList;

public class Studenter {

    //Instansvariabler
    public String namn;
    public int ålder;
    public String betyg;
    public String klass;

    //Konstruktör
    public Studenter(String namn, int ålder, String betyg, String klass) {
        this.namn = namn;
        this.ålder = ålder;
        this.betyg = betyg;
        this.klass = klass;
    }

    //Presentera
    public void presentera(){
        System.out.println("\n---Student---");
        System.out.println("Namn: "+namn+" | Ålder: "+ålder+" | Betyg: "+betyg+" | Klass: "+klass);

    }

    //Byta namn
    public void bytaNamn(String nyttNamn){
        namn=nyttNamn;
    }
}
