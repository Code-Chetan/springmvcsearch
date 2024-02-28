package springmvcsearch.controller;

import java.io.File;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Controller1 {

	  @RequestMapping("/user/{userId}/{userName}") 
	  public String getUserDetail(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {
	 
	  System.out.println(userId);
	  System.out.println(userName);
	  
	  return "success"; 
	  }
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Going to return home.jsp");

		// We are trying to get error here intentionally for handling error.
		// This will throw an error and our custom error page will run.
		// We created Exception handler method downside to handle such errors.
	//	String s = null;
	//	System.out.println(s.length());

		return "home";
	}

	@RequestMapping(path = "/search", method = RequestMethod.GET)
	public RedirectView search(@RequestParam("querybox") String query, Model m) {

		String url = "https://www.google.com/search?q=" + query;

		RedirectView rv = new RedirectView();

		// Validating if query is blank or not
		if (query.isBlank()) {
			m.addAttribute("msg", query);
			String urlhome = "home";
			rv.setUrl(urlhome);
			return rv;
		}
		
		rv.setUrl(url);
		return rv;
	}

	//Below is the Exception handling method for NullPointerException
	@ExceptionHandler(value = NullPointerException.class)
	public String errorHandlerNull(Model m) {

		m.addAttribute("msg", "Null Pointer Exception has occured");
		return "exception_page";
	}

	//Below is the Exception handling method for NumberFormatException
	@ExceptionHandler(value = NumberFormatException.class)
	public String errorHandlerNumberFormat(Model m) {

		m.addAttribute("msg", "Null Pointer Exception has occured");
		return "exception_page";
	}
}
