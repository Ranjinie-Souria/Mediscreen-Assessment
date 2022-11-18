package com.mediscreen;

import java.util.ArrayList;
import java.util.List;

public class Triggers {
	
	public List<String> noteTriggers;

	public Triggers() {
		List<String> noteTriggers = new ArrayList<String>();
		noteTriggers.add("Hémoglobine A1C");
		noteTriggers.add("Microalbumine");
		noteTriggers.add("Taille");
		noteTriggers.add("Poids");
		noteTriggers.add("Fumeur");
		noteTriggers.add("Anormal");
		noteTriggers.add("Cholestérol");
		noteTriggers.add("Vertige");
		noteTriggers.add("Rechute");
		noteTriggers.add("Réaction");
		noteTriggers.add("Anticorps");
		this.noteTriggers = noteTriggers;
	}
	
	

}
