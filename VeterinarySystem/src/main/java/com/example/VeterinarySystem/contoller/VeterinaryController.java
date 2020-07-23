package com.example.VeterinarySystem.contoller;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.VeterinarySystem.entities.*;
import com.example.VeterinarySystem.repository.*;
import com.example.VeterinarySystem.service.PictureService;

@Controller
@RequestMapping("/recetas")
public class VeterinaryController {
	@Autowired
	private VeterinaryRepo repo;
	
	@Autowired
	PictureService picService;
	
	@RequestMapping("")
	public String index()
	{
		return "index";
	}
}
