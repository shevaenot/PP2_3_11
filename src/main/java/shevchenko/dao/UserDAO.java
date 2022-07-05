package shevchenko.dao;

import shevchenko.model.User;

import java.util.List;
public interface UserDAO {

    List<User> getAllUsers();

    User getUserId(int id);

    void addUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

}
