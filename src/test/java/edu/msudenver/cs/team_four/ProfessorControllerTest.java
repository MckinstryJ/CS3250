package edu.msudenver.cs.team_four;

import edu.msudenver.cs.team_four.models.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProfessorControllerTest {
	@Autowired
	private ProfessorController controller;
	
	@Autowired
	ProfessorRepository professorRepository;
	
	@Test
	public void testContextLoads() throws Exception{
		assertThat(controller).isNotNull();
		
	}
	
	@Test
	public void testGetAllProfessors() throws Exception{
	
	
	} 
}

