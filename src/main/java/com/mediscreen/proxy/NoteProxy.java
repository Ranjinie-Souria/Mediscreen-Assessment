package com.mediscreen.proxy;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.mediscreen.model.Note;
@Component
public class NoteProxy {
	
	private static final Logger log = LogManager.getLogger(NoteProxy.class);
		
	/**
	 * Get all Notes for patient by the id
	 * @param id The id of the patient
	 * @return The notes
	 */
	public List<Note> getNotesForPatient(int id){
		String getNoteUrl = "http://localhost:8082/notes/patient/"+id;
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<Note>> response = restTemplate.exchange(
				getNoteUrl,
				HttpMethod.GET, 
				null,
				new ParameterizedTypeReference<List<Note>>() {}
			);
		
		log.debug("Get Notes for patient call " + response.getStatusCode().toString());

		return response.getBody();
	}

}