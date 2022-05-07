package org.hibernate.DZ;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "level_table")
@Data
@Accessors(chain = true)
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "level_name")
    private String level;

    @OneToMany(mappedBy = "level", cascade = {
            CascadeType.DETACH,
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH
    })
    // Убрать для просмотра полной цепочки от профиля или уровня
    @ToString.Exclude
    private List<Question> questions;
}