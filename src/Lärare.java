public class Lärare {

    //Instansvariabler
    public String namn;
    public int ålder;
    public String ämne;
    public int lön;

    //Konstruktör
    public Lärare(String namn, int ålder, String ämne, int lön) {
        this.namn = namn;
        this.ålder = ålder;
        this.ämne = ämne;
        this.lön = lön;
    }

    //Presentera
    void presentera(){
        System.out.println("\n---Lärare---");
        System.out.println("Namn: "+namn);
        System.out.println("Ålder: "+ålder);
        System.out.println("Ämne: "+ämne);
        System.out.println("Lön: "+lön);
    }

    //Byta namn
    void bytaNamn(String nyttNamn){
        namn=nyttNamn;
    }
}
