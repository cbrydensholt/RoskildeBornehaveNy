package company;

public class ParentsContactList extends Barn {
    int tlfnr;
    public ParentsContactList(String firstName, String lastName, String birthday, int id, int tlfnr) {
        super(firstName, lastName, birthday, id);
        this.tlfnr = tlfnr;

            }

    @Override
    public String toString() {
        return "ParentsContactList{" +
                "tlfnr=" + tlfnr +
                '}';
    }

    public int getTlfnr() {
        return tlfnr;
    }

    public void setTlfnr(int tlfnr) {
        this.tlfnr = tlfnr;
    }
}

