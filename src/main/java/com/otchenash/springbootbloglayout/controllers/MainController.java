package com.otchenash.springbootbloglayout.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Main page");
		return "home";
	}
	@GetMapping("/about")
	public String start(Model model) {
		model.addAttribute("title", "About Us page");
		return "about";
	}
}