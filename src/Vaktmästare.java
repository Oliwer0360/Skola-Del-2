public class Vaktmästare {

    //Instansvariabler
    public String namn;
    public int ålder;
    public String avdelning;
    public int lön;

    // Konstruktör
    public Vaktmästare(String namn, int ålder, String avdelning, int lön) {
        this.namn = namn;
        this.ålder = ålder;
        this.avdelning = avdelning;
        this.lön = lön;
    }

    //Presentera
    void presentera(){
        System.out.println("\n---Vaktmästare---");
        System.out.println("Namn: "+namn);
        System.out.println("Ålder: "+ålder);
        System.out.println("Avdelning: "+avdelning);
        System.out.println("Lön: "+lön);
    }

    //Byta namn
    void bytaNamn(String nyttNamn) {
        namn = nyttNamn;
    }
}