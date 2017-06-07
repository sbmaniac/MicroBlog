package pl.microblog.model;

/**
 * Created by sbmaniac on 07.06.2017.
 */
public class Follower {

    private long followerId;
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
