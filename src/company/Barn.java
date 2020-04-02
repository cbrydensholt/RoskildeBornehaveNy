package company;

public class Barn {

private static int count = 1;

private String birthday;
private String firstName;
private String lastName;
private int id;


public Barn(String firstName, String lastName, String birthday, int id){
this.firstName = firstName;
this.lastName = lastName;
this.birthday = birthday;
this.id = id;
}

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Barn{" +
                "birthday='" + birthday + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
