package pl.microblog.dao.impl;

import pl.microblog.dao.FollowerDao;
import pl.microblog.model.Follower;
import pl.microblog.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by sbmaniac on 19.06.2017.
 */
@Transactional
public class FollowerDaoImpl implements FollowerDao {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public void addFollower(User userFollower, User userFollowee) {
        if (!isFollower(userFollower, userFollowee)) {
            Follower follower = new Follower();
            follower.setFollowerId(userFollower.getUserID());
            follower.setFolloweeId(userFollowee.getUserID());

            entityManager.persist(follower);
        }
    }

    @Override
    public void removeFollower(User userFollower, User userFollowee) {
        String queryString = "DELETE FROM follower f" + " WHERE f.id_follower = :userFollower and  f.id_followee = :userFollowee";
        Query query = entityManager.createQuery(queryString);
        query.setParameter("userFollower", userFollower.getUserID());
        query.setParameter("userFollowee", userFollowee.getUserID());
        int result = query.executeUpdate();
    }

    @Override
    public boolean isFollower(User userFollower, User userFollowee) {

        String queryString = "SELECT f FROM follower f WHERE f.id_follower = :userFollower and  f.id_followee = :userFollowee";
        Query query = entityManager.createQuery(queryString);
        query.setParameter("userFollower", userFollower.getUserID());
        query.setParameter("userFollowee", userFollowee.getUserID());

        List resultList = query.getResultList();

        if (resultList.size() == 0) {
            return true;
        } else {
            return false;
        }

    }
}
