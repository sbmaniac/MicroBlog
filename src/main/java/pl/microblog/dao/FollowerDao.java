package pl.microblog.dao;

import pl.microblog.model.User;

/**
 * Created by sbmaniac on 07.06.2017.
 */
public interface FollowerDao {
    void addFollower(User user);
    void removeFollower(User user);
    boolean isFollower(User user);

}


