package PrintHouse.service;

import PrintHouse.model.User;
import PrintHouse.repository.UserRepository;

public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    //metoda do rejestracji:   /*void bo nie potrzebujemy, żeby coś zwracało */
    public void register(User user) {
        repository.save(user);
    }

    public void update(User user) {
        repository.update(user);
    }

    public User getById(int userId) {
        return repository.getById(userId);
    }
}
