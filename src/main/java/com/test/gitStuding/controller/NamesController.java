package com.test.gitStuding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("names/")
public class NamesController {

	@GetMapping("/getNames")
	public String getNames() {
		return "My Name is Majid Soliman and this is for the Git Test!";
	}
}
