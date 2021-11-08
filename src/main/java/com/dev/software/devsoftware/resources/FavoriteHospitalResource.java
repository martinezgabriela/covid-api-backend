package com.dev.software.devsoftware.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.software.devsoftware.models.FavoriteHospital;
import com.dev.software.devsoftware.repository.FavoriteHospitalRepository;

@RestController
@RequestMapping(value="/api")
public class FavoriteHospitalResource {
	
	@Autowired
	FavoriteHospitalRepository favoriteHospitalRepository;
	
	@PostMapping("/favorite")
	public FavoriteHospital saveFavoriteHospital(@RequestBody FavoriteHospital favoriteHospital) {
		return favoriteHospitalRepository.save(favoriteHospital);
	}
	
	@DeleteMapping("/favorite/{id}")
	public void unfavoriteHospital(@PathVariable Long id) {
		favoriteHospitalRepository.deleteById(id);
	}

}
