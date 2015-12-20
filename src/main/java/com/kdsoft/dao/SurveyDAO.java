package com.kdsoft.dao;

import java.util.List;

import com.kdsoft.model.Survey;

public interface SurveyDAO {

	Survey getBySURVEY_ID(int SURVEY_ID);

	List<Survey> getAllSurvey();

	int save(Survey survey);

	void update(Survey survey);

	void view(Survey survey);

	void delete(int SURVEY_ID);

}
