package org.hibernate.budget;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "significant_expenses_table")
@Data
@Accessors(chain = true)
public class SignificantExpense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_extra_income")
    private String name;
    @Column(name = "value_extra_income")
    private String value;

    @ManyToOne
    @ToString.Exclude
    private Budget budget;
}