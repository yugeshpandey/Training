package com.cloudmandu.kbc.bank;

import java.util.HashMap;
import java.util.Map;

public class Answers {

	private final Map<String, String[] > answerMap = new HashMap<>();
	
	public Answers() {
		
		answerMap.put(Questions.q1, new String[] {"linclon", "Washington","Trump","Obama","Trump"});
		answerMap.put(Questions.q2, new String[] {"Ram Varan", "Washington","Trump","Obama","Ram Varan"});
		answerMap.put(Questions.q3, new String[] {"Ram Baran", "h","mp","bama","Ram Baran"});
		answerMap.put(Questions.q4, new String[] {"nclon", "Washin","ump","Oama","Washin"});
		answerMap.put(Questions.q5, new String[] {"linclon", "Washington","Trump","Obama","Washington"});
		answerMap.put(Questions.q6, new String[] {"linclon", "Washington","Trump","Obama","Washington"});
		answerMap.put(Questions.q7, new String[] {"linclon", "Washington","Trump","Obama","Trump"});
		answerMap.put(Questions.q8, new String[] {"linclon", "Washington","Trump","Obama","Washington"});

		
	}
	
	public Map<String, String[] > getAnswerMap() {
		return answerMap;
		
	}
	
	public String[] getAnswer(String q) {
		return answerMap.get(q);
		
		
	}
	
	
	
}
/*

- Getters and Setters
- Method that takes a string and returns the corresponding values
- Method t





*/