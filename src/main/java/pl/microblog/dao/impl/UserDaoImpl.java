package pl.microblog.dao.impl;

import pl.microblog.dao.UserDao;
import pl.microblog.model.User;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

/**
 * Created by sbmaniac on 07.06.2017.
 */
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public User getUserByUsername(User username) {


        return null;
    }

    @Override
    public void registerNewUser(User newUser) {

    }
}
