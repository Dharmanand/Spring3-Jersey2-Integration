package com.kdsoft.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kdsoft.dao.SurveyDAO;
import com.kdsoft.model.Survey;

@Component
@Path(value = "/messages")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class MessageResource {

	@Autowired
	private SurveyDAO surveyDao;

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getText() {
		return "Hello World";
	}

	@GET
	@Path("/all")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<Survey> getAll() {
		return surveyDao.getAllSurvey();
	}
	
	@GET
	@Path("/allServey")
	public List<Survey> getAllSurvey() {
		return surveyDao.getAllSurvey();
	}

	@GET
	@Path("paths")
	public String getParamUsingAnnotations(
			@MatrixParam("param") String matrixParam,
			@HeaderParam("authoSessionId") String header,
			@CookieParam("name") String cookie) {
		return "@MatrixParam: " + matrixParam + " @HeaderParam: " + header
				+ " @CookieParam: " + cookie;
	}

}
