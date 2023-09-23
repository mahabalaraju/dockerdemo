package com.worker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@GetMapping("/dockerdemo")
	public String welcome() {
		return "welcome to new world of docker";
	}
}
