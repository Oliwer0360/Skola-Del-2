import java.util.ArrayList;
import java.util.Scanner;

public class Skola {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("\nVälkommen till skolan!\n");

        //Studenter ArrayList
        ArrayList<Studenter> studenter = new ArrayList<>();
        studenter.add(new Studenter("Sixten", 12, "F", "2:3"));
        studenter.add(new Studenter("Marko", 17, "C", "2:1"));
        studenter.add(new Studenter("Charlie", 15, "E", "2:1"));

        for (int i = 0; i < studenter.size(); i++) {
            Studenter student = studenter.get(i);
            student.presentera();
        }

        //Lärare ArrayList
        ArrayList<Lärare> lärare = new ArrayList<>();
        lärare.add(new Lärare("Harald", 56, "Fysik", 46000));
        lärare.add(new Lärare("Martin", 33, "Programmering", 50000));
        lärare.add(new Lärare("Jessica", 43, "Historia", 36000));

        for (int i = 0; i <lärare.size(); i++) {
            Lärare lärare1 = lärare.get(i);
            lärare1.presentera();
        }

        //Vaktmästare ArrayList
        ArrayList<Vaktmästare> vaktmästare = new ArrayList<>();
        vaktmästare.add(new Vaktmästare("Sixten", 46, "Idrottshallen", 14000));
        vaktmästare.add(new Vaktmästare("Olle", 39, "Köket", 16000));
        vaktmästare.add(new Vaktmästare("Nisse", 29, "Aulan", 18000));

        for (int i = 0; i <vaktmästare.size(); i++) {
            Vaktmästare vaktmästare1 = vaktmästare.get(i);
            vaktmästare1.presentera();
        }
    }

    public static void bytaNamn(Scanner input, ArrayList<Studenter> grupp1, ArrayList<Lärare> grupp2, ArrayList<Vaktmästare> grupp3){

        int personVal = 0; //Val av person, s1, l2, v3 osv

        //While loopen kontrollerar så svaret är 1-3.
        boolean rättSvar = false;
        while (!rättSvar) {

            System.out.println("Vem vill du byta namn på?" +
                    "\n1. Student" +
                    "\n2. Lärare" +
                    "\n3. Vaktmästare" +
                    "\nSkriv 1-3: ");
            int gruppval = input.nextInt();
            input.nextLine();

            if (gruppval == 1) {
                System.out.println("\nVilken student vill du byta namn på?");
                personVal = input.nextInt();
                if ()
            }
            else if (gruppval == 2) {

            }
            else if (gruppval == 3) {

            }
            else {
                System.out.println("Ogilitgt svar! Försök igen.");
            }
        }


    }

}