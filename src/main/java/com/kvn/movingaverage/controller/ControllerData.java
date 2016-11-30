package com.kvn.movingaverage.controller;

import com.kvn.movingaverage.DataContainer;
import com.kvn.movingaverage.MovingAverageLogic;
import com.kvn.movingaverage.model.Data;
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
							 @RequestParam(value = "tvalue[]",required = false) Integer[] t,
							 @RequestParam(value = "dtvalue[]",required = false) Integer[] dt,
							 @RequestParam(value = "T_manual",required = false) String T_manual,
							 @RequestParam(value = "T", required = false) Integer T,
			Model model){

		// Check if user want to input manually
		if(input_manual != null){
			// Check if user want to input n manually
			if(n_manual != null){
				// Check if n value is not valid
				if(jml_n == null || jml_n <= 0){
                    // Flag it as null
                    // To be given default value at logic
					DataContainer.getInstance().getTimeSeriesData().setN(12);
					MovingAverageLogic.InputDefaultValue();
				}
				// If it is inputed correctly then
				else {
					DataContainer.getInstance().getTimeSeriesData().setN(jml_n);
					DataContainer.getInstance().getDaoData().getAll().clear();
					for (int i = 0; i < jml_n; i++){
						DataContainer.getInstance().getDaoData().save(new Data(t[i], dt[i]));
					}
				}
			}
			// If user want default value
			else {
                // Flag it as null
                // To be given default value at logic
				DataContainer.getInstance().getTimeSeriesData().setN(12);
                MovingAverageLogic.InputDefaultValue();
			}

			// Check if user want to see certain T table
			if(T_manual != null){
				// Check if T value is not valid
				if(T <= 1){
					// Gives default value which is null
					// It will be determined later with minimum value
					DataContainer.getInstance().getTimeSeriesData().setT(-1);
				}
				// If it is inputed correctly then
				else {
					DataContainer.getInstance().getTimeSeriesData().setT(T);
				}
			}
			// If user want default value
			else {
				// Gives default value which is null
				// It will be determined later with minimum value
				DataContainer.getInstance().getTimeSeriesData().setT(-1);
			}
		}
		// If user do not want to input manually
		else {
		    // Gives all default value
            MovingAverageLogic.InputDefaultValue();

            DataContainer.getInstance().getTimeSeriesData().setN(12);
            MovingAverageLogic.InputDefaultValue();

            DataContainer.getInstance().getTimeSeriesData().setT(-1);
        }

        model.addAttribute("datainput", DataContainer.getInstance().getDaoData().getAll());
		if(T == null){
		    model.addAttribute("Tdata", "x");
        }
        else {
            model.addAttribute("Tdata", T);
        }

        MovingAverageLogic maLog = new MovingAverageLogic();
//		maLog.CalculateDataSeries();
		return "/userview/output";
	}
}