package com.kubiak.mycompany;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = "/springAngularJS", method = RequestMethod.GET)
	public @ResponseBody String getName() {
		String value="STe";
		return Tools.changeToLowerCase(value);
		
	}

}
