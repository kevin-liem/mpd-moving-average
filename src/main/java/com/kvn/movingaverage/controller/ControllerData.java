package com.kvn.movingaverage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerData {
	@GetMapping(value="/")
	public String userRequirement(Model model){
		return "/userview/ma-method";
	}
	
	@GetMapping(value="/userview/hasil")
	public String showResult(Model model){
		return "/userview/output";
	}
}