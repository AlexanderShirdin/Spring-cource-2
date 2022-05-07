package org.hibernate.lesson5;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Child {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "child_section",
            joinColumns = @JoinColumn(name = "child_id"),
            inverseJoinColumns = @JoinColumn(name = "section_id")
    )
    private List<Section> sections;

}
