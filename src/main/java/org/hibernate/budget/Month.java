package org.hibernate.budget;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "month_table")
@Data
@Accessors(chain = true)
public class Month {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String month;

//    @OneToMany(mappedBy = "month", cascade = {
//            CascadeType.DETACH,
//            CascadeType.PERSIST,
//            CascadeType.MERGE,
//            CascadeType.REFRESH
//    })
//    // Убрать для просмотра полной цепочки от года и месяца
//    @ToString.Exclude
//    private List<Budget> budgets;
}
