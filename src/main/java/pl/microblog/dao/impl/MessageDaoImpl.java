package pl.microblog.dao.impl;

import pl.microblog.model.Message;
import pl.microblog.dao.MessageDao;
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
public class MessageDaoImpl implements MessageDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Message> getUserTimelineMessages(User user) {

        String stringQuery = "SELECT m FROM message m WHERE id_author = :userID";
        Query query = entityManager.createQuery(stringQuery);
        query.setParameter("userID", user.getUserID());


        return query.getResultList();
    }

    @Override
    public List<Message> getCurrentUserFullTimeline(User user) {

        SELECT m from message m where
        return null;
    }

    @Override
    public List<pl.microblog.model.Message> getFullPublicTimeline() {
        String stringQuery = "SELECT m FROM message m ORDER BY publication_date DESC";
        Query query = entityManager.createQuery(stringQuery);


        return query.getResultList();
    }

    @Override
    public void addNewMessage(Message message) {

    }
}
