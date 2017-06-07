package pl.microblog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by sbmaniac on 07.06.2017.
 */@Entity
@Table(name = "follower")
public class Follower {
    @Column(name="id_follower", nullable = false)
    private long followerId;
    @Column(name = "id_followee",nullable = false)
    private long followeeId;

    public long getFollowerId() {
        return followerId;
    }

    public void setFollowerId(long followerId) {
        this.followerId = followerId;
    }

    public long getFolloweeId() {
        return followeeId;
    }

    public void setFolloweeId(long followeeId) {
        this.followeeId = followeeId;
    }
}
