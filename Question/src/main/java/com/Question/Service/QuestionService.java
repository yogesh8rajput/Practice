package com.Question.Service;

import java.util.List;
import java.util.Optional;

import com.Question.entity.Question;


public interface QuestionService {

	
	Question add(Question question);
	List<Question> get();
	Optional<Question> get(Long id);
	void delete(Long id);
	List<Question> QuestionofQuiz(Long quizid);
//	List<Question> getQuestionofQuiz(Long quizid);
	
}
