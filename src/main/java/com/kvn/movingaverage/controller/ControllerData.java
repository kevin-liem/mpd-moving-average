package com.kvn.movingaverage.controller;

import com.kvn.movingaverage.DataContainer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerData {
	@GetMapping(value="/")
	public String userRequirement(Model model){
		return "/userview/ma-method";
	}
	
	@GetMapping(value="/userview/hasil")
	public String showResult(@RequestParam(value = "input_manual", required = false) String input_manual,
							 @RequestParam(value = "n_manual",required = false) String n_manual,
							 @RequestParam(value = "jml_n",required = false) Integer jml_n,
							 // Param in table
							 @RequestParam(value = "T_manual",required = false) String T_manual,
							 @RequestParam(value = "T", required = false) Integer T,
			Model model){

		// Check if user want to input manually
		if(input_manual != null){
			// Check if user want to input n manually
			if(n_manual != null){
				// Check if n value is inputed
				if(jml_n == null || jml_n <= 0){
					DataContainer.getInstance().getTimeSeriesData().setN(0);
				}
				// If it is inputed correctly then
				else {
					DataContainer.getInstance().getTimeSeriesData().setN(jml_n);
				}
			}
		}

		return "/userview/output";
	}
}