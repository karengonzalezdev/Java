package com.pluralsight.conferencedemo.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {
	
	@Value("${app.version}")
	private String appVersion;
	
	@GetMapping
	@RequestMapping("/")
	public Map getStatus() {
		Map map = new HashMap<String, String>();
		map.put("app-version", appVersion);
		return map;
	}

}