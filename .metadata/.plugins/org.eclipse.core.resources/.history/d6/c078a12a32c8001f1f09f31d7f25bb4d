package com.Question.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Question.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {

//	Optional<Question> findAllById(Long id);

	Optional<Question> findById(Long id);

	void deleteById(Long id);
     
	List<Question> findByQuizid(Long quizid);
}
