package guru.springframework.sfgpetclinic.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

    public Person(Long id, String firsName, String lastName) {
        super(id);
        this.firsName = firsName;
        this.lastName = lastName;
    }

    @Column(name = "first_name")
    private String firsName;
    @Column(name = "last_name")
    private String lastName;

}
