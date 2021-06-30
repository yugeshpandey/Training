package com.cloudmandu.kbc.bank;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
	
	private List<String> questionsList;
	
	public QuestionsBank() {
		questionsList = new ArrayList<>();
		
		// TODO Auto-generated constructor stub
	}
	
	public List<String> getQuestionsList () {
		return questionsList;
		
		
	}
	
	public void setQuestionList (List<String> q) 	{
		questionsList = q;
	
	
	
	}
	
	public void addQuestion (String q) {
		questionsList.add(q);
	
		
		
	}

	public String getQuestion(int i) {
		return questionsList.get(i);
		
	}
	
	
}
