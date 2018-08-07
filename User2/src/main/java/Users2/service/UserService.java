package Users2.service;

import Users2.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    User getById(int id);

    List<User> getAll();

    void delete(int id);

    void update(User usr);
}
