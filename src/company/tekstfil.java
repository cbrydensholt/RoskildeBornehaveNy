package company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tekstfil {


    List<Barn> barneListeTekstfil;
    BarnCrud barncrud = new BarnCrud();
    ArrayList<Barn> barneliste = new ArrayList<>();
    ArrayList<ParentsContactList> parentsliste = new ArrayList<>();

   /* public void writeFile() {

        try {

            FileWriter filewriter1 = new FileWriter("barneoversigt.rtf");
            BufferedWriter bufferedwriter = new BufferedWriter(filewriter1);

            for (Barn b : BarnCrud.barneListe) {
                bufferedwriter.newLine();
                bufferedwriter.write(b.getFirstName() + "\t" + b.getLastName() + "\t" + b.getBirthday() + "\t" + b.getId());
            }
            bufferedwriter.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Det er sket en fejl, prøv igen");
        }


    }

    */

    public void writeFile() {

        try {

            FileWriter filewriter1 = new FileWriter("barneoversigt.rtf");
            BufferedWriter bufferedwriter = new BufferedWriter(filewriter1);

            for(int i = 0;i < barncrud.barneListe.size();i++) {
                if(i != 0) {
                    bufferedwriter.newLine();
                }
                Barn b = BarnCrud.barneListe.get(i);
                bufferedwriter.write(b.getFirstName() + "\t" + b.getLastName() + "\t" + b.getBirthday() + "\t" + b.getId());
            }
            bufferedwriter.close();

            FileWriter fileWriter2 = new FileWriter("parentscontact.rtf");
            BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);
            for(int i = 0;i < barncrud.parentsListe.size(); i++){
                if(i !=0) {
                    bufferedWriter2.newLine();
                }
                ParentsContactList p = BarnCrud.parentsListe.get(i);
                bufferedWriter2.write(p.getFirstName() + "\t" + p.getLastName() + "\t" + p.getBirthday() + "\t" + p.getId() + "\t" + p.getTlfnr());
            }
            bufferedWriter2.close();

            /* for (Barn b : BarnCrud.barneListe) {
                bufferedwriter.newLine();
                bufferedwriter.write(b.getFirstName() + "\t" + b.getLastName() + "\t" + b.getBirthday() + "\t" + b.getId());
            }
            bufferedwriter.close(); */

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Det er sket en fejl, prøv igen");
        }


    }







    public void readFile() throws IOException {
        String birthday = null;
        String firstName = null;
        String lastName = null;
        int id = 0;

        String filelocation = "barneoversigt.rtf";

        try {
            Scanner scanner = new Scanner(new File(filelocation));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                //System.out.println("Line: " + line);
                String[] split = line.split("\\s");
                firstName = split[0];
                lastName = split[1];
                birthday = split[2];
                id = Integer.parseInt(split[3]);

                Barn barneliste = new Barn(firstName, lastName, birthday, id);
                BarnCrud.barneListe.add(barneliste);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readFileParents() throws IOException {
        String birthday = null;
        String firstName = null;
        String lastName = null;
        int id = 0;
        int tlfnr;

        String filelocationparents = "parentscontact.rtf";

        try {
            Scanner scanner = new Scanner(new File(filelocationparents));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                //System.out.println("Line: " + line);
                String[] split = line.split("\\s");
                firstName = split[0];
                lastName = split[1];
                birthday = split[2];
                id = Integer.parseInt(split[3]);
                tlfnr = Integer.parseInt(split[4]);

                ParentsContactList parentsliste = new ParentsContactList(firstName, lastName, birthday, id, tlfnr);
                BarnCrud.parentsListe.add(parentsliste);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }











    public void printliste(){

        System.out.printf("%-12s", "First Name");
        System.out.printf("%-12s", "Last Name");
        System.out.printf("%-12s", "Birthday");
        System.out.printf("%-12s", "ID");
        System.out.println();

        for(Barn b : BarnCrud.barneListe){

            System.out.printf("%-12s", b.getFirstName());
            System.out.printf("%-12s", b.getLastName());
            System.out.printf("%-12s", b.getBirthday());
            System.out.printf("%-12s", b.getId());
            System.out.println();


        }



    }



}




















