package dao;

import pl.microblog.model.Message;
import pl.microblog.model.User;

import java.util.List;

/**
 * Created by sbmaniac on 07.06.2017.
 */
public interface MessageDao {

    List<Message> getUserTimelineMessages(User user);
    List<Message> getCurrentUserFullTimeline(User user);
    List<Message> getFullPublicTimeline();
    void addNewMessage(Message message);
}
