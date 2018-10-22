package guru.springframework.sfgpetclinic.model;

public class Person extends BaseEntity {

    private String firsName;
    private String lastName;

    public String getFirstName() {
        return firsName;
    }

    public void setName(String name) {
        this.firsName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
