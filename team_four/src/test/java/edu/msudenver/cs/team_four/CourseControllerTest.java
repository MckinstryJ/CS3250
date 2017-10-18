package edu.msudenver.cs.team_four;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import javax.transaction.Transactional;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import edu.msudenver.cs.team_four.models.CourseController;
import edu.msudenver.cs.team_four.models.CourseService;
import edu.msudenver.cs.team_four.models.Courses;
import edu.msudenver.cs.team_four.models.StudentController;
import edu.msudenver.cs.team_four.models.StudentService;

public class CourseControllerTest {
	@Mock
	private CourseController courseContTest;
	@Mock
	private CourseService courseServ = new CourseService();
	
	@Before
	public void setUpMock() {
		courseContTest = mock(CourseController.class);
		courseServ = mock(CourseService.class);
	}

	@Test
	public void assertNotNull(){
		Assert.assertNotNull(courseContTest);
		Assert.assertNotNull(courseServ);
	}
	
	@Test
	public void subTest() {
		Courses course1 = new Courses("Test","Test","Test","Test","Test","Test","Test","Test");
		Model model = null;
		when(courseContTest.courseSubmit(course1, model)).thenReturn("courses");
		assertEquals("courses", courseContTest.courseSubmit(course1, model));
	}
	@Test
	public void listTest() {
		Model model = null;
		Courses course1 = new Courses("Test","Test","Test","Test","Test","Test","Test","Test");
		when(courseContTest.list(model)).thenReturn("courses");
		assertEquals("courses", courseContTest.list(model));
	}
	@Test

	public void deleteCourseTest() {
		Model model = null;
		Courses course1 = new Courses("Test","Test","Test","Test","Test","Test","Test","Test");
		when(courseContTest.deleteCourse("Test", model)).thenReturn("courses");
		assertEquals("courses", courseContTest.deleteCourse("Test", model));
	}

}
