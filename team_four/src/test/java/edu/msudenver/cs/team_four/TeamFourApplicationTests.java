package edu.msudenver.cs.team_four;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TeamFourApplicationTests {

	@Test
	public void contextLoads() throws Exception{
	}
	
	@Test
	public void springAppTest() {
		TeamFourApplication.main(new String[] {
				"--spring.main.web-environment=false",
				"--spring.autoconfigure.exclude=this_little_teapot"
		});
	}

}
