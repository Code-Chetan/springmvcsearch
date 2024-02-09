package springmvcsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcsearch.entity.Student;

@Controller
public class FormController {

	@RequestMapping(path = "/complex")
	public String showForm() {
		return "complex_form";
	}
	
	@RequestMapping(path = "/handleform",method = RequestMethod.POST)
	public String formHandle(@ModelAttribute("student12") Student student,BindingResult result,Model m) {
		
		if(result.hasErrors()) {
			return "complex_form";
		}
		
		System.out.println(student);
		m.addAttribute("student", student);
		return "success";
	}
}
