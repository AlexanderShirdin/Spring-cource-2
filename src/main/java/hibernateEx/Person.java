package hibernateEx;

import lombok.*;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "person_table")
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "f_name") // first_Name
    private String firstName;
    @Column(name = "l_name")
    private String lastName;
    private Integer salary;
    private String department;

}
