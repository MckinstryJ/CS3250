package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import edu.msudenver.cs.team_four.models.*;

public class CourseServiceTests {
	static Courses courseTest1 = new Courses("1","2","3","4","5","6","7","8");
	static Courses courseTest2 = new Courses("1a","2a","3a","4a","5a","6a","7a","8a");
	static Courses courseTest3 = new Courses("1b","2b","3b","4b","5b","6b","7b","8b");
	@Mock
	private CourseController courseCNT;
	@Mock
	private CourseService courseServ;
	@Mock
	private CourseRepository courseRepo;
	
	@Before
	public void setUpMock() {
	courseCNT = mock(CourseController.class);
	courseServ = mock(CourseService.class);
	courseRepo = mock(CourseRepository.class);
	}
	
	@Test
	public void assertNotNull() {
		Assert.assertNotNull(courseCNT);
		Assert.assertNotNull(courseServ);
	}
	
	@Test
	public void addCourseTest() {

		when(courseServ.addCourse(courseTest1)).thenReturn("Test");
		//when(courseServ.addCourse(courseTest2)).thenReturn("Test");
		//when(courseServ.addCourse(courseTest3)).thenReturn("Test");
		courseServ.addCourse(courseTest1);
		//courseServ.addCourse(courseTest2);
		//courseServ.addCourse(courseTest3);
		assertEquals("Test", courseServ.addCourse(courseTest1));
	}
	
	@Test
	public void getCourseTest() {
	//	courseTest1 = new Courses("Test", "Test", "1234", "Test", "Test", "Test","Test","Test");
		when(courseServ.getCourse("1234")).thenReturn(courseTest1);
		assertEquals(courseTest1, courseServ.getCourse("1234"));
	}
	
	@Test
	public void updateCourseTest() {
		courseTest2 = new Courses("Calculus 2", "Math", "2100", "4", "Learn Calculus 2","You Learn Calculus 2", "Calculus","N/A" );
		courseTest1 = new Courses("Calculus", "Math", "1400", "4", "Learn Calculus","You Learn Calculus", "Trigonometry","N/A" );
		courseServ.addCourse(courseTest1);
		when(courseServ.updateCourse(courseTest2)).thenReturn("Calculus 2");
		assertEquals("Calculus 2", courseServ.updateCourse(courseTest2));
	}
	@Test
	public void deleteCourseTest() {
		courseTest1 = new Courses("Calculus", "Math", "1400", "4", "Learn Calculus","You Learn Calculus", "Trigonometry","N/A" );
		courseServ.addCourse(courseTest1);
		when(courseServ.deleteCourse("1400")).thenReturn("test");
		assertEquals("test" , courseServ.deleteCourse("1400"));
	}
}
