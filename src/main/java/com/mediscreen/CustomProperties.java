package com.mediscreen;



import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomProperties {

    private String apiPatient;
	public String getApiPatient() {
		return apiPatient;
	}
	public void setApiPatient(String apiPatient) {
		this.apiPatient = apiPatient;
	}
    
    

}