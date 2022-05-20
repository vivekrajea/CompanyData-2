package com.expressanalytics.data;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	@RequestMapping("/hello")
	private String sayHI() {
		return "HI";
	}
}
