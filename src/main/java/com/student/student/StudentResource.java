//package com.student.student;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class StudentResource {
//	@Autowired StudentRepository sr;
//	
//
//	//get all the list from the database 
//@GetMapping("list")
//public List<Student> viewStudent() {
//	List<Student> stlist = new ArrayList<>();
//sr.findAll().forEach(stlist::add);
//return stlist;
//}
//
///*  save the form input and get the list*/
//@PostMapping("/save")
//public void formsubmit(@RequestBody Student st) {
//sr.save(st);
//}
//
////view the updated list 
//@PutMapping("/update")
//public void getupdateView(@RequestBody Student st  ) {
//sr.save(st);
//
//}
//
//@DeleteMapping("/deleteStudent/{id}")
//public void deleteStudent(@PathVariable ("id") int id) {
//sr.deleteById(id);
//}
//	
//	
//
//
//
//
//}
//
//
