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
    public void presentera(){
        System.out.println("\n---Lärare---");
        System.out.println("Namn: "+namn+" | Ålder: "+ålder+" | Ämne: "+ämne+" | Lön: "+lön);
    }

    //Byta namn
    public void bytaNamn(String nyttNamn){
        namn=nyttNamn;
    }
}
