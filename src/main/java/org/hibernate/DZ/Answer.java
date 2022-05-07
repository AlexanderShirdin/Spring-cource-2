package org.hibernate.DZ;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Table(name = "answer_table")
@Data
@Accessors(chain = true)
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "content_answer")
    private String answer;

    @ManyToOne
    @JoinColumn(name = "question_id")
    @ToString.Exclude
    private Question question;
}