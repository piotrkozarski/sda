package PrintHouse.service;

import PrintHouse.exception.UserEmailExistException;
import PrintHouse.model.User;
import PrintHouse.repository.UserRepository;

import java.util.Optional;

public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    //metoda do rejestracji:   /*void bo nie potrzebujemy, żeby coś zwracało */
    public void register(User user) throws UserEmailExistException {
        Optional<User> userFromDb = repository.getUserByEmail(user.getEmail());
        if (userFromDb.isPresent()){
            throw new UserEmailExistException(user.getEmail());

        }
            repository.save(user);
    }

    public void update(User user) {
        repository.update(user);
    }

    public Optional<User> getById(int userId) {
        return repository.getById(userId);
    }
}
