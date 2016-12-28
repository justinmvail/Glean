package com.glean.repository;

import com.glean.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by michaelplott on 12/17/16.
 */
public interface UserRepo extends MongoRepository<User, String> {

    User findByUserName(String userName);
}
