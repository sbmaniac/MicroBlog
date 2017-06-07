package pl.microblog.model;

import javax.persistence.*;

/**
 * Created by sbmaniac on 07.06.2017.
 */
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id_user", nullable = false)
    private long userID;

    @Column(name = "username",nullable = false, length = 45, unique = true)
    private String username;

    @Column(name = "email",nullable = false, length = 100, unique = true)
    private String email;

    @Column(name = "password",nullable = false)
    private String password;

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
