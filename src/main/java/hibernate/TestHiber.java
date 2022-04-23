package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestHiber {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Person.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        Person person = new Person()
                .setDepartment("Hr")
                .setFirstName("Elena")
                .setLastName("Stepanova")
                .setSalary(200);
        session.beginTransaction();
//        Person person1 = session.get(Person.class, 1);
//        System.out.println(person1);
//        List<Person> personList = session.createQuery("from Person where salary<300", Person.class).getResultList();
//        personList.forEach(System.out::println);
//        session.get(Person.class, 1)
//                .setSalary(600);
        session.createQuery("update Person set salary=700 where firstName = 'Elena'").executeUpdate();
        Person person1 = session.get(Person.class, 3);
        session.delete(person1);
//        session.createQuery("delete Person  where id=2").executeUpdate();
//        session.save(person);
        session.getTransaction().commit();
    }
}