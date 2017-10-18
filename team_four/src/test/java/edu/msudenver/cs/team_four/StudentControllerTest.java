package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import edu.msudenver.cs.team_four.models.Student;
import edu.msudenver.cs.team_four.models.StudentController;
import edu.msudenver.cs.team_four.models.StudentService;

public class StudentControllerTest {

	private StudentController stuCont;
	private StudentService stuServ;
	private Model model;
	private Student student;
	private ArrayList<Student> studentList;
	
	@Before
	public void setUpMock() {
		stuCont = mock(StudentController.class);
		stuServ = mock(StudentService.class);
		model = mock(Model.class);
		student = new Student("3" , "Tester" , "Stu");
		studentList = new ArrayList<Student>();
		when(stuServ.addStudent(student)).thenReturn("students");
		when(stuServ.deleteStudent("3")).thenReturn("students");
		when(stuServ.getStudent("3")).thenReturn(student);
		when(stuServ.getAllStudents()).thenReturn(studentList);
		
	}
	
	@Test
	public void assertNotNull() {
		Assert.assertNotNull(stuCont);
		Assert.assertNotNull(stuServ);
		Assert.assertNotNull(model);
	}
	@Test
	public void stuSubTest() {
		when(stuCont.studentSubmit(student, model)).thenReturn("student");
		stuCont.studentSubmit(student, model);
		assertEquals("student",stuCont.studentSubmit(student, model));
		
	}
	@Test
	public void listTest() {
		when(stuCont.list(model)).thenReturn("students");
		stuCont.list(model);
		assertEquals("students",stuCont.list(model));
	}
	
	@Test
	public void deleteTest() {
		stuCont.deleteStudent("test", model);
		assertEquals("students", stuServ.deleteStudent("3"));
	}
	@Test
	public void updateTest() {
		
	}

}
