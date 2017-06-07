package dao;

import pl.microblog.model.User;

/**
 * Created by sbmaniac on 07.06.2017.
 */
public interface UserDao {

    User getUserByUsername(User username);
    void registerNewUser(User newUser);
}
