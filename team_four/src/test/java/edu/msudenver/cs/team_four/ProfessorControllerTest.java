package edu.msudenver.cs.team_four;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.msudenver.cs.team_four.models.CourseController;
import edu.msudenver.cs.team_four.models.CourseService;
import edu.msudenver.cs.team_four.models.Courses;
import edu.msudenver.cs.team_four.models.Professor;
import edu.msudenver.cs.team_four.models.ProfessorController;
import edu.msudenver.cs.team_four.models.ProfessorRepository;
import edu.msudenver.cs.team_four.models.ProfessorService;

public class ProfessorControllerTest {
	@Mock
	private ProfessorController proCont;
	@Mock
	private ProfessorService proServ;
	@Mock
	private ProfessorRepository proRepo;
	
	@Before
	public void setUpMock() {
		proCont = mock(ProfessorController.class);
		proServ = mock(ProfessorService.class);
		proRepo = mock(ProfessorRepository.class);
	}
	
	@Test
	@RequestMapping(value="/professors", method=RequestMethod.POST)
	public void subTest() {
		Model model = null;
		Professor pro = new Professor("1234","Willis","lastName");
		when(proCont.professorSubmit(pro, model)).thenReturn("professors");
		assertEquals("professors", proCont.professorSubmit(pro, model));
	}
	@Test
	@RequestMapping(value ="/professors", method = RequestMethod.GET)
	public void listTest() {
		Model model = null;
		Professor pro = new Professor("1234","Willis","lastName");
		proCont.professorSubmit(pro, model);
		when(proCont.list(model)).thenReturn("professors");
		assertEquals("professors", proCont.list(model));
	}
	@Test
	@RequestMapping(method=RequestMethod.POST, value="/deleteProfessor")
	public void deleteCourseTest() {
		Model model = null;
		Professor pro = new Professor("1234","Willis","lastName");
		proCont.professorSubmit(pro, model);
		when(proCont.deleteProfessor("1234", model)).thenReturn("professors");
		assertEquals("professors", proCont.deleteProfessor("1234", model));
	}

}

