package Users2.dao.impl;

import Users2.dao.UserDao;
import Users2.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private Session currentSession;
    private Transaction currentTransaction;
    private SessionFactory sessionFactory;
    private EntityManager entityManager;
    private static EntityManagerFactory entityManagerFactory;

    public UserDaoImpl() {
        entityManagerFactory = Persistence.createEntityManagerFactory("employeeManager");
    }

/*    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }*/

    @Override
    public void persist(User user) {
        entityManager.merge(user);
        //  currentSession.persist(user);

    }

    //TODO uzupelnic to na podstawie przykladu od Lukasza
    @Override
    public User getById(int id) {
        return entityManager.find(User.class, id);
        //   return currentSession.get(User.class, id);
    }

    @Override
    public List<User> getAll() {
        return entityManager.createQuery("SELECT e FROM User user").getResultList();
        //   return currentSession.createQuery("from User").list();
    }

    @Override
    public void delete(User usr) {
        entityManager.remove(usr);
        //   currentSession.delete(usr);

    }

    @Override
    public void update(User usr) {
        entityManager.merge(usr);
        //  currentSession.update(usr);
    }

   @Override
    public void openCurrentSessionWithTransaction() {
        entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

     /*   currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;*/
    }
/*
    @Override
    public void closeCurrentSession() {
        currentSession.close();

    }

    @Override
    public SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure("/hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
        return sessionFactory;
    }*/

    @Override
    public void closeCurrentSessionWithTransaction() {
        entityManager.getTransaction().commit();
        entityManager.close();

     /*   currentTransaction.commit();
        currentSession.close();
        sessionFactory.close();*/

    }

 /*   @Override
    public Transaction getCurrentTransaction() {
        return null;
    }*/
}
