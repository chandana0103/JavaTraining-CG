package com.abc.springdemo.client;

import com.abc.springdemo.bean.Course;
import com.abc.springdemo.service.CourseService;

public class CourseServiceMain {

	public static void main(String[] args) {
		
		Course course1 = new Course();
		course1.setCourseId(10);
		course1.setCourseName("Java FullStack");
		course1.setDuration(60);
		
		Course course2 = new Course();
		course2.setCourseId(20);
		course2.setCourseName("MEAN Stack");
		course2.setDuration(40);
		
		Course course3 = new Course();
		course3.setCourseId(30);
		course3.setCourseName("AWS");
		course3.setDuration(50);
		
		CourseService courseService = new CourseService();
		courseService.setCourse(course2);			
		
		courseService.addCourse();

	}

}
