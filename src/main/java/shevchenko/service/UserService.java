package shevchenko.service;

import java.util.List;
import shevchenko.model.User;

public interface UserService {

    List<User> getAllUsers();

    User getUserId(int id);

    void addUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

}
