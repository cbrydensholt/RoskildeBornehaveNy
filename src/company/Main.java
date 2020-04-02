package company;

import java.io.IOException;

public class Main {

    //to-do, login, menu uddybninger
    //hvad sker der hvis man skriver forkert?
    //evt nedarvning

    public static void main(String[] args) throws IOException {
	// write your code here

        BarnCrud barnecrud = new BarnCrud();
        Menu menu = new Menu();
        tekstfil tekstFil = new tekstfil();
        Login login = new Login();
        //tekstFil.readFile();
        tekstFil.readFile();
        tekstFil.readFileParents();
        login.systemLogin();
        tekstFil.writeFile();




    }
}
