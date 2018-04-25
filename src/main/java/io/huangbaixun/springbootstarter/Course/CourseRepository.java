package io.huangbaixun.springbootstarter.Course;

import org.springframework.data.repository.CrudRepository;
import java.lang.String;
import io.huangbaixun.springbootstarter.Course.Course;
import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String>{
      List<Course> findByTopicId(String topicId);
}
