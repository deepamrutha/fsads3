package com.example.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.entity.Student;

public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new Configuration()
                    .configure("hibernate.cfg.xml")   // must be in src/main/resources
                    .addAnnotatedClass(Student.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    // ✅ REQUIRED by App.java
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    // ✅ REQUIRED by App.java
    public static void shutdown() {
        getSessionFactory().close();
    }
}
