package com.dev.software.devsoftware.controllers;


import com.dev.software.devsoftware.models.User;
import com.dev.software.devsoftware.repository.UserRepository;
import com.dev.software.devsoftware.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserService userService;

	@GetMapping({"/", "/welcome", "/index"})
	public String home() {
		return "login";
	}

	@RequestMapping("/login.html")
	public String showLoginForm() {
		return "login.html";
	}

	@RequestMapping("/login-error.html")
	public String loginFormWithError(Model model) {
		model.addAttribute("loginError", true);
		return "login.html";
	}

	@GetMapping("/registration")
	public String showSignUpForm() {
		return "registration";
	}

	@PostMapping("/registration")
	public String addUser(@Valid User user, Model model) {
		// validation

		userRepository.save(user);
		return "redirect:/index";
	}
/*


	@PostMapping("/login")
	public String tryToLogin(@Valid User user, BindingResult result) {
		//loginError

		//userValidationService.validateUser(user)
		if(userRepository.findByEmail(user.getEmail())!=null)){
			return "redirect:/list-hospitals";
		}

		return "redirect:/registration";
	}

	@GetMapping({"/list-hospitals"})
	public String listHospitals() {
		return "list-hospitals";
	}


	// Login form with error
	@RequestMapping("/login-error.html")
	public String loginError(Model model) {
		model.addAttribute("loginError", true);
		return "login.html";
	}





	//@PostMapping("/user")
	//public User saveUser(@RequestBody User user) {
	//	return userRepository.save(user);
	//}

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
