package com.Quiz.entity;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;



@Entity

public class Quiz {

	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "Qid")
	private Long id;
	@Column(name = "Qtitle")
	private String title;
	transient
	private List<Question>question;
	
	public List<Question> getQuestion() {
		return question;
	}
	public void setQuestion(List<Question> question) {
		this.question = question;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
