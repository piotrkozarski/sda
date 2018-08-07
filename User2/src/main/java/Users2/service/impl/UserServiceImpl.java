package Users2.service.impl;

import Users2.dao.UserDao;
import Users2.dao.impl.UserDaoImpl;
import Users2.model.User;
import Users2.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserServiceImpl() {
        this.userDao = new UserDaoImpl();
    }

    @Override
    public void save(User user) {
        userDao.openCurrentSessionWithTransaction();
        userDao.persist(user);
        userDao.closeCurrentSessionWithTransaction();

    }

    @Override
    public User getById(int id) {
        userDao.openCurrentSessionWithTransaction();
        User user = userDao.getById(id);
        userDao.closeCurrentSessionWithTransaction();

        return user;
    }

    @Override
    public List<User> getAll() {
        userDao.openCurrentSessionWithTransaction();
        List<User> users = userDao.getAll();
        userDao.closeCurrentSessionWithTransaction();

        return users;
    }

    @Override
    public void delete(int id) {
        userDao.openCurrentSessionWithTransaction();
        User user = userDao.getById(id);
        userDao.delete(user);
        userDao.closeCurrentSessionWithTransaction();
    }

    @Override
    public void update(User usr) {
        userDao.openCurrentSessionWithTransaction();
        userDao.update(usr);
        userDao.closeCurrentSessionWithTransaction();
    }
}
