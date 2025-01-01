package com.Quiz.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Quiz.entity.Quiz;
import com.Quiz.service.QuizService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/Quiz")
public class QuizController {

	
	private QuizService quizService;
	
	public QuizController(QuizService quizService)
	{
		this.quizService=quizService;
	}
	
	@PostMapping("/")
	public Quiz create(@RequestBody Quiz quiz) {
		
		
		return quizService.add(quiz);
	}
	 @GetMapping("/")
	    public List<Quiz> get() {
	        return quizService.get();
	    }
	
	@GetMapping("/{id}")
	public Quiz get(@PathVariable Long id) {
	    return quizService.get(id);
	}
	@DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        quizService.delete(id);
    }

	
}
