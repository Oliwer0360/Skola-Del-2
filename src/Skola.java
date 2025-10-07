public class Skola {
    public static void main(String[] args) {

        System.out.println("Välkommen till skolan!");

        //Studenter
        Studenter s1 = new Studenter("Charlie", 17, "E", "2:1");
        Studenter s2 = new Studenter("Marko", 18, "C", "2:1");
        Studenter s3 = new Studenter("Sixten", 13, "F", "2:3");

        //Lärare
        Lärare l1 = new Lärare("Harald", 56, "Fysik", 46000);
        Lärare l2 = new Lärare("Martin", 33, "Programmering", 50000);
        Lärare l3 = new Lärare("Jessica", 43, "Historia", 36000);

        //Vaktmästare
        Vaktmästare v1 = new Vaktmästare("Sixten", 46, "Idrottshallen", 14000);
        Vaktmästare v2 = new Vaktmästare("Olle", 39, "Köket", 16000);
        Vaktmästare v3 = new Vaktmästare("Nisse", 29, "Aulan", 18000);

    }
}