package com.devops.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class DevopsController {
	@GetMapping(path="/msg")
	public String get()
	{
		return "Hello world";
	}
	

}
