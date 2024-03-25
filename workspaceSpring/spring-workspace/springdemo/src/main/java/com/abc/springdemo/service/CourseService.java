package com.abc.springdemo.service;

import com.abc.springdemo.bean.Course;

public class CourseService {

	private Course course;
		
	public void setCourse(Course course) {
		this.course = course;
	}
	
	public void addCourse() {
		System.out.println("Course Added.");
		System.out.println("Course Id: "+course.getCourseId());
		System.out.println("Course Duration: "+course.getDuration());
		System.out.println("Course Name: "+course.getCourseName());
	}	
	
}
