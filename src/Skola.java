import java.util.ArrayList;
import java.util.Scanner;

public class Skola {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean avsluta = false;

        System.out.println("\nVälkommen till skolan!\n");

        //Studenter ArrayList
        ArrayList<Studenter> studenter = new ArrayList<>();
        studenter.add(new Studenter("Sixten", 12, "F", "2:3"));
        studenter.add(new Studenter("Marko", 17, "C", "2:1"));
        studenter.add(new Studenter("Charlie", 15, "E", "2:1"));

        //Lärare ArrayList
        ArrayList<Lärare> lärare = new ArrayList<>();
        lärare.add(new Lärare("Harald", 56, "Fysik", 46000));
        lärare.add(new Lärare("Martin", 33, "Programmering", 50000));
        lärare.add(new Lärare("Jessica", 43, "Historia", 36000));

        //Vaktmästare ArrayList
        ArrayList<Vaktmästare> vaktmästare = new ArrayList<>();
        vaktmästare.add(new Vaktmästare("Sixten", 46, "Idrottshallen", 14000));
        vaktmästare.add(new Vaktmästare("Olle", 39, "Köket", 16000));
        vaktmästare.add(new Vaktmästare("Nisse", 29, "Aulan", 18000));

        while (true){

            //Loopar igenom för att printa ut
            for (int i = 0; i < studenter.size(); i++) {
                Studenter student = studenter.get(i);
                student.presentera();
            }

            for (int i = 0; i <lärare.size(); i++) {
                Lärare lärare1 = lärare.get(i);
                lärare1.presentera();
            }

            for (int i = 0; i <vaktmästare.size(); i++) {
                Vaktmästare vaktmästare1 = vaktmästare.get(i);
                vaktmästare1.presentera();
            }

            avsluta = bytaNamn(input, studenter, lärare, vaktmästare);
            if (avsluta){
                break;
            }

        }

    }

    public static boolean bytaNamn(Scanner input, ArrayList<Studenter> grupp1, ArrayList<Lärare> grupp2, ArrayList<Vaktmästare> grupp3){

        int personVal = 0; //Val av person, s1, l2, v3 osv
        String nyttNamn;

        //While loopen kontrollerar så svaret är 1-3.
        boolean rättSvar = false;
        while (!rättSvar) {

            System.out.println("\nVem vill du byta namn på?" +
                    "\n0. Avsluta" +
                    "\n1. Student" +
                    "\n2. Lärare" +
                    "\n3. Vaktmästare" +
                    "\nSkriv 1-3: ");
            int gruppval = input.nextInt();
            input.nextLine();

            if (gruppval == 1) {
                System.out.println("\nVilken student vill du byta namn på? 1-3");
                personVal = input.nextInt();
                input.nextLine();

                System.out.println("Vad ska det nya namnet vara?");
                nyttNamn = input.nextLine();

                grupp1.get(personVal-1).bytaNamn(nyttNamn);

                System.out.println("Namnet har ändrats till: "+nyttNamn);
                rättSvar = true;
            }
            else if (gruppval == 2) {
                System.out.println("\nVilken lärare vill du byta namn på? 1-3");
                personVal = input.nextInt();
                input.nextLine();

                System.out.println("Vad ska det nya namnet vara?");
                nyttNamn = input.nextLine();

                grupp2.get(personVal-1).bytaNamn(nyttNamn);

                System.out.println("Namnet har ändrats till: "+nyttNamn);
                rättSvar = true;
            }
            else if (gruppval == 3) {
                System.out.println("\nVilken vaktmästare vill du byta namn på? 1-3");
                personVal = input.nextInt();
                input.nextLine();

                System.out.println("Vad ska det nya namnet vara?");
                nyttNamn = input.nextLine();

                grupp3.get(personVal-1).bytaNamn(nyttNamn);

                System.out.println("Namnet har ändrats till: "+nyttNamn);
                rättSvar = true;
            }
            else if (gruppval == 0) {
                System.out.println("Avslutar programmet.");
                return true;
            }
            else {
                System.out.println("Ogilitgt svar! Försök igen.");
            }
        }
        return false;
    }
}