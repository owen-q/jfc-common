package io.owen.jfc.common.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by owen_q on 2018. 7. 9..
 */
@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    /*
    @Id
    @Column(name = "user_id")
    private long id;
    */

    @Id
    @Column(name = "user_key")
    private String userKey;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "is_authored")
    private boolean isAuthored = false;

    @ManyToOne
    @JoinColumn(name = "match_id")
    private Match match;

    public User() {
    }

    public User(String userKey) {
        this.userKey = userKey;
    }

    @Override
    public String toString() {
        return "User{" +
                "userKey='" + userKey + '\'' +
                ", userName='" + userName + '\'' +
                ", isAuthored=" + isAuthored +
                ", match=" + match +
                '}';
    }
}
