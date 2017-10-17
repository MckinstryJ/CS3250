package edu.msudenver.cs.team_four;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.msudenver.cs.team_four.models.CourseController;
import edu.msudenver.cs.team_four.models.CourseService;
import edu.msudenver.cs.team_four.models.Courses;
import edu.msudenver.cs.team_four.models.Professor;
import edu.msudenver.cs.team_four.models.ProfessorController;
import edu.msudenver.cs.team_four.models.ProfessorService;

public class ProfessorControllerTest {
	@Autowired
	static ProfessorController proContTest = new ProfessorController();
	@Autowired
	static ProfessorService proServ = new ProfessorService();
	
	@Test
	@RequestMapping(value="/professors", method=RequestMethod.POST)
	public void subTest() {
		Model model = null;
		Professor pro = new Professor("1234","Willis","lastName");
		assertEquals("professors", proContTest.professorSubmit(pro, model));
	}
	@Test
	@RequestMapping(value ="/professors", method = RequestMethod.GET)
	public void listTest() {
		Model model = null;
		Professor pro = new Professor("1234","Willis","lastName");
		proContTest.professorSubmit(pro, model);
		assertEquals("professors", proContTest.list(model));
	}
	@Test
	@RequestMapping(method=RequestMethod.POST, value="/deleteProfessor")
	public void deleteCourseTest() {
		Model model = null;
		Professor pro = new Professor("1234","Willis","lastName");
		proContTest.professorSubmit(pro, model);
		assertEquals("professors", proContTest.deleteProfessor("1234", model));
	}

}

