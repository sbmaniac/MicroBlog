package pl.microblog.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by sbmaniac on 07.06.2017.
 */
@Entity
@Table(name = "message")
public class Message {

    @Id
    @GeneratedValue
    @Column(name = "id_message", nullable = false)
    private long messageID;

    @Column(name = "id_author", nullable = false)
    private long authorID;

    @Column(name = "text", nullable = false, length = 140)
    private String text;

    @Column(name = "publication_date", nullable = false)
    private Timestamp publication_date;

    public long getMessageID() {
        return messageID;
    }

    public void setMessageID(long messageID) {
        this.messageID = messageID;
    }

    public long getAuthorID() {
        return authorID;
    }

    public void setAuthorID(long authorID) {
        this.authorID = authorID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(Timestamp publication_date) {
        this.publication_date = publication_date;
    }
}
