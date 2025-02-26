package com.Question.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Question {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "Questionid")
	private Long id;
	@Column(name = "Questio")
	private String question;
	
	private Long quizid;
	public Long getQuizid() {
		return quizid;
	}
	public void setQuizid(Long quizid) {
		this.quizid = quizid;
	}
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
}
