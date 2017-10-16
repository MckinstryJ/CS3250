package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;

import javax.transaction.Transactional;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.msudenver.cs.team_four.models.Student;
import edu.msudenver.cs.team_four.models.StudentController;
import edu.msudenver.cs.team_four.models.StudentService;

public class StudentServiceTests {
	static Student testerStudent1 = new Student("Bob", "111112");
	static Student testerStudent2 = new Student("Mick", "121212");
	static Student testerStudent3 = new Student("Jane", "987654");
	static StudentController testerUC;
	static StudentService testerUS;
	static String testerId;
	
	@Test
	public void addStudentTest() {
		testerUS = new StudentService();
		testerUS.addStudent(testerStudent1);
		testerUS.addStudent(testerStudent2);
		testerUS.addStudent(testerStudent3);
		assertEquals(3, testerUS.getAllStudents().size());
	}
	
	@Test
	public void getStudentTest() {
		testerStudent1 = new Student("Bill", "123456");
		testerUS = new StudentService();
		testerUS.addStudent(testerStudent1);
		assertFalse(testerUS.getStudent("123456").toString().isEmpty());
	}
	
	@Test
	public void getStudentNameTest() {
		testerStudent1 = new Student("Bill", "123456");
		testerUS = new StudentService();
		testerUS.addStudent(testerStudent1);
		assertEquals("Bill", testerUS.getStudent("123456"));
	}
	
	@Test
	public void updateStudentTest() {
		testerStudent1 = new Student("Bill", "123456");
		testerStudent2 = new Student("Shetern", "123456");
		testerUS = new StudentService();
		testerUS.addStudent(testerStudent1);
		testerUS.updateStudent("123456", testerStudent2);
		assertEquals("Shetern", testerUS.getStudent("123456"));
	}
	
	@Test
	public void deleteStudentTest() {
		testerStudent1 = new Student("Bill", "123456");
		testerUS = new StudentService();
		testerUS.addStudent(testerStudent1);
		testerUS.deleteStudent(testerId);
		assertTrue(testerUS.getAllStudents().isEmpty());
	}
}
