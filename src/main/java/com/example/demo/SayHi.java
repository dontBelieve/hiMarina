package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHi {

	@RequestMapping("hi")
	public String hi(String name){
		return "hi, " + name;
	}
}
