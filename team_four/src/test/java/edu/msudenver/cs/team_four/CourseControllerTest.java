package edu.msudenver.cs.team_four;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import static org.junit.Assert.*;

import javax.transaction.Transactional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.msudenver.cs.team_four.models.CourseController;
import edu.msudenver.cs.team_four.models.CourseService;
import edu.msudenver.cs.team_four.models.Courses;

public class CourseControllerTest {
	@Autowired
	static CourseController courseContTest = new CourseController();
	@Autowired
	static CourseService courseServ = new CourseService();
	
	@Test (expected = NullPointerException.class)
	@RequestMapping(value="/courses", method=RequestMethod.POST)
	public void subTest() {
		Courses course1 = new Courses("Test","Test","Test","Test","Test","Test","Test","Test");
		Model model = null;
		assertEquals("courses", courseContTest.courseSubmit(course1, model));
	}
	@Test (expected = NullPointerException.class)
	@RequestMapping(value ="/courses", method = RequestMethod.GET)
	public void listTest() {
		Model model = null;
		Courses course1 = new Courses("Test","Test","Test","Test","Test","Test","Test","Test");
		courseContTest.courseSubmit(course1, model);
		assertEquals("courses", courseContTest.list(model));
	}
	@Test (expected = NullPointerException.class)
	@RequestMapping(method=RequestMethod.POST, value="/deleteCourse")
	public void deleteCourseTest() {
		Model model = null;
		Courses course1 = new Courses("Test","Test","Test","Test","Test","Test","Test","Test");
		courseContTest.courseSubmit(course1, model);
		assertEquals("courses", courseContTest.deleteCourse("Test", model));
	}

}
