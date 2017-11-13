package edu.msudenver.cs.team_four;

import java.sql.SQLException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeamFourApplication {
	
	public static void main(String[] args) throws SQLException {
		
		SpringApplication.run(TeamFourApplication.class, args);
	}
}
