package com.pooja.thymleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pooja.thymleaf.model.User;

@Controller
public class UserController {
	
	
	// Varibale-Expression
	
	@GetMapping("var-exp")
	public String varExp(Model model) {
	
		User user = new User("Pooja", "pooja@gmail.com",  "ADMIN", "Female");
		model.addAttribute("user", user);
		return "var-exp";
	}
	
	
	// handle Selection-expression
	
	@GetMapping("selection-expression")
	public String selectionExpression(Model model) {
		User user = new User("Swati", "swati@gmail.com", "Developer", "Female");
		model.addAttribute("user", user);
		return "selection-expression";
		
	}
	
	// handle Message-Expression
	
	
	@GetMapping("message-expression")
	
	public String messageExpression() {
		return "message-expression";
		
		
	}
	
	//handle Link-Expression
	@GetMapping("link-expression")
	public String linkExpression(Model model) {
		model.addAttribute("id", 1);
		return "link-expression";
	}
	
	
	// handle Fragment-expression
	@GetMapping("fragment-expression")
	public String fragmentExpression() {
		
		
		return "fragment-expression";
		
	}
	@GetMapping("/users")
	public String users(Model model) {
	    
	    User admin = new User("Admin", "admin@gmail.com", "ADMIN", "Male");
	    User aman = new User("Aman", "aman@gmail.com", "USER", "Male");
	    User divya = new User("Divya", "divya@gmail.com", "USER", "Female");

	   
	    List<User>users = new ArrayList<>();
	    users.add(admin);
	    users.add(aman);
	    users.add(divya);

	    model.addAttribute("users", users);

	    
	    return "users";  
	}
	
}
