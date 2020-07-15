package com.arpita.courseinfo.Repository;

import com.arpita.courseinfo.model.Topics;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepo extends CrudRepository<Topics, String> {

}
