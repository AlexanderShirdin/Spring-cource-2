package org.hibernate;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "person_department")
@Data
@Accessors(chain = true)
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "department_name")
    private String name;
    @Column(name = "min_salary")
    private Integer minSalary;
    @Column(name = "max_salary")
    private Integer maxSalary;
    @OneToMany(mappedBy = "department",cascade = {
            CascadeType.DETACH,
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH
    })
    private List<Person> persons;

    public void addPersonToDepartment(Person person){
        if(persons==null) persons = new ArrayList<>();
        person.setDepartment(this);
        persons.add(person);
    }
}
