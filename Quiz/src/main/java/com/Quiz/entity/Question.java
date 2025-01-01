package com.Quiz.entity;

import jakarta.persistence.Column;

public class Question {

	
	@Column(name = "Questionid")
	private Long id;
	@Column(name = "Questio")
	private String question;
	
	private Long quizid;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Long getQuizid() {
		return quizid;
	}

	public void setQuizid(Long quizid) {
		this.quizid = quizid;
	}
}
