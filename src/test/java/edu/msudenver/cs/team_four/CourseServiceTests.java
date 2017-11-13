package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.msudenver.cs.team_four.models.*;

public class CourseServiceTests {
	static Courses courseTest1 = new Courses("1","2","3","4","5","6","7","8");
	static Courses courseTest2 = new Courses("1a","2a","3a","4a","5a","6a","7a","8a");
	static Courses courseTest3 = new Courses("1b","2b","3b","4b","5b","6b","7b","8b");
	static CourseController courseCNT;
	static CourseService courseServ;
	
	@Test  (expected = NullPointerException.class)
	public void addCourseTest() {
		courseServ = new CourseService();
		courseServ.addCourse(courseTest1);
		courseServ.addCourse(courseTest2);
		courseServ.addCourse(courseTest3);
		assertEquals(3, courseServ.getAllCourses().size());
	}
	
	@Test  (expected = NullPointerException.class)
	public void getCourseTest() {
		courseTest1 = new Courses("Test", "Test", "1234", "Test", "Test", "Test","Test","Test");
		courseServ = new CourseService();
		courseServ.addCourse(courseTest1);
		assertEquals("Test", courseServ.getCourse("1234"));
	}
	
	@Test  (expected = NullPointerException.class)
	public void updateCourseTest() {
		courseTest2 = new Courses("Calculus 2", "Math", "2100", "4", "Learn Calculus 2","You Learn Calculus 2", "Calculus","N/A" );
		courseTest1 = new Courses("Calculus", "Math", "1400", "4", "Learn Calculus","You Learn Calculus", "Trigonometry","N/A" );
		courseServ = new CourseService();
		courseServ.addCourse(courseTest1);
		courseServ.updateCourse(courseTest2);
		assertEquals("Calculus 2", courseServ.getCourse("2400"));
	}
	@Test  (expected = NullPointerException.class)
	public void deleteCourseTest() {
		courseTest1 = new Courses("Calculus", "Math", "1400", "4", "Learn Calculus","You Learn Calculus", "Trigonometry","N/A" );
		courseServ = new CourseService();
		courseServ.addCourse(courseTest1);
		courseServ.deleteCourse("1400");
		assertTrue(courseServ.getAllCourses().isEmpty());
	}
}
