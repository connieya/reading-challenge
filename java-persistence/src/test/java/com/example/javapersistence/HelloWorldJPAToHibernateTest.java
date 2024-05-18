package com.example.javapersistence;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.criteria.CriteriaQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldJPAToHibernateTest {

    private static SessionFactory getSessionFactory(EntityManagerFactory entityManagerFactory) {
        return entityManagerFactory.unwrap(SessionFactory.class);
    }

    @Test
    public void storeLoadMessage() {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("ch02");

        try (SessionFactory sessionFactory = getSessionFactory(emf)) {
            Session session = sessionFactory.openSession();

            session.beginTransaction();

            Message message = new Message();
            message.setText("Hello World from JPA to Hibernate!");

            session.persist(message);

            session.getTransaction().commit();
            // INSERT into MESSAGE (ID, TEXT)
            // values (1, 'Hello World from JPA to Hibernate!')
            session.beginTransaction();

            CriteriaQuery<Message> criteriaQuery = session.getCriteriaBuilder().createQuery(Message.class);
            criteriaQuery.from(Message.class);

            List<Message> messages = session.createQuery(criteriaQuery).getResultList();
            // SELECT * from MESSAGE

            session.getTransaction().commit();

            assertAll(
                    () -> assertEquals(1, messages.size()),
                    () -> assertEquals("Hello World from JPA to Hibernate!", messages.get(0).getText())
            );

            session.close();

        }
    }
}
