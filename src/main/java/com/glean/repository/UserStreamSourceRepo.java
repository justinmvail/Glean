package com.glean.repository;

import com.glean.guideBoxDataEntities.UserStreamSource;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by justi on 5/2/2017.
 */
public interface UserStreamSourceRepo extends MongoRepository<UserStreamSource, String> {

}
