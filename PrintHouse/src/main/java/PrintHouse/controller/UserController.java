package PrintHouse.controller;

import PrintHouse.exception.UserEmailExistException;
import PrintHouse.model.User;
import PrintHouse.service.UserService;
import PrintHouse.utils.UserValidation;

public class UserController {
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    public void register(User user) {
        if (UserValidation.isValid(user)) {
            try {

                service.register(user);
            } catch (UserEmailExistException e) {
//TODO: Add logger and error message in view.
            }
        }
    }
}
