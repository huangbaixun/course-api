package io.huangbaixun.springbootstarter.Course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository CourseRepository;
	
	public List<Course> getAllCourses(String topicId)
	{
		return	CourseRepository.findByTopicId(topicId);
	}
	
	public Course GetCourse(String id)
	{
		return CourseRepository.findOne(id);
	}
	
	public void addCourse(Course course)
	{
		CourseRepository.save(course);
	}
	
	public void updateCourse(Course course)
	{
		CourseRepository.save(course);
	}
	
	public void deleteCourse(String id)
	{
		CourseRepository.delete(id);
	}
	
}
