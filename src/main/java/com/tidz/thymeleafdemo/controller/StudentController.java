package com.tidz.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tidz.thymeleafdemo.model.Student;

@Controller
public class StudentController {

	@GetMapping("/showStudentForm")
	public String showForm(Model model) {
		Student student = new Student();

		model.addAttribute("student", student);
		return "student-form";
	}
}
