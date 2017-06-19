package pl.microblog.dao;

import pl.microblog.model.User;

/**
 * Created by sbmaniac on 07.06.2017.
 */
public interface FollowerDao {
    void addFollower(User userFollower,User userFollowee );
    void removeFollower(User userFollower, User userFollowee);
    boolean isFollower(User userFollower, User userFollowee);

}


