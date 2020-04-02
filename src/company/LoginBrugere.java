package company;

import java.util.ArrayList;

public class LoginBrugere {

    private String brugernavn;
    private String kodeord;
    public int brugerNiveau;
    ArrayList<LoginBrugere> loginliste = new ArrayList<>();

    public LoginBrugere(String brugernavn, String kodeord, int brugerNiveau) {
        this.brugernavn = brugernavn;
        this.kodeord = kodeord;
        this.brugerNiveau = brugerNiveau;
    }



    public LoginBrugere() {

    }

    public String getBrugernavn() {
        return brugernavn;
    }

    public void setBrugernavn(String brugernavn) {
        this.brugernavn = brugernavn;
    }

    public String getKodeord() {
        return kodeord;
    }

    public void setKodeord(String kodeord) {
        this.kodeord = kodeord;
    }

    public int getBrugerNiveau() {
        return brugerNiveau;
    }

    public void setBrugerNiveau(int brugerNiveau) {
        this.brugerNiveau = brugerNiveau;
    }
}
