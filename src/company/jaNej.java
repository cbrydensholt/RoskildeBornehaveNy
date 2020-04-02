package company;

import java.util.Scanner;

public class jaNej {

public boolean jaNej(){
    boolean returnValue;
    String jaNej;
    char jn;
Scanner input = new Scanner(System.in);
do{
jaNej = input.next().toLowerCase();
jn = jaNej.charAt(0);
} while (jn != 'j' && jn != 'n');

if(jn=='j'){
    returnValue = true;
} else if(jn == 'n'){
returnValue = false;
}else{
    System.out.println("Det indtastede er forkert, prøv igen");
returnValue = false;
}
return returnValue;



}


}
