package com.myjenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Myjenkinscontroller {
	@GetMapping("resistance")
	public String get() {
		return "bella ciao";
	}
	

}
