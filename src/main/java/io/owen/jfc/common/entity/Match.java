package io.owen.jfc.common.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * Created by owen_q on 2018. 7. 17..
 */
@Entity
@Table(name = "matches")
@Getter
@Setter
public class Match {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "match_id")
    private long id;

    @Column(name = "created_date")
    private ZonedDateTime createdDate = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));

    @Id
    @Column(name = "match_date")
    private ZonedDateTime matchDate;

    @OneToMany(mappedBy = "match", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<User> attendList;
//
//    @Column(name = "is_closed")
//    private boolean isClosed = false;

    public Match() {
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", createdDate=" + createdDate +
                ", matchDate=" + matchDate +
                ", attendList=" + attendList +
                '}';
    }
}
