package Users2.dao.impl;

import Users2.dao.UserDao;
import Users2.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UserDaoImpl implements UserDao {

    private Session currentSession;
    private Transaction currentTransaction;

    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }


    @Override
    public void persist(User user) {
        currentSession.persist(user);

    }

    @Override
    public User getById(int id) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void delete(User usr) {

    }

    @Override
    public void update(User usr) {

    }

    @Override
    public Session openCurrentSessionWithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    @Override
    public void closeCurrentSessionWithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    @Override
    public void closeCurrentSession() {

    }

    @Override
    public SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.configure("/hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        return sessionFactory;
    }

    @Override
    public Transaction getCurrentTransaction() {
        return null;
    }
}
