package com.Question.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Question.Service.QuestionService;
import com.Question.entity.Question;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/Question")

public class QuestionController {




	
	private QuestionService questionService;
	
	public QuestionController(QuestionService questionService)
	{
		this.questionService=questionService;
	}
	
	@PostMapping("/")
	public Question create(@RequestBody Question question) {
		
		
		return questionService.add(question);
	}
	 @GetMapping("/")
	    public List<Question> get() {
	        return questionService.get();
	    }
	
	@GetMapping("/{id}")
	public Optional<Question> get(@PathVariable Long id) {
	    return questionService.get(id);
	}
	@DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        questionService.delete(id);
    }
	
	@GetMapping("/Quiz/{quizid}")
	List<Question> getQuestionofQuiz(@PathVariable Long quizid) {
		
		return questionService.QuestionofQuiz(quizid);
	}
	

	
}
