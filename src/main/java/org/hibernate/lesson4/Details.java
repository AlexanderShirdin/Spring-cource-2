package org.hibernate.lesson4;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.hibernate.lesson3.Person;

import javax.persistence.*;

@Entity
@Table(name = "person_details")
@Data
@Accessors(chain = true)
public class Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "number_phone")
    private String numberPhone;
    private String address;
    @OneToOne(mappedBy = "details", cascade = CascadeType.ALL)
    @ToString.Exclude
    private Person person;
}
