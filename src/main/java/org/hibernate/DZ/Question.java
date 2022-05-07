package org.hibernate.DZ;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "question_table")
@Data
@Accessors(chain = true)
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "content_question")
    private String question;

    @OneToMany(mappedBy = "question", cascade = {
            CascadeType.DETACH,
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.REFRESH
    })
    private List<Answer> answers;

    public void addAnswerToQuestion(Answer answer) {
        if (answers == null) answers = new ArrayList<>();
        answer.setQuestion(this);
        answers.add(answer);
    }

    @ManyToOne
    //Поставить для просмотра цепочки от профиля или уровня
//    @ToString.Exclude
    private Profile profile;

    @ManyToOne
    //Поставить для просмотра цепочки от профиля или уровня
//    @ToString.Exclude
    private Level level;
}