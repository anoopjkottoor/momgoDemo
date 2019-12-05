package com.anoop.mongoTest.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.anoop.mongoTest.model.institution;
import com.anoop.mongoTest.repo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping(value = "/test")
public class controller {
	@Autowired
	private repository resp;
	
	@RequestMapping(value="/ping")
	public String ping() {
		return "Welcome";
	}

	@RequestMapping(value = "/institution", method = RequestMethod.GET)
	public List<institution> getInsti() {
		System.out.println("Hello");
		return resp.findAll();

	}

	@RequestMapping(value = "/institutions", method = RequestMethod.POST)
	public void postInsti(@RequestBody institution insti) {
		System.out.println("HIII");
		resp.save(insti);
	}

}
