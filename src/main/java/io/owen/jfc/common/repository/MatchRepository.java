package io.owen.jfc.common.repository;

import io.owen.jfc.common.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.ZonedDateTime;
import java.util.List;

/**
 * Created by owen_q on 2018. 7. 17..
 */

public interface MatchRepository extends JpaRepository<Match, Long> {
    List<Match> findByMatchDateAfter(ZonedDateTime now);
}
