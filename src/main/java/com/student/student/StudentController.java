package com.student.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller   

public class StudentController {
	@Autowired
	StudentRepository sr;
	@GetMapping ("/")
	public String newpage() {
		return "welcome";
	}
	/*   to get the form in  the view*/
	@GetMapping("form")
	public String showform(Model model)
	{
		model.addAttribute("student", new Student());
		return "studentform";
	}
	/*  save the form input and get the list*/
@PostMapping("/save")
public String formsubmit(@ModelAttribute Student st) {
	sr.save(st);
	return "redirect:/list";
}
// get all the list from the database 
@GetMapping("list")    
public String viewStudent(Model m) {
	List<Student> stlist = new ArrayList<>();
sr.findAll().forEach(stlist::add);
m.addAttribute("student",stlist);
return "showstudent";
	
}
//update student by id by which update form should be also generated
@RequestMapping("/updateStudent")     
public String updateStudent(@RequestParam ("id") int id,Model m) {
	m.addAttribute("student",sr.findById(id));
return "updateStudent";
	
}

//view the updated list 
@RequestMapping("/updateView")
public String getupdateView(@ModelAttribute ("e") Student e ) {
	sr.save(e);
	return "redirect:/list";
}
//delete the id and retrieve list 
@RequestMapping ("/deleteStudent")
public String deleteStudent(@RequestParam ("id") int id) {
sr.deleteById(id);
	return "redirect:/list";
	
}

	

}
