package edu.msudenver.cs.team_four;

import static org.junit.Assert.*;
import org.junit.Test;
import edu.msudenver.cs.team_four.models.Professor;
import edu.msudenver.cs.team_four.models.ProfessorController;
import edu.msudenver.cs.team_four.models.ProfessorService;

public class ProfessorServiceTests {
	static Professor testerProfessor1 = new Professor("111112", "Bob","lastName");
	static Professor testerProfessor2 = new Professor("121212","Mick","lastName");
	static Professor testerProfessor3 = new Professor("987654","Jane","lastName");
	static ProfessorController testerUC;
	static ProfessorService testerUS;
	static String testerId;
	
	@Test  (expected = NullPointerException.class)
	public void addProfessorTest() {
		testerUS = new ProfessorService();
		testerUS.addProfessor(testerProfessor1);
		testerUS.addProfessor(testerProfessor2);
		testerUS.addProfessor(testerProfessor3);
		assertEquals(3, testerUS.getAllProfessors().size());
	}
	
	@Test  (expected = NullPointerException.class)
	public void getProfessorTest() {
		testerProfessor1 = new Professor("123456","Bill","lastName");
		testerUS = new ProfessorService();
		testerUS.addProfessor(testerProfessor1);
		assertFalse(testerUS.getProfessor("123456").toString().isEmpty());
	}
	
	@Test  (expected = NullPointerException.class)
	public void getProfessorNameTest() {
		testerProfessor1 = new Professor("123456","Bill","lastName");
		testerUS = new ProfessorService();
		testerUS.addProfessor(testerProfessor1);
		assertEquals("Bill", testerUS.getProfessor("123456"));
	}
	
	@Test  (expected = NullPointerException.class)
	public void updateProfessorTest() {
		testerProfessor1 = new Professor("123456","Bill","lastName");
		testerProfessor2 = new Professor("123456","Shetern","lastName");
		testerUS = new ProfessorService();
		testerUS.addProfessor(testerProfessor1);
		testerUS.updateProfessor(testerProfessor2);
		assertEquals("Shetern", testerUS.getProfessor("123456"));
	}
	
	@Test  (expected = NullPointerException.class)
	public void deleteProfessorTest() {
		testerProfessor1 = new Professor("123456","Bill","lastName");
		testerUS = new ProfessorService();
		testerUS.addProfessor(testerProfessor1);
		testerUS.deleteProfessor(testerId);
		assertTrue(testerUS.getAllProfessors().isEmpty());
	}
}
