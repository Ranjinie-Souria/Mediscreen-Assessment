package com.mediscreen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.mediscreen.model.Assessment;
import com.mediscreen.services.AssessmentService;


@Controller
public class AssessmentController {
	
	@Autowired
	AssessmentService Service;
	
	/**
	 * Show Assessment for the patient
	 * @return Assessment
	 */
	@GetMapping("/assessment/{id}")
    public Assessment getAssessmentForId(@PathVariable Integer id)
    {
		Assessment assessment = new Assessment();
    	
		return assessment;
    }
	

}
