package com.pooja.thymleaf.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.pooja.thymleaf.model.UserForm;

@Controller
public class FormController {

	
	//  handle user registration page
	@GetMapping("/register")
	public String userRegistrationPage(Model model) {
		
		UserForm userForm = new UserForm();
		model.addAttribute("userForm", userForm);
		
		List<String> listProfession = Arrays.asList("Developer","Engineer", "HR","Architect");
		model.addAttribute("listProfession",listProfession);
		
		return "register-form";

		
	}
	
// handle USer Registration form submission
	@PostMapping("register/save")
	public String submitForm(Model model ,
			@ModelAttribute("userForm") UserForm userForm) {
		
		model.addAttribute("userForm", userForm);
		return "register-success";
		
	}
	
}
