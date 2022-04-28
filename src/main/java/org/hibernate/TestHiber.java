package org.hibernate;

import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.List;

public class TestHiber {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(org.hibernate.Person.class)

//                .addAnnotatedClass(org.hibernate.Student.class)

                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        org.hibernate.Person person = new org.hibernate.Person()
                .setDepartment(new Department())
                .setFirstName("Elena")
                .setLastName("Stepanova")
                .setSalary(200);

//        Student student = new Student()
//                .setSurname("Иванов")
//                .setName("Вячеслав")
//                .setGroup("ИС-51")
//                .setDate(new Date());

        session.beginTransaction();

//        Person person1 = session.get(Person.class, 1);
//        System.out.println(person1);

//        StudentSQL studentSQL = session.get(StudentSQL.class, 5);
//        System.out.println(studentSQL);

//        List<Person> personList = session.createQuery("from Person where salary < 300", Person.class).getResultList();
//        personList.forEach(System.out::println);

//        session.get(Person.class, 1)
//                .setSalary(600);

        session.createQuery("update Person set salary=700 where firstName = 'Elena'").executeUpdate();

        org.hibernate.Person person1 = session.get(org.hibernate.Person.class, 5);
        session.delete(person1);
//        session.createQuery("delete Person  where id=2").executeUpdate();

//        session.save(person);

//        session.save(student);

        session.getTransaction().commit();
    }
}