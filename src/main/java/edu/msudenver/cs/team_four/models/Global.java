package edu.msudenver.cs.team_four.models;

public class Global {
	public final static String schoolName = "Metropolitan State University";

	public static String creditHours(int cH) {
		String response = "";
		
		if(0 < cH && cH < 30){
			response = "Freshman";
		}
		else if(30 < cH && cH < 60){
			response = "Sophomore";
		}
		else if(60 < cH && cH < 90){
			response = "Junior";
		}
		else {
			response = "Senior";
		}
		return response;
	}
}