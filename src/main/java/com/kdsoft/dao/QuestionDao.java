package com.kdsoft.dao;

import java.util.List;

import com.kdsoft.model.Question;

public interface QuestionDao {

	Question getByQuestion_ID(int Question_ID);

	List<Question> getAllQuestion();

	int save(Question question);

	void update(Question question);

	void view(Question question);

	void delete(int Question_ID);

}
