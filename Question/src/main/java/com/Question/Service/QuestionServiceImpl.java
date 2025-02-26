package com.Question.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Question.Repository.QuestionRepository;
import com.Question.entity.Question;

@Service
public class QuestionServiceImpl implements QuestionService {

	
	private QuestionRepository questionRepository;
	
	@Autowired
	public QuestionServiceImpl(QuestionRepository questionRepository)
	{
		this.questionRepository=questionRepository;
	}

	@Override
	public Question add(Question question) {
		
		return questionRepository.save(question);
	}

	@Override
	public List<Question> get() {
		
		return questionRepository.findAll();
	}

	@Override
	public Optional<Question> get(Long id) {
		
		return questionRepository.findById(id);
	}

	@Override
	public void delete(Long id) {
		questionRepository.deleteById(id);
		
	}

	@Override
	public List<Question> QuestionofQuiz(Long quizid) {
		
		return questionRepository.findByQuizid(quizid);
	}
}
