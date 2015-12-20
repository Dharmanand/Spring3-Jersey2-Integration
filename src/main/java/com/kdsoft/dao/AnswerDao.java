package com.kdsoft.dao;

import java.util.List;

import com.kdsoft.model.Answer;

public interface AnswerDao {

	Answer getByAnswer_ID(int Answer_ID);

	List<Answer> getAllAnswer();

	int save(Answer answer);

	void update(Answer answer);

	void view(Answer answer);

	void delete(int Answer_ID);

}
