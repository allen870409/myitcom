package com.arashiq.Repository;

import com.arashiq.model.Technology;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by A13054 on 2016/06/20.
 */
public interface TechnologyRepository extends MongoRepository<Technology, String> {
}
