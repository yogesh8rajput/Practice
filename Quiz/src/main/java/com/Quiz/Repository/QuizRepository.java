package com.Quiz.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Quiz.entity.Quiz;

//import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;



public interface QuizRepository extends CrudRepository<Quiz,Long> {

}
