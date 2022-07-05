package shevchenko.dao;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import shevchenko.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import java.util.List;

@Component
@Transactional
public class UserDAOImpl implements UserDAO{

    @PersistenceUnit
    EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select user from User user", User.class).getResultList();
    }

    @Override
    public User getUserId(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void deleteUser(int id) {
        entityManager.remove(getUserId(id));
    }

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }
}
