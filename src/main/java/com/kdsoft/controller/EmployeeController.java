package com.kdsoft.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kdsoft.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/employee")
	public String openEmpPage() {
		return "ajaxemp";
	}

	@RequestMapping(value = "/employee/add", method = RequestMethod.POST)
	public @ResponseBody Employee add(HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		Employee employee = new Employee();

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");

		employee.setEmail(email);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);

		return employee;
	}

}
