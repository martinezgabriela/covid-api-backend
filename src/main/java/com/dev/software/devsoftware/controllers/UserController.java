package com.dev.software.devsoftware.controllers;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dev.software.devsoftware.models.User;
import com.dev.software.devsoftware.models.api.HospitalList;
import com.dev.software.devsoftware.models.dto.UserDto;
import com.dev.software.devsoftware.repository.UserRepository;
import com.dev.software.devsoftware.service.UserService;

import javax.validation.Valid;

@Controller
//@RequestMapping(value="/api")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserService userService;

	@GetMapping({"/", "/welcome", "/index"})
	public String home() {
		return "login";
	}

	@PostMapping("/login")
	public String login(@Valid User user) {
		if(user.getEmail().isEmpty() && user.getSenha().isEmpty()) {
			return "login";
		}
		if(userRepository.findByEmail(user.getEmail())!=null) {
			return "redirect:/list-hospitals";
		}
		return "redirect:/registration";
	}

	@GetMapping({"/list-hospitals"})
	public String listHospitals() {
		return "list-hospitals";
	}

	@GetMapping("/registration")
	public String showSignUpForm() {
		return "registration";
	}

	@PostMapping("/registration")
	public String addUser(@Valid User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "registration";
		}

		userRepository.save(user);
		return "redirect:/index";
	}

/*
	// Login form with error
	@RequestMapping("/login-error.html")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login.html";
	}




*/
	//@PostMapping("/user")
	//public User saveUser(@RequestBody User user) {
	//	return userRepository.save(user);
	//}
/*
	@PostMapping(path = "/uservalidates")
	public String validatesUser(@RequestBody UserDto userDto) {
		String email = userDto.getEmail();
		if(userRepository.findByEmail(email)!=null) {
			return "redirect:/list-hospitals";
		}
		return "redirec:/index";
	}
	@GetMapping("/hospitais")
	public ResponseEntity<ArrayList<HospitalList>> getApiInfo(){
		ArrayList<HospitalList> response = userService.getDataApi();
		System.out.println(response);
		return ResponseEntity.ok(response);
	}
*/

}
