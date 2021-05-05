package com.pp.limits.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pp.limits.vos.Limits;

@RestController
public class LimitsController {
	
	@GetMapping("/limits")
	public Limits retriveLimits() {
		return new Limits(3,1000);
	}
}
