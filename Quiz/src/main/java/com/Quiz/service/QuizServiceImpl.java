package com.Quiz.service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Quiz.Repository.QuizRepository;
import com.Quiz.entity.Quiz;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	    private Questionclient questionclient;
	    private	QuizRepository quizRepository;
		
	    
		public QuizServiceImpl(QuizRepository quizRepository,Questionclient questionclient)
		{
			this.quizRepository=quizRepository;
			this.questionclient=questionclient;
		}
		
	
	
	
	@Override
	public Quiz add(Quiz quiz) {
		
		return quizRepository.save(quiz);
	}

	@Override
    public List<Quiz> get() {
		
		List<Quiz> quizs=(List<Quiz>) quizRepository.findAll();
		List<Quiz> newQuizlist=quizs.stream().map(quiz->{
			quiz.setQuestion(questionclient.getQuestionsofQuiz(quiz.getId()));
			return quiz;
		}).collect(Collectors.toList());
        return newQuizlist;
    }
	@Override
	public Quiz get(Long id) {
		
		Quiz quiz=quizRepository.findById(id).get();
		quiz.setQuestion(questionclient.getQuestionsofQuiz(quiz.getId()));
		return quiz;
	}

	public void delete(Long id) {
		 quizRepository.deleteById(id);
	}
	
}
