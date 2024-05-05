package com.bisht.quiz.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bisht.quiz.app.entities.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {

	List<Question> findByCategory(String category);
	@Query(value="Select * from question q where q.category=:category order by Random() LIMIT :numQ",nativeQuery=true)
	List<Question> findRandomQuestionsByCategory(String category,int numQ);
	
	
}
