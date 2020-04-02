package company;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    BarnCrud barnecrud = new BarnCrud();
    tekstfil textfil = new tekstfil();
    Scanner input = new Scanner(System.in);
    int valg;

    public void administratorMenu() throws IOException {
        System.out.println("Som administrator har du adgang til alle funktioner i systemet");
        System.out.println("Tryk 1 for at oprette et nyt barn i børneregisteret");
        System.out.println("Tryk 2 for at slette et barn i børneregisteret");
        System.out.println("Tryk 3 for at opdatere et barn i børneregisteret");
        System.out.println("Tryk 4 for at printe børneregisteret");
        System.out.println("Tryk 5 for at slukke systemet");


        valg = input.nextInt();

        switch (valg) {

            case 1:
                System.out.println("Du opretter ny et nyt barn i systemet");
                barnecrud.opretbarn();
                break;

            case 2:
                System.out.println("Du kan nu slette et barn i systemet, skriv ID'et på barnet der skal slettes");
                textfil.printliste();
                barnecrud.deleteBarn();
                break;
            case 3:
                System.out.println("Du kan nu opdatere et barn i systemet");
                textfil.printliste();
                barnecrud.opdaterBarn();
                break;
            case 4:
                System.out.println("Her er en liste af børn i registeret");
                textfil.printliste();
                break;

            case 5:
                break;

        }

    }

    public void pædagogMenu() {

        System.out.println("Som pædagog har du adgang til et begrænset antal funktioner i systemet");
        System.out.println("Tryk 1 for at oprette et nyt barn i børneregisteret");
        System.out.println("Tryk 2 for at opdatere et barn i børneregisteret");
        System.out.println("Tryk 3 for at printe børneregisteret");
        System.out.println("Tryk 4 for at slukke systemet");


        valg = input.nextInt();

        switch (valg) {

            case 1:
                System.out.println("Du opretter ny et nyt barn i systemet");
                barnecrud.opretbarn();
                break;

            case 2:
                System.out.println("Du kan nu opdatere et barn i systemet");
                textfil.printliste();
                barnecrud.opdaterBarn();
                break;
            case 3:
                System.out.println("Her er en liste af børn i registeret");
                textfil.printliste();
                break;

            case 4:
                System.exit(0);

        }


    }
}
