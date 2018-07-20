package io.owen.jfc.common.repository;

import io.owen.jfc.common.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by owen_q on 2018. 7. 9..
 */
public interface UserRepository extends JpaRepository<User, String> {
    User findByUserKey(String userKey);
}
