package edu.msudenver.cs.team_four;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.msudenver.cs.team_four.models.Buildings;
import edu.msudenver.cs.team_four.models.Courses;
import edu.msudenver.cs.team_four.models.Professor;
import edu.msudenver.cs.team_four.models.Section;
import edu.msudenver.cs.team_four.models.Semester;

public class SemesterTests {
	//Semester Assets
		Long id = new Long("2018");
		Courses course = new Courses("Calculus 2", "Math", "2100", "4", "Learn Calculus 2","You Learn Calculus 2", "Calculus","N/A" );
		Professor professor = new Professor("X" , "Charles", "Xavier");
		Buildings building = new Buildings();
		Section section = new Section( course, 0001, professor, building, 120, "12:00");
		Semester semesterBuild = new Semester();
	//Section Assets
		Buildings building2 = new Buildings();
		Professor professor2 = new Professor("Pheonix", "Jean", "Gray");
		Courses course2 = new  Courses("Trigonometry", "Math","1400","4","Learn Trig", "You learn shapes and shit", "Algebra", "N/A");
		Long sectionId = new Long("0001");

	@Test
	public void startDateTest() {
		Semester tester = new Semester(section);
		tester.setStartDay(12);
		assertEquals(12,tester.getStartDay());
	}
	
	@Test
	public void endDateTest() {
		Semester tester = new Semester(section,"Spring 2018","January", 15 ,"May", 5);
		tester.setEndDay(12);
		assertEquals(12,tester.getEndDay());
	}
	
	@Test
	public void startMonthTest() {
		Semester tester = new Semester(section, "Spring 2018" ,"January", 15, "May", 5);
		tester.setStartMonth("February");
		assertEquals("February",tester.getStartMonth());
	}
	
	@Test
	public void endMonthTest() {
		Semester tester = new Semester(section, "Spring 2018" ,"January", 15, "May", 5);
		tester.setEndMonth("February");
		assertEquals("February",tester.getEndMonth());
	}
	
	@Test
	public void yearTest() {
		Semester tester = new Semester(section, id, "Spring" ,"January", 15, "May", 5);
		Long newId = new Long("2017");
		Long expected = new Long("2017");
		tester.setId(newId);
		assertEquals(expected,tester.getId());
	}
	
	@Test
	public void getNameTest() {
		Semester tester = new Semester(section, "Spring 2018" ,"January", 15, "May", 5);
		tester.setSemesterName("Fall 2018");
		assertEquals("Fall 2018",tester.getSemesterName());
	}
	
	@Test
	public void buildingTest() {
		section.setBuilding(building2);
		assertEquals(building2, section.getBuilding());
	}
	
	@Test
	public void roomNumberTest() {
		int newRoom = 140;
		section.setRoomNumber(newRoom);
		assertEquals(140, section.getRoomNumber());
	}
	
	@Test
	public void timeTest() {
		String newTime = "13:00";
		section.setTime(newTime);
		assertEquals("13:00", section.getTime());
	}
	@Test
	public void courseTest() {
		section.setCourse(course2);
		assertEquals(course2, section.getCourse());
	}
	@Test
	public void professorTest() {
		section.setProfessor(professor2);
		assertEquals(professor2, section.getProfessor());
	}
	@Test
	public void idTest() {
		section.setId(sectionId);
		Long expected = new Long("0001");
		assertEquals(expected, section.getId());
	}
	@Test
	public void sectionNumberTest() {
		int newNum = 3004;
		section.setSectionNumber(newNum);
		assertEquals(3004, section.getSectionNumber());
	}
}
