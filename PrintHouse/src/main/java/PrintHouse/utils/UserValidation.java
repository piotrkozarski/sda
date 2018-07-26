package PrintHouse.utils;

import PrintHouse.model.User;
import org.apache.commons.lang3.StringUtils;

public class UserValidation {

    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_!#$%&‘*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    public static boolean isValid(User user) {
        return hasOnlyLetters(user.getFirstName())
                && hasOnlyLetters(user.getLastName())
                && user.getEmail().matches(EMAIL_REGEX)
                &&isValidPsw(user.getPass());

          }

    private static boolean hasOnlyLetters(String value) {
        return StringUtils.isNoneBlank(value) && value.matches("[a-zA-Z]");
    }

    private static boolean isValidPsw(String password) {
        return StringUtils.isNoneBlank(password)
                && password.length() >= 8
                && password.matches("[0-9]");


    }

}
