package pl.microblog.dao.impl;

import pl.microblog.dao.UserDao;
import pl.microblog.model.User;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

/**
 * Created by sbmaniac on 07.06.2017.
 */
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public User getUserByUsername(String username) {


        String queryString = "SELECT u FROM user u " + "WHERE LOWER(u.username) = LOWER(:username)";

        Query query = entityManager.createQuery(queryString);
        query.setParameter("username", username);

        User user = (User) query.getSingleResult();

        return user;
    }

    @Override
    public void registerNewUser(User newUser) {

        entityManager.persist(newUser);

    }
}
