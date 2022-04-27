package org.hibernate;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "person_table")
@Data
@Accessors(chain = true)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //    @Column(name = "f_name", nullable = false, insertable = false, updatable = false, unique = true) // first_Name
    private String firstName;
    //    @Column(name = "l_name")
    private String lastName;
    private Integer salary;
    @Column(name = "department_work")
    private String department;

}
