package my.lesson;

import org.hibernate.Session;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateConf.getSessionFactory().openSession();
        EntityManager em = session.getEntityManagerFactory().createEntityManager();

        List<Objects[]> personEntities = em.createNativeQuery("select name, family from person").getResultList();

        for(Object[] person : personEntities) {
            String name = (String) person[0];
            String family = (String) person[1];
            System.out.println(name+" "+family);
        }


        session.close();
        HibernateConf.shutdownSessionFactory();
    }
}