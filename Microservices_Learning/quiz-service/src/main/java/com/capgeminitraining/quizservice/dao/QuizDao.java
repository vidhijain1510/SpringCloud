package com.capgeminitraining.quizservice.dao;


import com.capgeminitraining.quizservice.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
