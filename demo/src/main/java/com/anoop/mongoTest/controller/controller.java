package com.anoop.mongoTest.controller;


import org.springframework.web.bind.annotation.RestController;

import com.anoop.mongoTest.model.institution;
import com.anoop.mongoTest.repo.repository;

import java.awt.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class controller {
	private final repository resp;
	
	public controller(repository r) {
		this.resp=r;
	}
	
	@RequestMapping(value="/institution")
	public String getInsti() {
		return resp.findAll().toString();
		
	}
	
	@RequestMapping(value="/institutions",method=RequestMethod.POST)
	public void postInsti(@RequestBody institution insti) {
		resp.save(insti);
	}
	
	
	

}
