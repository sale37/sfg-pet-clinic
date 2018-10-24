package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name = "first_name")
    private String firsName;
    @Column(name = "last_name")
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
