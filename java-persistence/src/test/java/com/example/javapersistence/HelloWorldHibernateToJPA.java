package com.example.javapersistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldHibernateToJPA {

    private static EntityManagerFactory createEntityManagerFactory() {
        Configuration configuration = new Configuration();
        configuration.configure().addAnnotatedClass(Message.class);

        Map<String, String> properties = new HashMap<>();
        Enumeration<?> propertyNames = configuration.getProperties().propertyNames();
        while (propertyNames.hasMoreElements()) {
            String element = (String) propertyNames.nextElement();
            properties.put(element, configuration.getProperties().getProperty(element));
        }

        return Persistence.createEntityManagerFactory("ch02", properties);
    }

    @Test
    public void storeLoadMessage() {

        EntityManagerFactory emf = createEntityManagerFactory();

        try {

            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();

            Message message = new Message();
            message.setText("Hello World from Hibernate to JPA!");

            em.persist(message);

            em.getTransaction().commit();
            //INSERT into MESSAGE (ID, TEXT) values (1, 'Hello World from Hibernate to JPA!')

            List<Message> messages =
                    em.createQuery("select m from Message m", Message.class).getResultList();
            //SELECT * from MESSAGE

            assertAll(
                    () -> assertEquals(1, messages.size()),
                    () -> assertEquals("Hello World from Hibernate to JPA!", messages.get(0).getText())
            );

            em.close();

        } finally {
            emf.close();
        }
    }
}
