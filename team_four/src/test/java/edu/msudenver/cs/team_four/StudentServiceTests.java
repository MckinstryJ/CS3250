package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import edu.msudenver.cs.team_four.models.Student;
import edu.msudenver.cs.team_four.models.StudentController;
import edu.msudenver.cs.team_four.models.StudentService;

public class StudentServiceTests {
	static Student testerStudent1 = new Student("111112", "Bob","lastName");
	static Student testerStudent2 = new Student("121212","Mick","lastName");
	static Student testerStudent3 = new Student("987654","Jane","lastName");
	@Mock
	private StudentController testerUC;
	@Mock
	private StudentService testerUS;
	static String testerId;

	@Before
	public void setUpMock() {
		testerUC = mock(StudentController.class);
		testerUS = mock(StudentService.class);

	}
	@Test
	public void testMockCreation() {
		assertNotNull(testerUC);
		assertNotNull(testerUS);
	}
	
	@Test
	public void addStudentTest() {
		when(testerUS.addStudent(testerStudent1)).thenReturn("Added");
		assertEquals("Added", testerUS.addStudent(testerStudent1));
	}
	
	@Test
	public void getStudentTest() {
		when(testerUS.getStudent(testerId)).thenReturn(testerStudent1);
		assertEquals(testerStudent1, testerUS.getStudent(testerId));
	}
	
	@Test
	public void getStudentNameTest() {
		when(testerUS.getStudent("123456")).thenReturn(testerStudent1);
		assertEquals(testerStudent1, testerUS.getStudent("123456"));
	}
	
	@Test
	public void updateStudentTest() {
		when(testerUS.updateStudent(testerStudent1)).thenReturn("Shetern");
		assertEquals("Shetern", testerUS.updateStudent(testerStudent1));
	}
	
	@Test
	public void deleteStudentTest() {
		when(testerUS.deleteStudent(testerId)).thenReturn("Deleted");
		assertEquals("Deleted",testerUS.deleteStudent(testerId));
	}
}
