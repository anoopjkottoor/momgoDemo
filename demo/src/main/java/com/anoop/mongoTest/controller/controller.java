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
public class controller {
	@Autowired
	private repository resp;
	
	@RequestMapping(value="/institution")
	public List<institution> getInsti() {
		return resp.findAll();
		
	}
	
	@RequestMapping(value="/institutions",method=RequestMethod.POST)
	public void postInsti(@RequestBody institution insti) {
		resp.save(insti);
	}
	
	
	

}
