package org.hibernate.lesson3;

import org.hibernate.StudentSQL;
import org.hibernate.lesson4.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class TestHiber {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
//                .addAnnotatedClass(org.hibernate.StudentSQL.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        Person person = new Person()
                .setDepartment(new Department())
                .setFirstName("Elena")
                .setLastName("Stepanova")
                .setSalary(200);
//        StudentSQL student = new StudentSQL()
//                .setSurname("Иванов")
//                .setName("Вячеслав")
//                .setGroup("ИС-51")
//                .setDate(new Date());
        session.beginTransaction();

//        Person person1 = session.get(Person.class, 1);
//        System.out.println(person1);

//        StudentSQL studentSQL = session.get(StudentSQL.class, 27);
//        System.out.println(studentSQL);

//        List<Person> personList = session.createQuery("from Person where salary < 300", Person.class).getResultList();
//        personList.forEach(System.out::println);

//        session.get(Person.class, 1)
//                .setSalary(600);

//          session.get(StudentSQL.class, 27)
//                .setSurname("Туманов");

//        session.createQuery("update Person set salary=700 where firstName = 'Elena'").executeUpdate();
//
//        Person person1 = session.get(Person.class, 5);
//        session.delete(person1);
//        session.createQuery("delete Person  where id=2").executeUpdate();

//          session.createQuery("delete StudentSQL  where id=27").executeUpdate();

//        session.save(person);

//        session.save(student);

        session.getTransaction().commit();
    }
}