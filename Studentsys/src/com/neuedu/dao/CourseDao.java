package com.neuedu.dao;

import java.util.List;

import com.neuedu.entity.Course;

public interface CourseDao {

	void AddCourse(Course course);
	void DelCourse(int courseid);
	void UpdateCourse(Course course);
	List<Course>  Query();
	List<String> getStudent(int courseId);
	
}
