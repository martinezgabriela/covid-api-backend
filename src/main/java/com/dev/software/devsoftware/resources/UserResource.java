package com.dev.software.devsoftware.resources;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.software.devsoftware.models.FavoriteHospital;
import com.dev.software.devsoftware.models.User;
import com.dev.software.devsoftware.models.api.ApiResponse;
import com.dev.software.devsoftware.models.api.HospitalList;
import com.dev.software.devsoftware.models.dto.UserDto;
import com.dev.software.devsoftware.repository.UserRepository;
import com.dev.software.devsoftware.service.UserService;


@RestController
@RequestMapping(value="/api")
public class UserResource {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserService userService;	
	
	
	@PostMapping("/user")
	public User saveUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@PostMapping(path = "/user/validates")
	public User validatesUser(@RequestBody UserDto userDto) {
		String email = userDto.getEmail();
		return userRepository.findByEmail(email);
	}
	
	@GetMapping("/hospitais")
	public ResponseEntity<ArrayList<HospitalList>> getApiInfo(){
		ArrayList<HospitalList> response = userService.getDataApi();
		return ResponseEntity.ok(response);
	}
	
	
	
	
	
	
	
}
