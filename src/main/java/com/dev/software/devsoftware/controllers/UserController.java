package com.dev.software.devsoftware.controllers;


import com.dev.software.devsoftware.models.User;
import com.dev.software.devsoftware.models.dto.UserDto;
import com.dev.software.devsoftware.repository.UserRepository;
import com.dev.software.devsoftware.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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

	@GetMapping("/login")
	public String showLoginForm() {
		return "login";
	}

	@PostMapping("/login")
	public String tryToLogin(@Valid User user, Model model) {
		// procurar usuario no banco
		User userFound = userRepository.findByEmail(user.getEmail());

		// se usuário informado tiver email e senha compativeis
		if(userFound != null){
			// preparar usuário encontrado
			UserDto userDto = new UserDto();
			userDto.setEmail(userFound.getEmail());
			userDto.setSenha(userFound.getSenha());

			if(userDto.validate(user.getEmail(), user.getSenha())) {
				return "redirect:/list-hospitals";
			}
		}
		model.addAttribute("loginError", true);
		return "redirect:/login-error";
	}

	@GetMapping("/login-error")
	public String loginErrors(Model model) {
		model.addAttribute("loginError", true);
		return "login.html";
	}

	@GetMapping("/registration")
	public String showSignUpForm() {
		return "registration";
	}

	@PostMapping("/registration")
	public String addUser(@Valid User user, Model model) {
		// validation pode ser extraido depois
		if(user.getNome() != null && user.getEmail() != null && user.getSenha() != null){
			userRepository.save(user);

		}
		return "redirect:/index";
	}
/*




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
