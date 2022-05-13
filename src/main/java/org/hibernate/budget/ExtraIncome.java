package org.hibernate.budget;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "extra_income_table")
@Data
@Accessors(chain = true)
public class ExtraIncome {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_extra_income")
    private String name;
    @Column(name = "value_extra_income")
    private String value;
    @ManyToOne
    @JoinColumn(name = "budget_id")
    @ToString.Exclude
    private Budget budget;
}
