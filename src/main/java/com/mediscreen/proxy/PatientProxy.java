package com.mediscreen.proxy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.mediscreen.model.Patient;

@Component
public class PatientProxy {
	
	private static final Logger log = LogManager.getLogger(PatientProxy.class);

	/**
	 * Get a Patient by the id
	 * @param id The id of the Patient
	 * @return The Patient
	 */
	public Patient getPatient(int id) {
		String getPatientUrl = "http://localhost:8084/patients/" + id;

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Patient> response = restTemplate.exchange(
				getPatientUrl, 
				HttpMethod.GET, 
				null,
				Patient.class
			);
		
		log.debug("Get Patient : " + response.getStatusCode().toString());
		
		return response.getBody();
	}




}