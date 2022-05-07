package org.hibernate.DZ;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "profile_table")
@Data
@Accessors(chain = true)
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String profile;

    @OneToMany(mappedBy = "profile", cascade = {
            CascadeType.DETACH,
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH
    })
    // Убрать для просмотра полной цепочки от профиля или уровня
    @ToString.Exclude
    private List<Question> questions;
}