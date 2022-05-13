package org.hibernate.budget;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "year_table")
@Data
@Accessors(chain = true)
public class Year {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String year;

//    @OneToMany(mappedBy = "year", cascade = {
//            CascadeType.DETACH,
//            CascadeType.PERSIST,
//            CascadeType.MERGE,
//            CascadeType.REFRESH
//    })
//    // Убрать для просмотра полной цепочки от года и месяца
//    @ToString.Exclude
//    private List<Budget> budgets;
}
