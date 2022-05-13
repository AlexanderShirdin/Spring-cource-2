package org.hibernate.budget;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "budget_table")
@Data
@Accessors(chain = true)
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "salary_disney_monthly_8")
    private String disney8;
    @Column(name = "salary_disney_monthly_20")
    private String disney20;
    @Column(name = "pension_police_monthly_10")
    private String police10;
    @Column(name = "transport_daily_expenses")
    private String transport;
    @Column(name = "houses_bills_daily_expenses")
    private String housesBills;
    @Column(name = "foodstuff_daily_expenses")
    private String foodstuff;
    @Column(name = "communication_daily_expenses")
    private String communication;
    @Column(name = "payment_for_loan_pochtabank")
    private String paymentLoanPB;
    @Column(name = "remaining_debt_pochtabank")
    private String remainingDebtPB;
    @Column(name = "early_payment_pochtabank")
    private String earlyPaymentPB;

    @OneToMany(mappedBy = "budget", cascade = {
            CascadeType.DETACH,
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH
    })
    private List<SignificantExpense> significantExpenses;

    public void addAnswerToQuestion(SignificantExpense significantExpense) {
        if (significantExpenses == null) significantExpenses = new ArrayList<>();
        significantExpense.setBudget(this);
        significantExpenses.add(significantExpense);
    }

    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH
    })
    //Поставить для просмотра цепочки от года и месяца
//    @ToString.Exclude
    private Year year;

    @ManyToOne(cascade = {
            CascadeType.DETACH,
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH
    })
    //Поставить для просмотра цепочки от года и месяца
//    @ToString.Exclude
    private Month month;
}