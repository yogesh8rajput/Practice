package com.Quiz.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Quiz.entity.Question;

@FeignClient(url = "http://localhost:8080",value = "Question-Client")
public interface Questionclient {

	
	@GetMapping("/Question/Quiz/{quizid}")
	public List<Question> getQuestionsofQuiz(@PathVariable Long quizid);
	
}
