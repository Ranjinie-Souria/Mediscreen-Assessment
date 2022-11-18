package com.mediscreen.services;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import org.springframework.beans.factory.annotation.Autowired;

import com.mediscreen.model.Patient;

public class AssessmentService {
	
	
	
	@Autowired
	PatientService pService;
	
	public int calculateAgeWithPatientId(Integer patientId) {
		Patient p = pService.getPatient(patientId);
		long millis=System.currentTimeMillis();  
		Date date = new java.sql.Date(millis); 
		LocalDate currentDate = date.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDate(); 
		LocalDate birthDate = p.getBirthdate().toInstant()
			      .atZone(ZoneId.systemDefault())
			      .toLocalDate(); 
		if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
	}
	


}
