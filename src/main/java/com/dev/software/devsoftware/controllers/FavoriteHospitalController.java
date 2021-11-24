package com.dev.software.devsoftware.controllers;

import com.dev.software.devsoftware.models.FavoriteHospital;
import com.dev.software.devsoftware.models.User;
import com.dev.software.devsoftware.models.api.Hospital;
import com.dev.software.devsoftware.models.api.HospitalList;
import com.dev.software.devsoftware.models.dto.HospitalsResponse;
import com.dev.software.devsoftware.repository.FavoriteHospitalRepository;
import com.dev.software.devsoftware.service.HospitalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FavoriteHospitalController {

	@Autowired
	FavoriteHospitalRepository favoriteHospitalRepository;

	@Autowired
	HospitalsService hospitalsService;

	@GetMapping({"/list-hospitals"})
	public String listAllHospitals(User user, Model model) {
		ArrayList<HospitalList> hospitals = hospitalsService.getDataApi();

		model.addAttribute("user", user);
		model.addAttribute("hospitals", hospitals);
		return "list-hospitals";
	}

	@PostMapping({"favorite-hospital"})
	public String addFavoriteHospital(@ModelAttribute(value="hospital") String hospital, RedirectAttributes redirectAttributes) {
		// validation pode ser extraido depois
		if(hospital != null){
			redirectAttributes.addFlashAttribute("hospital", hospital);
			return "redirect:/list-favorites";
		}
		return "/";
	}

	@GetMapping({"/list-favorites"})
	public String listHospitalsFavorited(Model model) {
		return "list-favorites";
	}
}
