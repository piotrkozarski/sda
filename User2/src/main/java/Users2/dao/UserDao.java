package Users2.dao;

import Users2.model.User;

import java.util.List;

public interface UserDao extends SessionOperations {

    void persist(User user);

    User getById(int id);

    List<User> getAll();

    void delete(User usr);

    void update(User usr);
}
