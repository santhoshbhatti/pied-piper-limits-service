package com.pp.limits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pp.limits.config.Configuration;
import com.pp.limits.vos.Limits;

@RestController
public class LimitsController {
	
	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public Limits retriveLimits() {
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}
}
