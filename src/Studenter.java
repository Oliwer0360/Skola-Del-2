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
    void presentera(){
        System.out.println("\n---Studenter---");
        System.out.println("Namn: "+namn);
        System.out.println("Ålder: "+ålder);
        System.out.println("Betyg: "+betyg);
        System.out.println("Klass: "+klass);
    }

    //Byt namn
    void bytaNamn(String nyttNamn){
        namn=nyttNamn;
    }
}
