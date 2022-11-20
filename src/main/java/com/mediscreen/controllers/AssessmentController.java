package com.mediscreen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mediscreen.model.Assessment;
import com.mediscreen.model.Patient;
import com.mediscreen.services.AssessmentService;
import com.mediscreen.services.PatientService;


@RestController
public class AssessmentController {
	
	@Autowired
	private AssessmentService aService;
	@Autowired
	private PatientService patientService;
	
	/**
	 * Show Assessment for the patient id
	 * @return assessment results
	 */
	@GetMapping("/assess/{id}")
    public String getAssessment(@PathVariable int id)
    {
		Patient p = patientService.getPatient(id);
		Assessment assessment = aService.getAssessmentForPatientId(p.getPatientId());
		String stringToReturn = "Patient: "+p.getFirstName()+" "+p.getFamilyName()+
				" (age "+assessment.getPatientAge()+
				") diabetes assessment is: "+assessment.getResult();
		return stringToReturn;
    }
	
}
