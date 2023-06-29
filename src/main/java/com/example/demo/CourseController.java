package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CourseController {
	
	@RequestMapping("/courses")
	
	public List<Course> retrieveAllCourses() 
	
	{
		return Arrays.asList(
				new Course(1, "Aws", "AWS Cloud"),
		        new Course(2, "Azure", "Azure Cloud"),
		        new Course(3, "GCP", "GCP Cloud")
		        );
		
	}
		

}
