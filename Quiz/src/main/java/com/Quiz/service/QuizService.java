package com.Quiz.service;

import java.util.List;
import java.util.Optional;

import com.Quiz.entity.Quiz;

public interface QuizService {

	Quiz add(Quiz quiz);

	List<Quiz> get();

	Quiz get(Long id);

	void delete(Long id);
}
