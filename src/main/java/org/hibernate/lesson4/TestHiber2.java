package org.hibernate.lesson4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.lesson3.Person;

public class TestHiber2 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Details.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();
            Details details = new Details()
                    .setAddress("Institutskay 3")
                    .setNumberPhone("8823323224");
            Details details2 = new Details()
                    .setAddress("Lenina 35")
                    .setNumberPhone("83467523224");
            Person person = new Person()
                    .setSalary(200)
                    .setLastName("Fedorov")
                    .setFirstName("Fedor")
                    .setDetails(details);

            details.setPerson(person);

            Person person2 = new Person()
                    .setDetails(details2)
                    .setSalary(160)
                    .setFirstName("Elena")
                    .setLastName("Lenina");

           details2.setPerson(person2);

            Department department = new Department()
                    .setName("It")
                    .setMaxSalary(1000)
                    .setMinSalary(100);

            department.addPersonToDepartment(person);
            department.addPersonToDepartment(person2);

//            details.setPerson(person);

            Person person1 = null;
            session.beginTransaction();

//            session.save(person);
            person1 = session.get(Person.class, 1);
            System.out.println(person1);

//            session.persist(department);
//            session.save(details);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}