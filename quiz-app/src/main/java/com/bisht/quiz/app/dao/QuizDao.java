package com.bisht.quiz.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bisht.quiz.app.entities.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {

}
