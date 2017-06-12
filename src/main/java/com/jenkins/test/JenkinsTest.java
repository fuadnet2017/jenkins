package com.jenkins.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JenkinsTest {
	
	@RequestMapping("/welcome")
	public ModelAndView jenkinsAutomation() {
		
		System.out.println("Hello from controller");
		
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Jenkins Testing for build automation **********</div><br><br>";
		
		return new ModelAndView("welcome", "message", message);
	}
}
