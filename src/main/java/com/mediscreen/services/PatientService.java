package com.mediscreen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mediscreen.model.Patient;
import com.mediscreen.proxy.PatientProxy;


@Service
public class PatientService {
	
	@Autowired
	private PatientProxy proxy;
	
	public Patient getPatient(int id) {
		return proxy.getPatient(id);
	}

	
	
	

}
