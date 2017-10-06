package edu.msudenver.cs.team_four.User.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LayoutController {
	
	public static String HEADER = 
			"<!DOCTYPE HTML>\r\n" + 
			"<html>\r\n" + 
			"	<head>\r\n" + 
			"		<title>MSU Denver</title>\r\n" + 
			"		<link rel=\"icon\" href=\"logo_handler.png\" />\r\n" + 
			"		<meta charset=\"utf-8\">\r\n" + 
			"  		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
			"	  	<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n" + 
			"  		<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n" + 
			"  		<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n" + 
			"	</head>\r\n" + 
			"	<body style=\"background-image: url(\'http://images.wisegeek.com/black-asphalt.jpg\')\">\r\n" + 
			"		<nav class=\"navbar navbar-inverse\">\r\n" + 
			"  			<div class=\"container-fluid\">\r\n" + 
			"    			<div class=\"navbar-header\">\r\n" + 
			"      				<a class=\"navbar-brand\" href=\"/\">MSU Denver</a>\r\n" + 
			"    			</div>\r\n" + 
			"    			<ul class=\"nav navbar-nav\">\r\n" + 
			"      				<li><a href=\"/Students\">Students</a></li>\r\n" + 
			"					<li><a href=\"/Professors\">Professors</a></li>\r\n" +
			"      				<li><a href=\"/Courses\">Courses</a></li>\r\n" + 
			"					<li><a href=\"/Sections\">Sections</a></li>\r\n" +
			"			    </ul>\r\n" + 
			"  			</div>\r\n" + 
			"		</nav>";
	public static String BODY = 
			"	</body>" +
			"</html>";
	
	@RequestMapping("/")
	public String home() {
		return HEADER + BODY;
	}

}