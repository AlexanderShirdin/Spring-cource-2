package org.hibernate;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student")
@Data
@Accessors(chain = true)
public class StudentSQL{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String surname;
    private String name;
    @Column(name="[group]")
    private String group;
    private Date date;
}
