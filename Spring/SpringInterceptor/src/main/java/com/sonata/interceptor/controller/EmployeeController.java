package com.sonata.interceptor.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping("/employee")
	public String getDetails() {
		return "Employee Details Fetched Successfully";
	}
}
