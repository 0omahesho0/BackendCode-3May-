package com.sppu.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SppuController 
{
	@GetMapping ("/AdmissionData")
	public String getData()
	{
		return "Admission are Open Anytime..";
		
	}
}
