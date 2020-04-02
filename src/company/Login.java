package company;

import java.io.IOException;
import java.util.Scanner;

public class Login {

    Scanner input = new Scanner(System.in);
    LoginBrugere loginbrugere = new LoginBrugere();
    Menu menu = new Menu();
    Boolean again;
    jaNej janej = new jaNej();

    public void systemLogin() throws IOException {
        LoginBrugere administrator = new LoginBrugere("administrator", "1234", 1);
        LoginBrugere pædagog = new LoginBrugere("pædagog", "4321", 2);

        loginbrugere.loginliste.add(administrator);
        loginbrugere.loginliste.add(pædagog);

        System.out.println("Velkommen til Roskilde Børnehaves system");
        System.out.println("Der er to brugere oprettet på systemet, administrator og pædagog");
        System.out.println("Indtast venligst dit brugernavn");
        String brugernavn = input.nextLine();
        System.out.println("Indtast nu venligst dit kodeord");
        String kodeord = input.nextLine();

        for (LoginBrugere u : loginbrugere.loginliste) {
            if (brugernavn.equalsIgnoreCase(u.getBrugernavn()) && kodeord.equalsIgnoreCase(u.getKodeord())) {
                do {
                    switch (u.getBrugerNiveau()) {
                        case 1:
                            menu.administratorMenu();
                            break;

                        case 2:
                            menu.pædagogMenu();
                            break;
                    }
                    System.out.println("Vil du videre til menuen?");
                    again = janej.jaNej();
                } while (again);
            }
        }

    }

    }


