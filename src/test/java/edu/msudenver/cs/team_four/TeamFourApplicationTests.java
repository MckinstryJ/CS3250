package edu.msudenver.cs.team_four;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = TeamFourApplication.class)
public class TeamFourApplicationTests {

    @Test
    public void contextLoads() throws SQLException {
    	TeamFourApplication.main(new String[]{
                "--spring.main.web-environment=false"
        		});
    }
}