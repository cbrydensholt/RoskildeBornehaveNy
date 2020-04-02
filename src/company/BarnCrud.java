package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BarnCrud {
static List<Barn> barneListe = new ArrayList<>();
static List<ParentsContactList> parentsListe = new ArrayList<>();
Scanner input = new Scanner(System.in);
int repeat;




    public void opretbarn(){

        String birthday;
        String firstName;
        String lastName;
        int id;


        System.out.println("Hvad er barnets fornavn?");
        firstName = input.nextLine();
        System.out.println("Hvad er barnets efternavn?");
        lastName = input.nextLine();
        System.out.println("Hvad er barnets fødselsdag?");
        System.out.println("Følgende formatering ønskes: dd/mm/yyyy");
        birthday = input.nextLine();
        System.out.println("Hvad er barnets ID?");
        id = input.nextInt();

        Barn barn = new Barn(firstName, lastName, birthday, id);
        barneListe.add(barn);


        }











    public void deleteBarn(){

    int idchoice;

    //print liste af børn


        idchoice = input.nextInt();
        for(int i = 0; i< barneListe.size(); i++){
        if(idchoice == barneListe.get(i).getId()){
            System.out.println(barneListe.get(i).getFirstName() + " " + barneListe.get(i).getLastName() + "bliver nu slettet");
            barneListe.remove(barneListe.get(i));
        }
        }


    }

    public void opdaterBarn(){

    int idchoice;
    int switchchoice;
     //print liste af børn

        System.out.println("Her er en listen af børn der kan opdateres");
        idchoice = input.nextInt();

        for(Barn b : barneListe){
            if(idchoice == b.getId()){
                System.out.println(b.getFirstName());
                System.out.println(b.getLastName());
                System.out.println(b.getBirthday());
                System.out.println(b.getId());

                System.out.println("Hvilken information skal ændres?");
                switchchoice = input.nextInt();

                switch(switchchoice){

                    case 1:
                        System.out.println("Opdater first name");
                        b.setFirstName(input.next());
                        break;

                    case 2:
                        System.out.println("Opdater last name");
                        b.setLastName(input.next());
                        break;

                    case 3:
                        System.out.println("Opdater fødselsdag");
                        System.out.println("Følgende formattering ønskes: dd/mm/yyyy");
                        b.setBirthday(input.next());
                        break;
                    case 4:
                        System.out.println("Opdater ID");
                        b.setId(input.nextInt());
                        break;
                }

            }
        }
        System.out.println();


    }





}
