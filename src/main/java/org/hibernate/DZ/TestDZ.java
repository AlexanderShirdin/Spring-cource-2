package org.hibernate.DZ;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class TestDZ {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Answer.class)
                .addAnnotatedClass(Question.class)
                .addAnnotatedClass(Profile.class)
                .addAnnotatedClass(Level.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();
            Profile profile1 = new Profile();
            profile1.setProfile("Developer");

            Profile profile2 = new Profile();
            profile2.setProfile("Analyst");

            Level level1 = new Level();
            level1.setLevel("Junior");

            Level level2 = new Level();
            level2.setLevel("Middle");

            Level level3 = new Level();
            level3.setLevel("Senior");

            Answer answer1 = new Answer();
            answer1.setAnswer("Library for the Java programming language");

            Answer answer2 = new Answer();
            answer2.setAnswer("The Java EE API specification provides the ability to save Java objects in a convenient in a database");

            Answer answer3 = new Answer();
            answer3.setAnswer("A universal open source framework for the Java platform.");

            Answer answer4 = new Answer();
            answer4.setAnswer("A document or set of documents that describe the functions of a system or software application.");

            Question question1 = new Question();
            question1.setQuestion("What is Hibernate?")
                    .setProfile(profile1)
                    .setLevel(level1)
                    .addAnswerToQuestion(answer1);


            Question question2 = new Question();
            question2.setQuestion("What is Java Persistence API?")
                    .setProfile(profile1)
                    .setLevel(level2)
                    .addAnswerToQuestion(answer2);


            Question question3 = new Question();
            question3.setQuestion("What is Spring?")
                    .setProfile(profile1)
                    .setLevel(level3)
                    .addAnswerToQuestion(answer3);

            Question question4 = new Question();
            question4.setQuestion("What is SRS?")
                    .setProfile(profile2)
                    .setLevel(level3)
                    .addAnswerToQuestion(answer4);

            session.beginTransaction();

//            session.persist(question1);
//            session.persist(question2);
//            session.persist(question3);
//            session.persist(question4);

            List<Question> questionList = session.createQuery("from Question where profile.id = 1 and level.id <= 3", Question.class).getResultList();
            questionList.forEach(System.out::println);

            List<Question> questionList1 = session.createQuery("from Question where level.level= 'Senior'", Question.class).getResultList();
            questionList1.forEach(System.out::println);

            Profile profile = session.get(Profile.class, 1);
            System.out.println(profile);

            Level level = session.get(Level.class,3);
            System.out.println(level);

//            Level level0 = session.get(Level.class,2);
//            System.out.println(level0.getQuestions());

            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}