package my.lesson;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;


public class HibernateConf {
    private static SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
           Configuration configuration = new Configuration();
           configuration.setProperty("connection.driver_class","org.postgresql.Driver");
           configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://192.168.1.6:5432/Test");
           configuration.setProperty("hibernate.connection.username","sa");
           configuration.setProperty("hibernate.connection.password", "pin@#1358");
           configuration.setProperty("show_sql", "true");

           return configuration.buildSessionFactory();

        } catch (Exception e) {
            System.err.println("Error buildSessionFactory "+e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public static void shutdownSessionFactory(){
        getSessionFactory().close();
    }
}
