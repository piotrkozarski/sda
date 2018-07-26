package PrintHouse.controller;

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
            service.register(user);

        }
    }
}
