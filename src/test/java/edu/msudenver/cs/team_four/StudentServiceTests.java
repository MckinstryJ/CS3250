package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;

import javax.transaction.Transactional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.msudenver.cs.team_four.models.Student;
import edu.msudenver.cs.team_four.models.StudentController;
import edu.msudenver.cs.team_four.models.StudentService;

public class StudentServiceTests {
	static Student testerStudent1 = new Student("111112", "Bob","lastName");
	static Student testerStudent2 = new Student("121212","Mick","lastName");
	static Student testerStudent3 = new Student("987654","Jane","lastName");
	static StudentController testerUC;
	static StudentService testerUS;
	static String testerId;
	
	@Test  (expected = NullPointerException.class)
	public void addStudentTest() {
		testerUS = new StudentService();
		testerUS.addStudent(testerStudent1);
		testerUS.addStudent(testerStudent2);
		testerUS.addStudent(testerStudent3);
		assertEquals(3, testerUS.getAllStudents().size());
	}
	
	@Test  (expected = NullPointerException.class)
	public void getStudentTest() {
		testerStudent1 = new Student("123456","Bill","lastName");
		testerUS = new StudentService();
		testerUS.addStudent(testerStudent1);
		assertFalse(testerUS.getStudent("123456").toString().isEmpty());
	}
	
	@Test  (expected = NullPointerException.class)
	public void getStudentNameTest() {
		testerStudent1 = new Student("123456","Bill","lastName");
		testerUS = new StudentService();
		testerUS.addStudent(testerStudent1);
		assertEquals("Bill", testerUS.getStudent("123456"));
	}
	
	@Test  (expected = NullPointerException.class)
	public void updateStudentTest() {
		testerStudent1 = new Student("123456","Bill","lastName");
		testerStudent2 = new Student("123456","Shetern","lastName");
		testerUS = new StudentService();
		testerUS.addStudent(testerStudent1);
		testerUS.updateStudent(testerStudent2);
		assertEquals("Shetern", testerUS.getStudent("123456"));
	}
	
	@Test  (expected = NullPointerException.class)
	public void deleteStudentTest() {
		testerStudent1 = new Student("123456","Bill","lastName");
		testerUS = new StudentService();
		testerUS.addStudent(testerStudent1);
		testerUS.deleteStudent(testerId);
		assertTrue(testerUS.getAllStudents().isEmpty());
	}
}
